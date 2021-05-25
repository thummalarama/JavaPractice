package javacodes;

public class RemoveDigits {

	public static void main(String[] args) {

String string= "x12y45z67";

String result=" ";

for(int i=0;i<string.length();i++) {
	if(!Character.isDigit(string.charAt(i))) {
		result=result+string.charAt(i);
		
	}

}

System.out.println(result);

		
		
	}

}
