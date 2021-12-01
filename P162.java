//String creation using OOP using while loop
import java.util.*; 
class P162
{
   public static void main(String Args[])
   {
      int iRet=0;
      StringDemo sobj=new StringDemo();
      sobj.Accept();
      sobj.Display();
      iRet=sobj.CountVowels();
      System.out.println("Number of vowels are:"+iRet);
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
  public int CountVowels()
  {
    char Arr[]=str.toCharArray();
    int iCnt=0,i=0;
    while(i<Arr.length)
    {
      if((Arr[i]=='a') || (Arr[i]=='e') ||(Arr[i]=='i') ||(Arr[i]=='o')||(Arr[i]=='u')||(Arr[i]=='A')||(Arr[i]=='E')||(Arr[i]=='I')||(Arr[i]=='O')||(Arr[i]=='U'))
      {
         iCnt++;
      }
      i++;
    }
   return iCnt;
  }
}