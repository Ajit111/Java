package JAVA_Program.JAVA_Program;

/**
 * Hello world!
 *
 */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}

public class App {
	public static void main(String[] args) {
		String originalStr="Ajit";
		String revStr="";
		
		for (int i=0;i<originalStr.length();i++) {
			revStr=originalStr.charAt(i)+revStr;
			
		}
		System.out.println(revStr);
	}
}


