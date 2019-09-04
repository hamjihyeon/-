
public class FieldInitValue {

		// 필드
		byte byteField;
		short shortField;
		int intField;
		long longField;
		
		boolean booleanField;
		char charField;
		
		float floatField;
		double doubleField;
		
		int[] arrField;
		String referenceField;


		public static void main(String[] args) {
			FieldInitValue f = new FieldInitValue();
			System.out.println(f.byteField);
			System.out.println(f.shortField);
			System.out.println(f.intField);
			System.out.println(f.booleanField);
			System.out.println(f.charField);
			System.out.println(f.floatField);
			System.out.println(f.doubleField);
			System.out.println(f.arrField);
			System.out.println(f.referenceField);
			
	}

}
