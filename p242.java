//Linear Search using OOP
import java.util.*;

class p242
{
	public static void main(String[] args) 
	{
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sobj.nextInt();

		Searching obj= new Searching(size);

		obj.Accept();
		obj.Display();

		System.out.println("Enter element to search:");
		int no= sobj.nextInt();

		boolean bRet= obj.search(no);
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

abstract class ArrayX
{
	public int Arr[];
	public ArrayX(int size)
	{
		Arr=new int[size];
	}
	public void Accept()
	{
		Scanner sobj= new Scanner(System.in);
	   System.out.println("Enter elements:");
		for (int i=0;i<Arr.length;i++ ) 
		{
			Arr[i]=sobj.nextInt();
		}
	}
	public void Display()
	{
		System.out.println("Entered data is:");
		for (int i=0;i<Arr.length;i++ ) 
		{
			System.out.println(Arr[i]);
		}
	}
    public abstract boolean search(int no);
}

class Searching extends ArrayX
{
	public Searching(int size)
	{
		super(size);
	}
	public  boolean search(int no)
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