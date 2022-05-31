import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
import javax.swing.JPopupMenu;
//import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
public class ntech extends JFrame implements ActionListener
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
	public ntech()
	{
		super("NON-Teaching Staff From");
		c = getContentPane(); c.setBackground(new Color(243,165,46));
		c.setLayout(null); 
		setBounds(0,0,850,600);
		setFont(new Font("Brejesh",50,44));
		cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
		setCursor(cur);
		ImageIcon college = new ImageIcon("image/other/Movie1.jpg");
		JLabel colLogo = new JLabel(college);
		colLogo.setBounds(0,0,850,100);
		c.add(colLogo);
		ImageIcon coll = new ImageIcon("PICT0052.jpg");
		JLabel LogoColl = new JLabel(coll);
		
		JLabel lid = new JLabel("* ID :");  
		lid.setForeground(Color.black);
		JLabel lname = new JLabel("Name :"); 
		lname.setForeground(Color.black);
		JLabel lfn = new JLabel("Father's Name :"); 
		lfn.setForeground(Color.black);
		JLabel ldob = new JLabel("Date Of Birth :"); 
		ldob.setForeground(Color.black);
		JLabel lad = new JLabel("Admmision Date :"); 
		lad.setForeground(Color.black);
		JLabel lal = new JLabel("Date Of Leave:");
		lal.setForeground(Color.black);
		JLabel las = new JLabel("Admmision No:");	
		las.setForeground(Color.black);
		JLabel lcj = new JLabel("Course :"); 
		lcj.setForeground(Color.black);
		JLabel lcj1 = new JLabel("Designation :"); 
		lcj1.setForeground(Color.black);
		JLabel lqu = new JLabel("Join Through :");	
		lqu.setForeground(Color.black);
		JLabel lge = new JLabel("Gender :");	
		lge.setForeground(Color.black);
		JLabel lyr = new JLabel("Year :");	
		lyr.setForeground(Color.black);
		JLabel lqu1 = new JLabel("Qualification :");	
		lqu1.setForeground(Color.black);
		JLabel ph = new JLabel("Phone Number :"); 
		ph.setForeground(Color.black);
		
		JLabel lpadd = new JLabel("Permenent Address:"); 
		lpadd.setForeground(Color.black);
		JLabel leadd = new JLabel("Email Address :"); 
		leadd.setForeground(Color.black);
		JLabel lrat = new JLabel("Ratified :"); 
		lrat.setForeground(Color.black);
       		JLabel lp = new JLabel("Progress(%) :"); 
		lp.setForeground(Color.black);
		JLabel lp1 = new JLabel("Sem-1");
		lp1.setForeground(Color.black);
		JLabel lp2 = new JLabel("Sem-2"); 
		lp2.setForeground(Color.black);
		JLabel lp3 = new JLabel("Sem-3");
		lp3.setForeground(Color.black);
		JLabel lp4 = new JLabel("Sem-4"); 
		lp4.setForeground(Color.black);
		JLabel lp5 = new JLabel("Sem-5"); 
		lp5.setForeground(Color.black);
		JLabel lp6 = new JLabel("Sem-6"); 
		lp6.setForeground(Color.black);
		JLabel las1 = new JLabel("Salary:");
		las1.setForeground(Color.black);
		JLabel lpp = new JLabel("Privous Progress(%) :"); 
		lpp.setForeground(Color.black);
		JLabel lpp1 = new JLabel("Ssc"); 
		lpp1.setForeground(Color.black);
		JLabel lpp2 = new JLabel("Inter");
		lpp2.setForeground(Color.black);
		JLabel lpp3 = new JLabel("Degree");
		lpp3.setForeground(Color.black);
		
		

		
			
			
		JLabel ldep = new JLabel("Department :"); 
		ldep.setForeground(Color.black);
		
		
		
		
		
       		JLabel lex = new JLabel("Experience & Yr's:");
		lex.setForeground(Color.black);
		


		id = new JTextField(); 
		id.setForeground(Color.black); 
		id.setBackground(Color.white);
		name = new JTextField(); 
		name.setForeground(Color.black);
		name.setBackground(Color.white);
		fn = new JTextField();		
		fn.setForeground(Color.black);
		fn.setBackground(Color.white);
		ex = new JTextField();		
		ex.setForeground(Color.black);
		ex.setBackground(Color.white);
		
		as1 = new JTextField(); 
		as1.setForeground(Color.black); 
		as1.setBackground(Color.white);
		
		
		phno = new JTextField();  
		phno.setForeground(Color.black); 
		phno.setBackground(Color.white);
	      	padd = new JTextField();		
		padd.setForeground(Color.black); 
		padd.setBackground(Color.white);
		eadd = new JTextField();		
		eadd.setForeground(Color.black); 
		eadd.setBackground(Color.white);
				
		
		dob1 = new Choice();
		dob2 = new Choice();
		dob3 = new Choice();
		dob1.add("1");
		dob1.add("2");
		dob1.add("3");
		dob1.add("4");
		dob1.add("5");
		dob1.add("6");
		dob1.add("7");
		dob1.add("8");
		dob1.add("9");
		dob1.add("10");
		dob1.add("11");
		dob1.add("12");
		dob1.add("13");
		dob1.add("14");
		dob1.add("15");
		dob1.add("16");
		dob1.add("17");
		dob1.add("18");
		dob1.add("19");
		dob1.add("20");
		dob1.add("21");
		dob1.add("22");
		dob1.add("23");
		dob1.add("24");
		dob1.add("25");
		dob1.add("26");
		dob1.add("27");
		dob1.add("28");
		dob1.add("29");
		dob1.add("30");
		dob1.add("31");
		dob2.add("JAN");
		dob2.add("FEB");
		dob2.add("MAR");
		dob2.add("APR");
		dob2.add("MAY");
		dob2.add("JUN");
		dob2.add("JUL");
		dob2.add("AUG");
		dob2.add("SEP");
		dob2.add("OCT");
		dob2.add("NOV");
		dob2.add("DEC");
		dob3.add("1970");
		dob3.add("1971");
		dob3.add("1972");
		dob3.add("1973");
		dob3.add("1974");
		dob3.add("1975");
		dob3.add("1976");
		dob3.add("1977");
		dob3.add("1978");
		dob3.add("1979");
		dob3.add("1970");
		dob3.add("1981");
		dob3.add("1982");
		dob3.add("1983");
		dob3.add("1984");
		dob3.add("1985");
		dob3.add("1986");
		dob3.add("1987");
		dob3.add("1988");
		dob3.add("1989");
		dob3.add("1990");
		dob3.add("1991");
		dob3.add("1992");
		dob3.add("1993");
		dob3.add("1994");
		dob3.add("1995");
		dob3.add("1996");
		dob3.add("1997");
		dob3.add("1998");
		dob3.add("1999");
		dob3.add("2000");
		dob3.add("2001");
		dob3.add("2002");
		dob3.add("2003");
		dob3.add("2004");
		dob3.add("2005");
		dob3.add("2006");
		dob3.add("2007");
		dob3.add("2008");
		dob3.add("2009");
		dob3.add("2010");
		dob3.add("2011");
		dob3.add("2012");
		dob3.add("2013");
		dob3.add("2014");
		dob3.add("2015");
		dob3.add("2016");
		dob3.add("2017");
		dob3.add("2018");
		dob3.add("2019");
		dob3.add("2020");
		dob3.add("2021");
		dob3.add("2022");
		dob3.add("2023");
		dob3.add("2024");
		dob3.add("2025");
		dob3.add("2026");
		dob3.add("2027");
		dob3.add("2028");
		dob3.add("2029");
		dob3.add("2030");
		dob1.setBounds(190,210,40,20);
		dob2.setBounds(235,210,45,20);
		dob3.setBounds(285,210,55,20);
		
		add1 = new Choice();
		add2 = new Choice();
		add3 = new Choice();
		add1.add("1");
		add1.add("2");
		add1.add("3");
		add1.add("4");
		add1.add("5");
		add1.add("6");
		add1.add("7");
		add1.add("8");
		add1.add("9");
		add1.add("10");
		add1.add("11");
		add1.add("12");
		add1.add("13");
		add1.add("14");
		add1.add("15");
		add1.add("16");
		add1.add("17");
		add1.add("18");
		add1.add("19");
		add1.add("20");
		add1.add("21");
		add1.add("22");
		add1.add("23");
		add1.add("24");
		add1.add("25");
		add1.add("26");
		add1.add("27");
		add1.add("28");
		add1.add("29");
		add1.add("30");
		add1.add("31");
		add2.add("JAN");
		add2.add("FEB");
		add2.add("MAR");
		add2.add("APR");
		add2.add("MAY");
		add2.add("JUN");
		add2.add("JUL");
		add2.add("AUG");
		add2.add("SEP");
		add2.add("OCT");
		add2.add("NOV");
		add2.add("DEC");
		add3.add("1970");
		add3.add("1971");
		add3.add("1972");
		add3.add("1973");
		add3.add("1974");
		add3.add("1975");
		add3.add("1976");
		add3.add("1977");
		add3.add("1978");
		add3.add("1979");
		add3.add("1970");
		add3.add("1981");
		add3.add("1982");
		add3.add("1983");
		add3.add("1984");
		add3.add("1985");
		add3.add("1986");
		add3.add("1987");
		add3.add("1988");
		add3.add("1989");
		add3.add("1990");
		add3.add("1991");
		add3.add("1992");
		add3.add("1993");
		add3.add("1994");
		add3.add("1995");
		add3.add("1996");
		add3.add("1997");
		add3.add("1998");
		add3.add("1999");
		add3.add("2000");
		add3.add("2001");
		add3.add("2002");
		add3.add("2003");
		add3.add("2004");
		add3.add("2005");
		add3.add("2006");
		add3.add("2007");
		add3.add("2008");
		add3.add("2009");
		add3.add("2010");
		add3.add("2011");
		add3.add("2012");
		add3.add("2013");
		add3.add("2014");
		add3.add("2015");
		add3.add("2016");
		add3.add("2017");
		add3.add("2018");
		add3.add("2019");
		add3.add("2020");
		add3.add("2021");
		add3.add("2022");
		add3.add("2023");
		add3.add("2024");
		add3.add("2025");
		add3.add("2026");
		add3.add("2027");
		add3.add("2028");
		add3.add("2029");
		add3.add("2030");
		add1.setBounds(190,240,40,20);
		add2.setBounds(235,240,45,20);
		add3.setBounds(285,240,55,20);
		
			
	    	new2 = new JButton("New",new ImageIcon("image/other/New.GIF")); 
		new2.setForeground(Color.white); 
		new2.setBackground(new Color(128,0,0));
        	nsave = new JButton("Save", new ImageIcon("image/other/Save.gif")); 
		nsave.setForeground(Color.white); 
		nsave.setBackground(new Color(128,0,0));
        	home = new JButton("Home",new ImageIcon("image/other/New.GIF")); 
		home.setForeground(Color.white); 
		home.setBackground(new Color(128,0,0));
        	home.setToolTipText("Goto Home Page");
        	home.setBounds(670,450,100,30);
		home.addActionListener(this);
		c.add(home);
		
		new2.setToolTipText("Enter New record");	
		nsave.setToolTipText("Save the record");	
		

			lid.setBounds(70,120,670,20);
			lname.setBounds(70,150,150,20);
			lfn.setBounds(70,180,150,20);
			ldob.setBounds(70,210,150,20);
			lad.setBounds(70,240,150,20);
			lcj1.setBounds(70,270,150,20);
			ldep.setBounds(70,300,150,20);
			lex.setBounds(70,330,150,20);
			lqu1.setBounds(70,360,150,20);
			las1.setBounds(70,420,150,20);
			
			lge.setBounds(70,390,150,20);
			
			ph.setBounds(70,450,150,20);
			lpadd.setBounds(70,480,150,20);
			leadd.setBounds(70,510,150,20);
			lrat.setBounds(70,540,150,20);
			//ex.setBounds(190,330,100,20);
			ex.setBounds(300,330,40,20);
			id.setBounds(190,120,150,20);
			name.setBounds(190,150,150,20);
			fn.setBounds(190,180,150,20);
			as1.setBounds(190,420,150,20);
			
			
			
			
			phno.setBounds(190,450,150,20);
			padd.setBounds(190,480,150,20);
			eadd.setBounds(190,510,150,20);
			
		
			
			
			
			
		
		
		new2.setBounds(450,450,100,30);
		nsave.setBounds(560,450,100,30);
		
		nsave.addActionListener(this);
		
        	
		
		new2.addActionListener(this);
		gen = new Choice();
		gen.add("Male");
		gen.add("Fe male");
		gen.setBounds(190,390,150,20);
			ljo1 = new Choice();
		ljo1.add("Atender");
		ljo1.add("Watchman");
		ljo1.add("Principal");
		ljo1.add("Director");
		lqul1 = new Choice();
		lqul1.add("S.S.C.");
		lqul1.add("Inter");
		lqul1.add("Degree");
		lqul1.add("B.TECH");
		lqul1.add("M.TECH");
		lqul1.add("M.S.C.");
		lqul1.add("P.G.");
		cex1 = new Choice();
		cex1.add("Industrial");
		cex1.add("Teching");
		cex1.add("Other");
		rat = new Choice();
		rat.add("Yes");
		rat.add("No");
		cex1.setBounds(190,330,100,20);rat.setBounds(190,540,150,20);
		de1 = new Choice();
		de1.add("CSE");
		de1.add("ECE");
		de1.add("IT");
		de1.add("EEE");
		de1.add("Office");
		de1.add("Exam cel");
		ljo1.setBounds(190,270,150,20);
		lqul1.setBounds(190,360,150,20);
		de1.setBounds(190,300,150,20);
			c.add(lid);
			c.add(lname);
			c.add(lfn);
			c.add(ldob);
			c.add(lad);
			c.add(ldep);
			c.add(las1);
			c.add(lcj1);
			c.add(lex);
			c.add(lrat);
			c.add(cex1);
			c.add(rat);
			c.add(ph);
			c.add(lpadd);
			c.add(leadd);
			c.add(lge);
			c.add(lqu1);

			c.add(id);
			c.add(name);
			c.add(fn);
			c.add(dob1);
			c.add(dob2);
			c.add(dob3);
			c.add(add1);
			c.add(add2);
			c.add(add3);
			c.add(ex);
			c.add(as1);
			c.add(ljo1);
			c.add(de1);
			c.add(lqul1);
			c.add(phno);
			c.add(padd);
			c.add(eadd);
			
			c.add(gen);
			c.add(nsave);
			
			
			c.add(new2);
			
		
		//	cdlogo.setBounds(0,0,800,100);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			
		
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
		if(source==new2)	
		{
			

			id.setEditable(true);
			name.setEditable(true);
			fn.setEditable(true);
			//dob.setEditable(true);
			//ad.setEditable(true);
			//al.setEditable(true);
			//as.setEditable(true);
			//cj.setEditable(true);
			//qu.setEditable(true);
			phno.setEditable(true);
			padd.setEditable(true);
			eadd.setEditable(true);
			as1.setEditable(true);
			ex.setEditable(true);
			//cex1.setEditable(true);
			//lqul.setBounds(190,380,150,20);
			
			//p1.setEditable(true);
			//p2.setEditable(true);
			//p3.setEditable(true);
			//p4.setEditable(true);
			//p5.setEditable(true);
			//p6.setEditable(true);
			//p7.setEditable(true);
		
			//pp1.setEditable(true);
			//pp2.setEditable(true);
			//pp3.setEditable(true);

			id.setText(null);
			name.setText(null);
			fn.setText(null);
			//dob.setText(null);
			//ad.setText(null);
			//al.setText(null);
			//as.setText(null);
			//cj.setText(null);
			//qu.setText(null);
			phno.setText(null);
			padd.setText(null);
			eadd.setText(null);
			
			//lqul.setBounds(190,380,150,20);
			
			//p1.setText(null);
			//p2.setText(null);
			//p3.setText(null);
			//p4.setText(null);
			//p5.setText(null);
			//p6.setText(null);
			//p7.setText(null);
		
			//pp1.setText(null);
			//pp2.setText(null);
			as1.setText(null);
			ex.setText(null);//cex1.setText(null);
			//pp3.setText(null);
			
		}
		if(source==nsave)
		{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c = DriverManager.getConnection("jdbc:odbc:sysDSN","system","tiger");
			Statement stm = c.createStatement();
			t=0;
			if(((phno.getText()).length()!=0)&&((phno.getText()).length()!=10))
			jp.showMessageDialog(this,"Phone Number Must Contains 10 Digits","INFORMATION",jp.ERROR_MESSAGE);
			else
			{
				
					ResultSet rs1 = stm.executeQuery("select * from ntech where sid="+id.getText());
					while(rs1.next())
					{	
						t=1;
					}
					if(t==0)
					{
						t=0;
						PreparedStatement ps  = c.prepareStatement("insert into ntech values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
						if((id.getText()).length()!=0)
						ps.setString(1,id.getText());
						else
						ps.setString(1,"");
						if((name.getText()).length()!=0)
						ps.setString(2,name.getText());	
						else
						ps.setString(2,"");	
						if((fn.getText()).length()!=0)
						ps.setString(3,fn.getText());
						else
						ps.setString(3,"");
						ps.setString(4,dob1.getSelectedItem());
						ps.setString(5,dob2.getSelectedItem());
						ps.setString(6,dob3.getSelectedItem());
						ps.setString(7,add1.getSelectedItem());
						ps.setString(8,add2.getSelectedItem());
						ps.setString(9,add3.getSelectedItem());
						
						ps.setString(10,ljo1.getSelectedItem());
						ps.setString(11,de1.getSelectedItem());
						ps.setString(12,cex1.getSelectedItem());
						if((ex.getText()).length()!=0)
						ps.setString(13,ex.getText());
						else
						ps.setString(13,"");
						
						ps.setString(14,lqul1.getSelectedItem());
						ps.setString(15,gen.getSelectedItem());
						if((as1.getText()).length()!=0)
						ps.setString(16,as1.getText());
						else
						ps.setString(16,"");
						if((phno.getText()).length()!=0)
						ps.setString(17,phno.getText());
						else
						ps.setString(17,"");
						if((padd.getText()).length()!=0)
						ps.setString(18,padd.getText());
						else
						ps.setString(18,"");
						if((eadd.getText()).length()!=0)
						ps.setString(19,eadd.getText());
						else
						ps.setString(19,"");
						ps.setString(20,rat.getSelectedItem());
						
						
						ps.executeUpdate();
						jp.showMessageDialog(this,"Record Inserted Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
					}
					else
					{
						jp.showMessageDialog(this,"Sorry, Record ID is Already Exists","INFORMATION",jp.ERROR_MESSAGE);
						t=0;
					}
				
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
				jp.showMessageDialog(this,"Sql Syntax Error","EXCEPTION",jp.ERROR_MESSAGE);
			}
		}
	}	
	public void n10()
 	{
 		
		 this.setResizable(false);
	 }
}