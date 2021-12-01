//wap to check whether string is palindrome or not
import java.util.*; 
class P166
{
   public static void main(String Args[])
   {
      StringDemo sobj=new StringDemo();
      sobj.Accept();
      sobj.Display();
     boolean bRet;
     bRet=sobj.CheckPalindrome();
     if(bRet==true)
     {
      System.out.println("String is Palindrome");
     }
     else
     {
      System.out.println("String is not Palindrome");
     }
   }
}

class StringX
{
   public String str;
   public void Accept()
   {
      Scanner sobj= new Scanner(System.in);
      System.out.println("Enter String:");
      str=sobj.nextLine();
   }
   public void Display()
   {
      System.out.println("Entered String is:"+str);
   }
}

class StringDemo extends StringX
{
  public boolean CheckPalindrome()
  {
    char Arr[]=str.toCharArray();
    int iStart=0,iEnd=Arr.length-1;//Arr.length-1 (5 letters so arr index=5-1 )
    char temp;
    while(iStart<iEnd)
    {
      temp=Arr[iStart];
      Arr[iStart]=Arr[iEnd];
      Arr[iEnd]=temp;
      iStart++;
      iEnd--;
    }
     String newstr=new String(Arr);
     boolean bRet= newstr.equaLs(str);
     return bRet;
  }
}
