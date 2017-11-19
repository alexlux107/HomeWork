package HW2;

public class Triangle {
	private double aSide;
    private double bSide;
    private double cSide;
    
	public Triangle(double aSide, double bSide, double cSide) {
		super();
		this.aSide = aSide;
		this.bSide = bSide;
		this.cSide = cSide;
	}
	public void areaTriangle() {
		if(aSide > (bSide + cSide) 
		|| bSide > (aSide + cSide) 
		|| cSide > (aSide + bSide)) {
			System.out.println("It is not a triangle");
		}
		else {
			double p = (aSide + bSide + cSide) / 2;
			double area = Math.sqrt(p * (p - aSide) * (p - bSide) * (p - cSide));
			System.out.println("Area of a triangle: " + area);
		}
	}

	public double getaSide() {
		return aSide;
	}

	public void setaSide(double aSide) {
		this.aSide = aSide;
	}

	public double getbSide() {
		return bSide;
	}

	public void setbSide(double bSide) {
		this.bSide = bSide;
	}

	public double getcSide() {
		return cSide;
	}

	public void setcSide(double cSide) {
		this.cSide = cSide;
	}

}
