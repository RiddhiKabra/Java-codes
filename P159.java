//accept string from user
import java.util.*; 
class P159
{
   public static void main(String Args[])
   {
   	 Scanner sobj= new Scanner(System.in);
   	 String str;
   	 System.out.println("Enter your name:");
   	 str=sobj.nextLine();

   	 System.out.println("Hello!"+str);
   }
}