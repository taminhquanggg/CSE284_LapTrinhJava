package GSach;

public class Sach extends Tailieu{
	private int NamXB;
	private int GiaB;
	
	public Sach() {
		super();
	}
	
	public Sach(int maS, String tenS, int namXB, int giaB) {
		super(maS, tenS);
		NamXB = namXB;
		GiaB = giaB;
	}
	
	public int getNamXB() {
		return NamXB;
	}

	public void setNamXB(int namXB) {
		NamXB = namXB;
	}
	
	public int getGiaB() {
		return GiaB;
	}

	public void setGiaB(int giaB) {
		GiaB = giaB;
	}
	
	@Override
	public double ThanhTien() {
		if (this.getNamXB()<2015) {
			return this.getGiaB() * 85 /100;
		}
		else {
			return this.getGiaB() * 95 /100;
		}
	}
	
}
