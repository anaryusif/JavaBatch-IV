package interviewQuestions;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int arr[] = { 1000, 46, 1, 86, 292, 2 };
	        
	        int min = arr[0];//0
	        int secondLargest = 0;//0
	        int largest = 0;//0
	        
	        for(int a: arr) {
	            if(a>largest) {
	                largest =a;
	            }
	            if(a < min) {
	                min = a;
	            }
	        }
	        for(int a : arr) {
	            
	            if(a> secondLargest && a <largest) {
	                
	                secondLargest = a;
	            }
	        }
	        System.out.println ("min " + min);
	        System.out.println(secondLargest);

	        System.out.println(largest);

	        
	        

	    }
	}

