
public class Father extends GrandFa {

	private int nai = 55;
	private int house = 1;
	public String gabo = "황금돼지";

	public Father() {
		super();
		System.out.println("아버지 생성자");
	}

	public Father(int nai) {
		System.out.println("아버지 생성자");
		this.nai = nai;
	}

	public int getNai() {
		return nai;
	}

	public int getHouse() {
		return house;
	}
	
	public String say() {
		return null;
	}

}
