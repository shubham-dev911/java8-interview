
public class StringEx {
public static void main(String[] args) {
	

	String a="abc p";
	char ch;
	String reverse="";
	for (int i=0;i<a.length();i++)
	{
		ch=a.charAt(i);
		reverse=ch+reverse;
		
	}
	System.out.println(reverse);
}
}