import java.util.*;
import MarvellousNumbers.ArrayX;
class P157
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

class Addition extends ArrayX
{
	public Addition(int iValue)
	{
    super(iValue);
	}
	public int Add()
	{
	  int iSum=0,iCnt=0;
	   for(iCnt=0;iCnt<Arr.length;iCnt++)
    	{
    	  iSum=iSum+Arr[iCnt];	
    	}
    	return iSum;
	}
}