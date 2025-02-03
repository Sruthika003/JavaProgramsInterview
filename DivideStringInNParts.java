package stringsProgram;

public class DivideStringInNParts {

	public static void main(String[] args) {
		String s = "aaaabbbbccccdddd";
		int len = s.length();
		int n =4;
		int chars = len/n;
		int temp =0;
	String[] equalStr =  new String[n];
	if(len%n != 0) {
		System.out.println("can't divide equal parts");
	}else {
		for(int i =0; i<len; i = i +chars) {
			String str = s.substring(i, i+chars);
			 equalStr[temp] = str;
			 temp++;
			
		}		}
        for(int i =0; i<equalStr.length; i++) {
        	System.out.println(equalStr[i]);
        }
	}

}
