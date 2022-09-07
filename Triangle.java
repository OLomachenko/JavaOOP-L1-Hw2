package homework2;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(Double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Triangle() {
		super();
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public void calculation() {
		if (triangleCalc(sideA, sideB, sideC) == 0)
			System.out.println("Triangle doesn't exist!");
		else {
			String result = String.format("%.2f", triangleCalc(sideA, sideB, sideC));
			System.out.println("Triangle area is: " + result);
		}
	}

	public double triangleCalc(double a, double b, double c) {
		double p = (a + b + c) / 2;
		double s;

		if ((a + b) > c && b + c > a && a + c > b) {
			s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			return s;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Triangle: Side A = " + sideA + "; Side B = " + sideB + "; Side C = " + sideC;
	}

}
