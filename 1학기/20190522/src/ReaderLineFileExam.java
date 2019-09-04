import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderLineFileExam {

	public static void main(String[] args) {
		
		FileReader fr;
		try {
			fr = new FileReader("src/dataw.txt");
			BufferedReader br = new BufferedReader(fr);
			//한줄로 읽어오기
			String s;
			try {
				while((s = br.readLine()) != null) {
					System.out.println(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
