package GSach;

public class Sach extends Tailieu {

	protected int NamXB;
	protected int GiaB;

	public Sach() {
		super();
		NamXB = 2022;
		GiaB = 0;
	}

	public Sach(int maS, String tenS,int namXB, int giaB) {
		super(maS, tenS);
		NamXB = namXB;
		GiaB = giaB;
		// TODO Auto-generated constructor stub
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
		if (NamXB<2015) {
			return GiaB * 85 / 100;
		}
		else {
			return GiaB * 95 / 100;
		}
	}
	
}
