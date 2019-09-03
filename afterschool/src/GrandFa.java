
public class GrandFa {
	// 정보은닉(정당한 관한을 갖고 있는 사람이 정보를 허용할 수 있게 하는 것)
	// 정보은닉 = 캡슐화
	// 정보은닉 -> 클래스 -> 캡슐화

	private int nai = 80;
	public String gabo = "상감청자";
	protected String gahun = "모든 일에 최선을";

//	public GrandFa() {	//없으면 자동으로 만들어줌
//
//	}

	public GrandFa() {
		super();
		System.out.println("할아버지 생성자");
	}
	
	public GrandFa(int nai) {
		super();
		System.out.println("할아버지 생성자");
		this.nai = nai;
	}
	
	public String say() {
		return "할아버지 말씀 : 어려울 수록 즐겨라";
	}
	
	public String eat() {
		return "밥은 맛있게";
	}

	public int getNai() {
		return nai;

	}

}
