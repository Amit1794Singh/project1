package bridgelab;
import java.util.*;
public class fellowship 
{
	static String str1,str2,str3;
  
	public static void main(String[] args) 
	{
	  Scanner scan=new Scanner(System.in);
	  //intialization
	  System.out.println("Enter the number of string :");
	  str1=scan.nextLine();
	  System.out.print(str1);
	  scan.nextLine();
	  System.out.println("Enter the number of string replaceing ");
	  str2=scan.nextLine();
	  System.out.print(str2);
	  scan.nextLine();
	  System.out.println("Enter the number of string replacewith");
	  str3=scan.nextLine();
	  System.out.print(str3);
	  String str4=str1.replaceAll(str2,str3);
	  System.out.print(str4);
	  
	  
	}

}
