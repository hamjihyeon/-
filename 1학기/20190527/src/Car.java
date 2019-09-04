
public class Car {

	private String color;
	private int speed;
	private int gear;
	
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	public static void main(String[] args) {

		Car c = new Car();
		c.color = "Red";
		c.speed = 200;
		c.gear = 3;
		System.out.println("자동차의 색상>>" +c.color);
		System.out.println("자동차의 속도>>" +c.speed);
		System.out.println("자동차의 기어의 상태>>" +c.gear);
		
	}

}
