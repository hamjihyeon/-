import java.util.Scanner;

public class eng_kor {

	public static void main(String[] args) {
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("영어단어를 입력하세요>>");
			String s = sc.nextLine();
			if(s.contentEquals("exit"))
				break;
			
			int i;
			for(i = 0; i<eng.length; i++) {
				if(eng[i].equals(s)) {
					System.out.println(kor[i]);
					break;
				}
			}
			if(i==eng.length)
				System.out.println("그런 영어 단어가 없습니다.");
		}
		sc.close();

	}

}
