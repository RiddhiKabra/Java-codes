//accept string from user and pass it from one function to another
import java.util.*; 
class P160
{
   public static void main(String Args[])
   {
   	 Scanner sobj= new Scanner(System.in);
   	 String str;
   	 System.out.println("Enter your name:");
   	 str=sobj.nextLine();
       Marvellous mobj= new Marvellous();
       mobj.Display(str);
   }
}
class Marvellous
{
   public void Display(String Data)
   {
      System.out.println("Welcome!"+Data);
   }
}
