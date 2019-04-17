package com.class22;

public class SyntaxStudent {

	/*schoolName
	 * batchNumber
	 * studentName
	 * studentLastName
	 * 
	 * method getStudentDetails
	 */
		public static String schoolName="Syntax";
		public static int batchNumber=4;
		
		public String studentName;
		public String studentLastName;
		
		
		public SyntaxStudent(String name, String lastName) {
			studentName=name;
			studentLastName=lastName;
		}
		
		
		public void getStudentDetails() {
			String details="I am a student at "+schoolName+" from batch "+batchNumber+
					" and my name is "+studentName+" "+studentLastName;
			System.out.println(details);
		}
		
	}
	Collapse



	12:29 PM
	package com.class22;

	public class TestSyntaxStudents {

	    public static void main(String[] args) {
	        
	//        SyntaxStudent student1=new SyntaxStudent();
	//        student1.studentName=“Samir”;
	//        student1.studentLastName=“Aziz”;
	//        
	//        student1.getStudentDetails();
	//        
	//        SyntaxStudent student2=new SyntaxStudent();
	//        student2.studentName=“Mohammad”;
	//        student2.studentLastName=“Ali”;
	//        
	//        student2.getStudentDetails();
	        
	        SyntaxStudent student1=new SyntaxStudent(“Asha”, “Noman”);
	        student1.getStudentDetails();
	        
	        SyntaxStudent student2=new SyntaxStudent(“Mustafa”, “Ozturk”);
	        student2.getStudentDetails();
	    }

}
