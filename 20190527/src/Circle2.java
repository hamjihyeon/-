
public class Circle2 {

	private String color;
	private int n;
	
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		n = n;
	}
	
	
	public static void main(String[] args) {

		Circle2 c2 = new Circle2();
		c2.color = "RED";
		c2.n = 50;
		System.out.println("원의 색상>> " +c2.color);
		System.out.println("원의 반경>> " +c2.n);
	}

}
