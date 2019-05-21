
public class car {

			String company = "KIA";
			String name = "corog";
			String color = "white";
			String a = "200km";
			String b = "120km";
			
		public static void main(String[] args) {
			car c = new car();
			System.out.println("제작회사>> " + c.company);
			System.out.println("모델명>> " + c.name);
			System.out.println("색상>> " + c.color);
			System.out.println("최고속도>> " + c.a);
			System.out.println("현재속도>> " + c.b);
	}

}
