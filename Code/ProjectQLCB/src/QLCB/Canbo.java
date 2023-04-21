package QLCB;

public class Canbo {
	private String SoTK;
	private String Hoten;
	private String GT;
	private String Diachi;
	private int Luong;
	
	public Canbo() {
		
	}
	
	public Canbo(String soTK, String hoten, String gT, String diachi, int luong) {
		SoTK = soTK;
		Hoten = hoten;
		GT = gT;
		Diachi = diachi;
		Luong = luong;
	}

	public String getSoTK() {
		return SoTK;
	}
	public void setSoTK(String soTK) {
		SoTK = soTK;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getGT() {
		return GT;
	}
	public void setGT(String gT) {
		GT = gT;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
}
