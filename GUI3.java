import java.awt.*;
class GUI3
{
	public static void main(String[] args)
	{
		MarvellousWindow mobj1=new MarvellousWindow();
		MarvellousWindow mobj2=new MarvellousWindow();
	}
}
class MarvellousWindow extends Frame
{
	public MarvellousWindow()
	{
		super(); 
		setTitle("Marvellous");
	    setSize(400,400);
		setVisible(true);
	}
}
