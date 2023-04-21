package GSach;

import java.awt.EventQueue;
import java.sql.*;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_delSA extends JFrame {

	private JPanel contentPane;
	private JTable tableSach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
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
	
	void LoadData(ResultSet rs) {
		try {
			ResultSetMetaData rsMeta = (ResultSetMetaData) rs.getMetaData();
			int q = rsMeta.getColumnCount();
			DefaultTableModel model = (DefaultTableModel)tableSach.getModel();
			model.setRowCount(0);
			
			while (rs.next()) {
				Vector columnData = new Vector();
				Sach _sach = new Sach(rs.getInt("MaS"), rs.getString("TenS"), rs.getInt("NamXB"), rs.getInt("GiaB"));
				for (int i=1; i<=q; i++) {
					columnData.add(_sach.getMaS());
					columnData.add(_sach.getTenS());
					columnData.add(_sach.getNamXB());
					columnData.add(_sach.getGiaB());
					columnData.add(_sach.Thanhtien());
					
				}
				model.addRow(columnData);
			}
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Lỗi " + ex.getMessage());
		}
	}
	
	void LoadDataEvent() {
		XLSach _xlSach = new XLSach();
		_xlSach.getCon();
		LoadData(_xlSach.getSA());
	}
	
	int delSA(String _namXB) {
		XLSach _xlSach = new XLSach();
		return _xlSach.deleteSA(_namXB);
	}
	

	/**
	 * Create the frame.
	 */
	public GUI_delSA() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				LoadDataEvent();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbNamXB = new JComboBox();
		cbNamXB.setModel(new DefaultComboBoxModel(new String[] {"2019", "2020", "2021"}));
		cbNamXB.setBounds(10, 11, 172, 22);
		contentPane.add(cbNamXB);
		
		JButton btnDelS = new JButton("Xóa sách");
		btnDelS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int dialog = JOptionPane.showConfirmDialog(null, 
						"Bạn có muốn xóa tất cả sách năm " + cbNamXB.getSelectedItem().toString() + " không?",
						"Thông báo", JOptionPane.OK_CANCEL_OPTION);
				if (dialog == JOptionPane.OK_OPTION) {
					int del = delSA(cbNamXB.getSelectedItem().toString());
					JOptionPane.showMessageDialog(null, "Xóa thành công " + del + " sách");
					LoadDataEvent();
				}
				
			}
		});
		btnDelS.setBounds(192, 11, 89, 23);
		contentPane.add(btnDelS);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 465, 232);
		contentPane.add(scrollPane);
		
		tableSach = new JTable();
		scrollPane.setViewportView(tableSach);
		tableSach.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 s\u00E1ch", "T\u00EAn s\u00E1ch", "N\u0103m xu\u1EA5t b\u1EA3n", "Gi\u00E1 b\u00E1n", "Th\u00E0nh ti\u1EC1n"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Object.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableSach.getColumnModel().getColumn(2).setPreferredWidth(162);
	}
}
