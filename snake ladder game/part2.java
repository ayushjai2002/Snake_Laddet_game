import java.awt.*;
class FDemo extends Frame{
	FDemo()
	{
		Font f = new Font("",Font.BOLD,30);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		int x=140;
		int y = 100;
		int k=1;
		for(int i=1;i<=10;i++)
		{
			if(k==11)
			{
				x-=70;
				k--;
			}
			if(k==0)
			{
				x+=70;
				k++;
			}
			for(int j=1;j<=10;j++)
			{
				try{Thread.sleep(200);}catch(Exception e){}
				g.drawString(""+k,x,y);
				if(i%2==1){
					x+=70;
					k++;
				}
				else
				{
					x-=70;
					k--;
				}
				
			}
			y+=70;
		}
	} 
	
	
}

class snake
{
	public static void main(String args[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setBounds(200,100,1100,900);
	}
}