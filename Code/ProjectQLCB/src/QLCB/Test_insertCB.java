package QLCB;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test_insertCB {
	
	
	
	static void doInsertCB(Canbo _canbo) throws SQLException {
		QLCB _qlcb = new QLCB();
		if (_qlcb.insertCB(_qlcb.getCon(), _canbo)) {
			System.out.println("Thêm thành công");
		}
		else {
			System.out.println("Thêm không thành công");
		}
	}
	
	public static void main(String[] args) throws SQLException {
		Canbo _canbo = new Canbo();
		String _STK, _Hoten, _GT, _Diachi;
		int _luong;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhập thông tin cán bộ:");
			System.out.println("Nhập số tài khoản: ");
			_STK = sc.nextLine();
			_canbo.setSoTK(_STK);
			System.out.println("Nhập họ tên: ");
			_Hoten = sc.nextLine();
			_canbo.setHoten(_Hoten);
			System.out.println("Nhập giới tính: ");
			_GT = sc.nextLine();
			_canbo.setGT(_GT);
			System.out.println("Nhập địa chỉ: ");
			_Diachi = sc.nextLine();
			_canbo.setDiachi(_Diachi);
			System.out.println("Nhập lương: ");
			_luong = sc.nextInt();
			_canbo.setLuong(_luong);
		}
		doInsertCB(_canbo);
	}
}
