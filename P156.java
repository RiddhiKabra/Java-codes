//wap to create array using OOP and to display Addition
import java.util.*;
class P156
{
	public static void main(String[] args)
	{

		Scanner sobj= new Scanner(System.in);
		int iLength=0,iRet=0;
		System.out.println("Enter Number of elements:");
		iLength=sobj.nextInt();
		Addition aobj= new Addition(iLength);
		aobj.Accept();
		aobj.Display();
		iRet=aobj.Add();
		System.out.println("Addition is:"+iRet);
	}
}

class  ArrayX
{
 public int Arr[];
 public ArrayX(int iSize)
 {
    Arr=new int [iSize];
 }
 public void Accept()
 {

 	  Scanner sobj= new Scanner(System.in);
 	  int iCnt=0;
    System.out.println("Enter elements:");
    for(iCnt=0;iCnt<Arr.length;iCnt++)
    	{
    	   Arr[iCnt]=sobj.nextInt();	
    	}
 }
 public void Display()
 {
     System.out.println("Entered elements are:");
     int iCnt=0;
     for(iCnt=0;iCnt<Arr.length;iCnt++)
    	{
    	  System.out.println(Arr[iCnt]);	
 }
}

class Addition extends ArrayX
{
	public Addition(int iValue)
	{
    super(iValue);
	}

	public int Add()
	{
	  int iSum=0,	iCnt=0;
	   for(iCnt=0;iCnt<Arr.length;iCnt++)
    	{
    	  iSum=iSum+Arr[iCnt];	
    	}
    	return iSum;
	}
}