package implicit;

public class Test {

	public static void main(String[] args) {
		{
		int i=200;
			//automatic type conversion 
		long l=i;
		//automation type conversion 
		float f=i;
		System.out.println("Int value"+i);
		System.out.println("Long value"+l);
		System.out.println("Float value"+f);
		}

	}

}
