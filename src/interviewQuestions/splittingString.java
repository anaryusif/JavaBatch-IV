package interviewQuestions;

public class splittingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="hello, hi, bye";
String b[]= a.split("h");
for (int i=0; i<b.length; i++) {
	System.out.print(b[i]+ " ");
}

	}

}
