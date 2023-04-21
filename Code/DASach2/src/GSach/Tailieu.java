package GSach;

public abstract class Tailieu {
	protected int MaS;
	protected String TenS;
	
	public Tailieu() {
//		MaS = 1;
//		TenS = "Sach 1";
	}

	public Tailieu(int maS, String tenS) {
		MaS = maS;
		TenS = tenS;
	}

	public int getMaS() {
		return MaS;
	}
	
	public void setMaS(int maS) {
		MaS = maS;
	}
	
	public String getTenS() {
		return TenS;
	}
	
	public void setTenS(String tenS) {
		TenS = tenS;
	}

	public abstract double ThanhTien();
	
}
