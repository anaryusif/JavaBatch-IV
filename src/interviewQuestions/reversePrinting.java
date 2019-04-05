package interviewQuestions;

public class reversePrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello world hi";
		String rev="";
		for (int  i=a.length()-1; i>=0; i--) {
			rev= rev+a.charAt(i);
			
	}System.out.println(rev);
	String array[]=rev.split(" ");
	for (int b=array.length-1; b>=0; b--) {
		System.out.print(array[b]+" ");
		
	}
	}
}
