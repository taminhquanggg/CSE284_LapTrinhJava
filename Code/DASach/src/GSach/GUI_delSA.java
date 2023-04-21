package GSach;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_delSA extends JFrame {

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	static ArrayList<Sach> _listSach = new ArrayList<Sach>();
	XLSach _xlSach = new XLSach();
	private JPanel contentPane;
	private JComboBox cbNamXB;
	DefaultTableModel model;
	JTable tableSach = new JTable();
	
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					GUI_delSA frame = new GUI_delSA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void loadData(ResultSet rs) {
		try {
			ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
			int q = stData.getColumnCount();
			
			DefaultTableModel RecordTable = (DefaultTableModel)tableSach.getModel();
			RecordTable.setRowCount(0);
			
			while (rs.next()) {
				Vector columnData = new Vector();
				Sach _sach = new Sach(rs.getInt("MaS"), rs.getString("TenS"), rs.getInt("NamXB"), rs.getInt("GiaB"));
				
				for (int i=1; i<=q; i++) {
					columnData.add(_sach.getMaS());
					columnData.add(_sach.getTenS());
					columnData.add(_sach.getNamXB());
					columnData.add(_sach.getGiaB());
					columnData.add(_sach.ThanhTien());
					
				}
				RecordTable.addRow(columnData);
			}
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		
	}
	
	void loadDataEvent() {
		if (cbNamXB.getSelectedItem().toString() != "----Tất cả----") {
			ResultSet rs = null;
			try {
				rs = _xlSach.getSA(cbNamXB.getSelectedItem().toString());
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e1);
			}
			loadData(rs);
		}
		else {
			ResultSet rs = null;
			try {
				rs = _xlSach.getSA();
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e1);
			}
			loadData(rs);
		}
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public GUI_delSA() throws SQLException {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				if (cbNamXB.getSelectedItem().toString() == "----Tất cả----") {
					ResultSet rs = null;
					try {
						rs = _xlSach.getSA();
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, e1);
					}
					loadData(rs);
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		cbNamXB = new JComboBox();
		cbNamXB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				loadDataEvent();
			}
		});
		
		cbNamXB.addItem("----Tất cả----");
		cbNamXB.addItem("2019");
		cbNamXB.addItem("2020");
		cbNamXB.addItem("2021");
		GridBagConstraints gbc_cbNamXB = new GridBagConstraints();
		gbc_cbNamXB.insets = new Insets(0, 0, 5, 5);
		gbc_cbNamXB.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbNamXB.gridx = 0;
		gbc_cbNamXB.gridy = 0;
		contentPane.add(cbNamXB, gbc_cbNamXB);
		
		JButton btnDel = new JButton("Xóa sách");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (cbNamXB.getSelectedItem().toString() == "----Tất cả----") {
					JOptionPane.showMessageDialog(null, "Hãy chọn năm cần xóa");
				}
				else {
					int dialogResult = JOptionPane.showConfirmDialog (null, 
							"Bạn có muốn xóa toàn bộ sách năm " + cbNamXB.getSelectedItem().toString() + " không ?",
							"Thông báo",JOptionPane.OK_CANCEL_OPTION);
					if(dialogResult == JOptionPane.YES_OPTION){
						try {
							boolean delSA = _xlSach.deleteSA(cbNamXB.getSelectedItem().toString());
							if (delSA) {
								JOptionPane.showMessageDialog(null, "Xóa thành công!");
								loadDataEvent();
							}
							else {
								JOptionPane.showMessageDialog(null, "Xóa không thành công!");
								loadDataEvent();
							}
						} catch (SQLException e1) {
							JOptionPane.showMessageDialog(null, e1);
						}
					}
				}
			}
		});
		GridBagConstraints gbc_btnDel = new GridBagConstraints();
		gbc_btnDel.insets = new Insets(0, 0, 5, 0);
		gbc_btnDel.gridx = 1;
		gbc_btnDel.gridy = 0;
		contentPane.add(btnDel, gbc_btnDel);
		
//		String[] columnNames = {"Mã sách", "Tên sách", "Năm xuất bản", "Giá bán", "Thành tiền"};
//		_listSach = _xlSach.getSA();
//		Object[] data = _listSach.toArray();
		
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		
		tableSach.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 s\u00E1ch", "T\u00EAn s\u00E1ch", "NXB", "Gi\u00E1 b\u00E1n", "Th\u00E0nh ti\u1EC1n"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
		tableSach.setDefaultEditor(Object.class, null);
		tableSach.setBackground(Color.LIGHT_GRAY);
		model = new DefaultTableModel();
		scrollPane.setViewportView(tableSach);
	}

}
