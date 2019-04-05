package interviewQuestions;

public class alphaChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Hello &*^*& World";
String b=a.replaceAll("[A-Za-z0-9]", "");
System.out.println(b);
System.out.println(b.length());
	}

}
