public class Test {

	public static void main(String[] args) {

//		getFib();
		revString("Shubham");
	}
	
//	public static void getFib() {
//		int a=0;
//		int b=1;
//		int sum=0;;
//		for(int i=0;i<10;i++) {
//			 a=b;
//			 b=sum;
//			 sum=a+b;
//			 System.out.println(sum);
//		}
//	}
	
//	public static void revString(String str) {
//		String rev="";
//		for (int i=str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
//	}
	
	public static void revString(String str) {
		String rev="";
		
		for(int i=0;i<str.length();i++) {
			rev= str.charAt(i)+rev;
		}
		System.out.println(rev);
	}
} 
