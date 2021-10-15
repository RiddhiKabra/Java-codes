import java.awt.*;
import java.awt.event.*;
class GUI12
{
	public static void main(String[] args)
	{
		MarvellousWindow mobj1=new MarvellousWindow("First",500,500);
	}
}
class MarvellousWindow  
{
	Frame fobj;
	
	public MarvellousWindow(String str,int x,int y)
	{
	   fobj=new Frame(str);
	   fobj.setSize(x,y);
	   fobj.setVisible(true);
	   fobj.addWindowListener(new WindowAdapter()
	   {
	   	public void windowClosing (WindowEvent obj)
	   	{
	   		System.exit(0);
	   	}
	   });
    }  
}