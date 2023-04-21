package Exam;

import java.awt.EventQueue;
import java.sql.*;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField radius;
	private JTextField height;
	private JTextField area;
	private JTextField volumn;
	private JTable table;
	private Connection con = null;
	private String DB_URL = "jdbc:mysql://localhost:3306/taminhquang_db";
	private String DB_USERNAME = "root";
	private String DB_PASSWORD = "";
	String _id = "";
	Cylinder _cylinder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	ResultSet getCylinder(Connection conn) throws SQLException {
		ResultSet rs = null;
		Statement stmt = conn.createStatement();
		rs = stmt.executeQuery("Select * from tbCylinder");
		return rs;
	}
	
	void LoadData(ResultSet rs) {
		try {
			ResultSetMetaData rsData = (ResultSetMetaData) rs.getMetaData();
			int q = rsData.getColumnCount();
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0);
			
			while (rs.next()) {
				Vector data = new Vector();
				Cylinder _cylinder = new Cylinder(rs.getDouble("radius"), rs.getDouble("height"));
				
				for (int i=1; i<=q; i++) {
					data.add(rs.getInt("id"));
					data.add(_cylinder.getRadius());
					data.add(rs.getString("color"));
					data.add(_cylinder.getHeight());
				}
				model.addRow(data);
			}
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}
	
	void LoadDataEvent() throws SQLException {
		ResultSet rs = null;
		rs = getCylinder(con);
		LoadData(rs);
	}
	
	public int deleteSA(String _id) {
		int q = 0;
		try {
			Statement stmt = con.createStatement();
			q = stmt.executeUpdate("delete from tbCylinder where id = '" + _id +"'");
		}
		catch (Exception ex) {
			System.out.print("deleteSA " + ex.getMessage());
		}
		return q;
	}
	
	void setID(String id) {
		this._id = id;
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					LoadDataEvent();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Lỗi " + ex.getMessage());
				}
			}
		});
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Connect error!" + ex.getMessage());
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		radius = new JTextField();
		radius.setBounds(54, 11, 86, 20);
		contentPane.add(radius);
		radius.setColumns(10);
		
		height = new JTextField();
		height.setBounds(54, 42, 86, 20);
		contentPane.add(height);
		height.setColumns(10);
		
		area = new JTextField();
		area.setBounds(54, 73, 86, 20);
		contentPane.add(area);
		area.setColumns(10);
		
		volumn = new JTextField();
		volumn.setBounds(54, 104, 86, 20);
		contentPane.add(volumn);
		volumn.setColumns(10);
		
		JComboBox color = new JComboBox();
		color.setModel(new DefaultComboBoxModel(new String[] {"red", "gree", "blue", "yellow", "pink"}));
		color.setBounds(54, 141, 86, 20);
		contentPane.add(color);
		
		JLabel lbToString = new JLabel("");
		lbToString.setBounds(28, 188, 770, 52);
		contentPane.add(lbToString);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(297, 11, 501, 166);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int r = table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String _idt = model.getValueAt(r, 0).toString();
				setID(_idt);
				String _radius = model.getValueAt(r, 1).toString();
				String _color = model.getValueAt(r, 2).toString();
				String _height = model.getValueAt(r, 3).toString();
				
				_cylinder = new Cylinder((Double)model.getValueAt(r, 1), (Double)model.getValueAt(r, 3));
				double _area = _cylinder.getArea();
				
				
				radius.setText(_radius);
				if (_color == "red") {
					color.setSelectedIndex(0);
				}
				else if (_color =="gree") {
					color.setSelectedIndex(1);
				}
				else if (_color =="blue") {
					color.setSelectedIndex(2);
				}
				else if (_color =="yellow") {
					color.setSelectedIndex(3);
				}
				else if (_color =="pink") {
					color.setSelectedIndex(4);
				}
				
				height.setText(_height);
				
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "radius", "color", "height"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Double.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		
		
		JButton btnDel = new JButton("Xóa");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteSA(_id);
				lbToString.setText(_cylinder.toString());
				try {
					LoadDataEvent();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Lỗi " + ex.getMessage());
				}
				
			}
		});
		btnDel.setBounds(178, 10, 89, 23);
		contentPane.add(btnDel);
	}
}
