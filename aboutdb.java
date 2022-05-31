import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
import javax.swing.JPopupMenu;
//import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
public class aboutdb extends JFrame implements ActionListener
{
	JTextField qu1,ex1,rat1,qu2,qu3,uname,ge,yr1,un,id,name,fn,as,as1,jo1,ge1,d1,q1,dob,ad,al,cj,cj1,ex,qu,phno,padd,eadd,p1,p2,p3,p4,p5,p6,p7,pp1,pp2,pp3,do1,do2,do3,ad1,ad2,ad3,al1,al2,al3;
	JPasswordField opd,cpd,npd,pa;
	Container c;
	JButton search,new1,save,home,exit,update,cupdate,bupdate,tupdate,nupdate,create,new2,csave,bsave,tsave,nsave;
	JButton cdok,log,sub;
	JLabel luname,lopd,lnpd,lcpd,lqu1,lqu2,lqu3;
	JOptionPane jp = new JOptionPane();
	JMenuBar menuBar;	
	JMenu menu1,menu2,menu3,menu4; 
	JMenu menuItemS,menuItemT,menuItemSS,menuItemST,menuItemus,menuItemut,file;
	JMenuItem cdpd,btech,btechs,mba,mca,tech,ntech,mbas,mcas,techs,ntechs,menuItemA,menuItemD,menuItemU,menuItemE;
	Cursor cur;
	String tu,tp="brejesh",p,ppp,pr;
	int f=0,t=0,a1,a2,a3;
	Choice lcou,cex1,rat,lqul,ljo1,lqul1,yr,gen,dob1,dob2,dob3,all1,all2,all3,add1,add2,add3,de1;
	public aboutdb()
	{
		super("About DataBase");
		c = getContentPane(); c.setBackground(new Color(240,200,100));
		c.setLayout(null); 
		setBounds(0,0,700,500);
		setFont(new Font("Brejesh",50,44));
		cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
		setCursor(cur);
		
		
			ImageIcon design1 = new ImageIcon("image/other/teams.GIF");
			JLabel cover1 = new JLabel(design1);
			c.add(cover1);
			cover1.setBounds(0,0,700,500);
			home = new JButton("Home",new ImageIcon("image/other/New.GIF")); 
		home.setForeground(Color.black); 
		home.setBackground(Color.green);
        	home.setToolTipText("Goto Home Page");
        	home.setBounds(500,400,100,30);
		home.addActionListener(this);
		c.add(home);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		String str1=(String)ae.getActionCommand();
		Object source = ae.getSource();
		 if(source==home)
		{
			this.dispose();
			college1 t=new college1();
			t.nn();
		}
}	
	public void n2()
 	{
 		 aboutdb u1=new aboutdb();
		u1.setResizable(false);
		u1.setBounds(0,0,700,500);
		u1.show();
		 
	 }
}