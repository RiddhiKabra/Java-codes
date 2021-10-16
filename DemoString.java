class DemoString
{
	public static void main(String[] args) 
	{
		String str1="Hey";		
		String str2= new String ("Hey");
		char Arr[]={'H','e','y'};
		String str3= new String (Arr);
		System.out.println(str1);//1
		System.out.println(str2);//2
		System.out.println(str3);//3
	    System.out.println("String length is:"+ str1.length());//length method is used only object is string
	    System.out.println("Array length is:"+Arr.length); //length property  is used only if data is array
	    String s1="Demo";//string literal
	    String s2="Demo";//string literal
	    String s3="Demo";//string literal
	    String s4=new String("Demo");//string object
	    String s5=new String("Demo");//string object
	    String s6=new String("Demo");//string object
	    for(int j=0;j<s6.length();j++) 
         {
         	System.out.println(s6.charAt(j));
         }
        System.out.println(s6.charAt(0));
	    char Brr[]=s6.toCharArray();
        for(int i=0;i<Brr.length;i++)
        {
        	System.out.println(Brr[i]);
        }

        String sobj1="Hello";
        String sobj2="Hello";
        String sobj3=new String("Hello");
        if(sobj1==sobj3)
        {
        	System.out.println("Equal");
        }
        else
        {
          System.out.println("Not Equal");
        }
        if(sobj1.equals(sobj3))
        {
        	System.out.println("Equal");
        }
        else
        {
        	System.out.println("Not Equal");
        }
	}
}
