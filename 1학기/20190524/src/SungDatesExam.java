import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SungDatesExam {

	public static void main(String[] args) {

		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			BufferedReader br = new BufferedReader(fr);
			String csvStr = "";
			String tmpStr = "";
			while((tmpStr = br.readLine()) != null) {
				csvStr += tmpStr + "\t";
			}
//			System.out.println(csvStr);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			int length = parse.countTokens() / 4;
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			for(int i = 0; i< length; i++) {
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				math[i] = Double.parseDouble(parse.nextToken());
				english[i] = Double.parseDouble(parse.nextToken());
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2;
			}
			for(int i = 0; i<length; i++) {
				System.out.println("이름: " + name[i]+", "+ " 주소: " + address[i]+", "+ " 수학: "
						+math[i]+", "+ " 영어: "+english[i]+", "+ " 총점: "+total[i]+", "+" 평균: "+avg[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
