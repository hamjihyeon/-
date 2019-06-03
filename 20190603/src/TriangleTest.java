
public class TriangleTest {

	double height;
	double base;
	double area;

	public TriangleTest(double height, double base) {
		this.height = height;
		this.base = base;
	}

	public double findArea() {
		area = height*base/2;
		return area;
	}
	
	public double getheight() {
		return height;
	}
	
	public double getbase() {
		return base;
	}
	
	
	public static void main(String[] args) {
		TriangleTest t1 = new TriangleTest(10.0, 5.0);
		System.out.println("삼각형의 넓이: " + t1.findArea());

	}

}
