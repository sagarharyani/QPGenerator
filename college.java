import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
import javax.swing.JPopupMenu;
//import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
public class college extends JFrame implements ActionListener
{TextField pa;
	JTextField qu1,ex1,rat1,qu2,qu3,uname,ge,yr1,un,id,name,fn,as,as1,jo1,ge1,d1,q1,dob,ad,al,cj,cj1,ex,qu,phno,padd,eadd,p1,p2,p3,p4,p5,p6,p7,pp1,pp2,pp3,do1,do2,do3,ad1,ad2,ad3,al1,al2,al3;
	JPasswordField opd,cpd,npd;
	Container c;
	JButton search,new1,save,delete,exit,update,cupdate,bupdate,tupdate,nupdate,create,new2,csave,bsave,tsave,nsave;
	JButton cdok,log,sub;
	JLabel luname,lopd,lnpd,lcpd,lqu1,lqu2,lqu3;
	JOptionPane jp = new JOptionPane();
	JMenuBar menuBar;	
	JMenu menu1,menu2,menu3,menu4; 
	JMenu menuItemS,menuItemT,menuItemSS,menuItemST,menuItemus,menuItemut,file;
	JMenuItem cdpd,btech,btechs,mba,mca,tech,ntech,mbas,mcas,techs,ntechs,menuItemA,menuItemD,menuItemU,menuItemE;
	Cursor cur;
	String tu,tp="brejesh",p,pp;
	int f=0,t=0,a1,a2,a3;
	Choice lcou,cex1,rat,lqul,ljo1,lqul1,yr,gen,dob1,dob2,dob3,all1,all2,all3,add1,add2,add3,de1;
	public college()
	{
		super("College Management");
		c = getContentPane(); c.setBackground(new Color(10,200,180));
		c.setLayout(null); 
		setBounds(0,0,850,590);
		setFont(new Font("Brejesh",50,44));
		cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
		setCursor(cur);
		JLabel una = new JLabel("User Name :"); 
		una.setForeground(Color.white);
		JLabel pas = new JLabel("Password :"); 
		pas.setForeground(Color.white);
		un = new JTextField();
		una.setForeground(Color.black); 
		una.setBackground(Color.white);
		pa = new TextField();
		pas.setForeground(Color.black); 
		pas.setBackground(Color.white);
		pa.setEchoChar('$');
		ImageIcon college = new ImageIcon("image/other/Movie1.jpg");
		JLabel colLogo = new JLabel(college);
		colLogo.setBounds(0,0,850,100);
		c.add(colLogo);
		ImageIcon college1 = new ImageIcon("image/other/note.gif");
		JLabel colLogo1 = new JLabel(college1);
		colLogo1.setBounds(0,460,850,100);
		c.add(colLogo1);
		log = new JButton("Login", new ImageIcon("image/other/create.PNG")); 
		log.setForeground(Color.black); 
		log.setBackground(Color.gray);
		log.setToolTipText("Login in to Project");
		exit = new JButton("Exit", new ImageIcon("image/other/EXIT.PNG")); 
		exit.setForeground(Color.black);
		exit.setBackground(Color.gray);
		exit.setToolTipText("Exit from the Project");
		create = new JButton("Install", new ImageIcon("image/other/create.PNG"));
		create.setForeground(Color.black); 
		create.setBackground(Color.gray);
		create.setToolTipText("Install the Project");

		una.setBounds(220,185,220,30);
		pas.setBounds(220,235,220,30);
		un.setBounds(300,185,220,30);
		pa.setBounds(300,235,220,30);
		create.setBounds(220,300,100,30);
		log.setBounds(330,300,90,30);
		exit.setBounds(430,300,90,30);

		create.addActionListener(this);
		log.addActionListener(this);
		exit.addActionListener(this);
		c.add(un);
		c.add(pa);
		c.add(log);
		c.add(exit);
		c.add(una);
		c.add(pas);
		c.add(create);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		String str1=(String)ae.getActionCommand();
		Object source = ae.getSource();
		if(source==create)
		{
			tp=JOptionPane.showInputDialog("Enter Product key");
			if(tp.equals("m45k30n47p55p57"))
			{
			this.dispose();
			install u12=new install();
			u12.n12();
			}
 		}
		if(str1.equals("Login"))
		{
			try
			{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c = DriverManager.getConnection("jdbc:odbc:sysDSN","system","tiger");
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("select * from pd");
			while(rs.next()){
			tu=rs.getString(1);
			p=rs.getString(2);}
			if((tu.equals(un.getText()))&&(p.equals(pa.getText())))
			{
				pp="Yes";this.dispose();
				college1 p1=new college1();
				p1.nn();
				//jp.showMessageDialog(this,"Login Completed Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
			}
			else
			{
				if(f<4&&("m45k30n47p55p57".equals(pa.getText())))
				{
					jp.showMessageDialog(this,"Please Change Your Password First","INFORMATION",jp.ERROR_MESSAGE);
					this.dispose();
					cpass u18=new cpass();
					u18.n18();
					//jp.showMessageDialog(this,"Login Completed Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
				}
				else
				{
				f++;
				if(f<3)
				jp.showMessageDialog(this,"Sorry, User Name or Password is Wrong","WARRNING",jp.ERROR_MESSAGE);
				else
				{
					jp.showMessageDialog(this,"Please Enter Product Key as Password to Login","INFORMATION",jp.ERROR_MESSAGE);
					f=0;
				}}
			}
			c.close();
			stm.close();
			}
			catch(ClassNotFoundException cnf)
			{
				System.out.println("Cnf Exception");
			}
			catch(SQLException sql)
			{
				jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
			}
		}
		if(source==create)
		{
			
		}
		if(str1.equals("Exit"))
		{
			System.exit(0);
		}
		}	
	public static void main(String arg[])
 	{
 		
		 college u=new college();
		u.setResizable(false);
		u.setBounds(0,0,850,590);
		u.show();
	 }
}