import java.awt.*;
class GUI5
{
	public static void main(String[] args)
	{
		MarvellousWindow mobj1=new MarvellousWindow("First",500,500);
		
	}
}
class MarvellousWindow extends Frame
{
	Button b1;
	public MarvellousWindow(String str,int x,int y)
	{
		super(); 
		setTitle(str);
		setSize(x,y);
		b1= new Button("Marvellous");
		
		add(b1);
		setVisible(true);
	}
}