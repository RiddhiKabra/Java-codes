import java.awt.*;
class GUI4
{
	public static void main(String[] args)
	{
		MarvellousWindow mobj1=new MarvellousWindow("First",500,500);
		MarvellousWindow mobj2=new MarvellousWindow("Second",1500,1500);
	}
}
class MarvellousWindow extends Frame
{
	public MarvellousWindow(String str,int x,int y)
	{
		super(); 
		setTitle(str);
		setSize(x,y);
		setVisible(true);
	}
}