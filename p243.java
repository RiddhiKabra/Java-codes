//Linear Search
import java.util.*;

class p243
{
	public static void main(String[] args) 
	{
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sobj.nextInt();

		int Arr[]=new int[size];

		System.out.println("Enter the elements:");

		for (int i=0;i<Arr.length;i++ ) 
		{
			Arr[i]=sobj.nextInt();
		}
		System.out.println("Enter element to search:");
		int value=sobj.nextInt();

		Searching obj= new Searching();

		boolean bRet= obj.LinearSearch(Arr,value);
		if(bRet == true)
		{
			System.out.println("Element is present in array");
		}
		else
		{
	    	System.out.println("Element is not present in array");
		}
	}
}

class Searching
{
	public boolean LinearSearch(int Arr[],int no)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==no)
		    {
				break;
			}
		}
		if(i==Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}