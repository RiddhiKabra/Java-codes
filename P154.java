//wap to create array and display i/p
import java.util.*;
class P154
{
	public static void main(String[] args)
	{
		int iSize=0,iCnt=0;
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter number of elements:");
		iSize= sobj.nextInt();
		int Arr[]=new int[iSize];
		System.out.println("Enter numbers:");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		System.out.println("Entered numbers/elements are:");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}

	}
}