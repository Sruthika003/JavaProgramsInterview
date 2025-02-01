package basicsProgram;

public class CompareTwoObjects {

	public static void main(String[] args) {
	 
		String s1 = new String ("java");
		String s2 = new String("java");
		String s3 = new String(" java");
		
if(s1.equals(s2)) {
	System.out.println("s1 and s2 objects are equal");
}else {
	System.out.println(" s1 and s2 not equal");
}
if(s1.equals(s3)) {
	System.out.println("s1 and s3  objects are equal");
}else {
	System.out.println("s1 and s3 not equal");
}
	}

}
