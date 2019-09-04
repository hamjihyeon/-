import java.io.FileNotFoundException;
import java.io.FileReader;

public class p159_FileExam {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("text.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
