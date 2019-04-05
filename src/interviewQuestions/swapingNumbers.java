package interviewQuestions;

public class swapingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=25;         // a=a+b
		int y=50;         // b=a-b
		x=y*x; //50       // a=a-b        
		y=x/y; //60
		y=x/y; //10
		x=x/y;
		System.out.println(x);
		System.out.println(y);
		String a="Anar";
		String b="Bilal";
		System.out.println(a.replaceAll("Anar", "Bilal"));
		System.out.println(b.replaceAll("Bilal", "Anar"));
        String str1="Hello";
        String str2="World";
        str1=str1+str2;
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());
		
		System.out.println("The value of str1="+str1+" value of str2="+str2);
		int num []= {100000,700,585,658,5090,565,6767,};
		int max1=num[0];
		int max2=num[1];
		for (int i=0; i<num.length;i++) {
			if (max2<num[i]) {
			max2=num[i];
			}
			if (max2>max1) {
				int temp=max1;
				max1=max2;
				max2=temp;
			}
		}
	System.out.println(max1);
	int c=50;
	int d=60;
	c=c+d; //110
	d=c-d; //110-60
	c=c-d; 
	System.out.println(c);
	System.out.println(d);
	}

}
