import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame
{
	JPDemo jp1;
	FDemo()
	{
		super.setTitle("Snake & Ladder");
		jp1=new JPDemo();
		add(jp1);
		setResizable(false);
	}
}
class JPDemo extends JPanel implements ActionListener{
	ImageIcon img1,img2,img3,img4;
	ImageIcon img5,img6,img7;
	ImageIcon img8,img9;
	ImageIcon img10,img11;
	Image swt,board,s1,start;
	Image player1,player2;
	Image player11,player12;
	Image dice,dice1;
	JButton b1,b2,b3,b4;
	JTextField tx1,tx2,tx3;
	int px1 = 40;
	int py1 = 620;
	JPDemo()
	{
		setBackground(Color.black);
		img1 = new ImageIcon("swt.jpeg");
		img2 = new ImageIcon("board.jpeg");
		img3 = new ImageIcon("s11.jpeg");
		img4 = new ImageIcon("s1.jpeg");
		img5 = new ImageIcon("about.gif");
		img6 = new ImageIcon("reset.jpeg");
		img7 = new ImageIcon("start.gif");
		img8 = new ImageIcon("player1.jpeg");
		img9 = new ImageIcon("player2.jpeg");
		img10 = new ImageIcon("dice.gif");
		img11 = new ImageIcon("dice1.jpeg");
		swt = img1.getImage();
		board = img2.getImage();
		s1 = img3.getImage();
		start = img4.getImage();
		start = img4.getImage();
		
		player1 = img8.getImage();
		player2 = img9.getImage();
		
		player11 =img8.getImage();
		player12 =img9.getImage();
		
		dice = img10.getImage();
		dice1 = img11.getImage();
		
		setLayout(null);
		b1= new JButton(img5);
		b1.setBounds(50,120,100,30);
		add(b1);
		b1.setBackground(new Color(4,129,255));
		
		b2= new JButton(img6);
		b2.setBounds(50,180,100,30);
		add(b2);
		b2.setBackground(new Color(4,129,255));
		
		Font f = new Font("Bauhaus 93",Font.ITALIC,20);
		
		tx1 = new JTextField("Start Game");
		tx1.setBounds(50,230,150,35);
		add(tx1);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		tx1.setFont(f);
		
		tx2 = new JTextField("Player 1 Name");
		tx2.setBounds(50,290,150,35);
		add(tx2);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(f);
		
		tx3 = new JTextField("Player 2 Name");
		tx3.setBounds(50,375,150,35);
		add(tx3);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		tx3.setFont(f);
		
		b3 = new JButton("Roll");
		b3.setBounds(50,500,100,30);
		add(b3);
		b3.setFont(f);
		b3.setForeground(Color.red);
		b3.addActionListener(this);
		
		b4=new JButton(img7);
		b4.setBounds(20,560,150,60);
		add(b4);
		b4.setFont(f);
		b4.setForeground(Color.red);
		
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(new Color(4,129,129));
		g.fillRect(0,0,200,735);
		g.drawImage(swt,0,0,this);
		g.drawImage(board,200,0,this);
		g.drawImage(s1,920,0,this);
		g.drawImage(start,20,550,this);
		
		g.drawImage(player1,px1,py1,this);
		g.drawImage(player2,120,620,this);
		g.drawImage(player11,10,280,this);
		g.drawImage(player12,10,360,this);
		g.drawImage(dice,10,420,this);
		g.drawImage(dice1,110,430,this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b3)
		{
			int random=(int)Math.round(Math.random()*5+1);
			px1 = 140;
			py1 = 645;
			switch(random)
			{
				case 1:
				img11 = new ImageIcon("dice1.jpeg");
				px1+=70;
				break;
				case 2:
				img11 = new ImageIcon("dice2.jpeg");
				px1+=140;
				break;
				case 3:
				img11 = new ImageIcon("dice3.jpeg");
				px1+=210;
				break;
				case 4:
				img11 = new ImageIcon("dice4.jpeg");
				px1+=280;
				break;
				case 5:
				img11 = new ImageIcon("dice5.jpeg");
				px1+=350;
				break;
				case 6:
				img11 = new ImageIcon("dice6.jpeg");
				px1+=420;
				break;
			}
			dice1 = img11.getImage();     
			repaint();
			//System.out.println(random);
			
		}
		
	}
}
class snake
{
	public static void main(String []args)
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		//f.setBounds(x,y,w,h);
		f.setBounds(200,100,990,735);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}