import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
import javax.swing.JPopupMenu;
//import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
public class btech extends JFrame implements ActionListener
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
	public btech()
	{
		super("B.Tech Students From");
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
       		JLabel lp = new JLabel("Progress(%):"); 
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
		JLabel lpp = new JLabel("Previous Progress(%):"); 
		lpp.setForeground(Color.black);
		JLabel lpp1 = new JLabel("Ssc"); 
		lpp1.setForeground(Color.black);
		JLabel lpp2 = new JLabel("Inter");
		lpp2.setForeground(Color.black);
		JLabel lpp3 = new JLabel("Degree");
		lpp3.setForeground(Color.black);
		
			
		
       		JLabel llp = new JLabel("Progress(%)"); 
		llp.setForeground(Color.black);
		JLabel llp1 = new JLabel("1 Yr");
		llp1.setForeground(Color.black);
		JLabel llp2 = new JLabel("2-1"); 
		llp2.setForeground(Color.black);
		JLabel llp3 = new JLabel("2-2");
		llp3.setForeground(Color.black);
		JLabel llp4 = new JLabel("3-1"); 
		llp4.setForeground(Color.black);
		JLabel llp5 = new JLabel("3-2"); 
		llp5.setForeground(Color.black);
		JLabel llp6 = new JLabel("4-1"); 
		llp6.setForeground(Color.black);
		JLabel llp7 = new JLabel("4-2"); 
		llp7.setForeground(Color.black);
		
		
		
		
		id = new JTextField(); 
		id.setForeground(Color.black); 
		id.setBackground(Color.white);
		name = new JTextField(); 
		name.setForeground(Color.black);
		name.setBackground(Color.white);
		fn = new JTextField();		
		fn.setForeground(Color.black);
		fn.setBackground(Color.white);
		do1 = new JTextField();		
		do1.setForeground(Color.black);  
		do1.setBackground(Color.white);
		do2 = new JTextField();		
		do2.setForeground(Color.black);  
		do2.setBackground(Color.white);
		do3 = new JTextField();		
		do3.setForeground(Color.black);  
		do3.setBackground(Color.white);
		ad1 = new JTextField();		
		ad1.setForeground(Color.black); 
		ad1.setBackground(Color.white);
		ad2 = new JTextField();		
		ad2.setForeground(Color.black); 
		ad2.setBackground(Color.white);
		ad3 = new JTextField();		
		ad3.setForeground(Color.black); 
		ad3.setBackground(Color.white);
		al1 = new JTextField();		
		al1.setForeground(Color.black); 
		al1.setBackground(Color.white);
		al2 = new JTextField();		 
		al2.setForeground(Color.black); 
		al2.setBackground(Color.white);
		al3 = new JTextField();		
		al3.setForeground(Color.black); 
		al3.setBackground(Color.white);
		as = new JTextField(); 
		as.setForeground(Color.black); 
		as.setBackground(Color.white);
		cj = new JTextField();		
		cj.setForeground(Color.black);
		cj.setBackground(Color.white);
		qu = new JTextField();	
		qu.setForeground(Color.black);  
		qu.setBackground(Color.white);
		phno = new JTextField();  
		phno.setForeground(Color.black); 
		phno.setBackground(Color.white);
	      	padd = new JTextField();		
		padd.setForeground(Color.black); 
		padd.setBackground(Color.white);
		eadd = new JTextField();		
		eadd.setForeground(Color.black); 
		eadd.setBackground(Color.white);
		p1 = new JTextField();		
		p1.setForeground(Color.black); 
		p1.setBackground(Color.white);
		p2 = new JTextField();		
		p2.setForeground(Color.black); 
		p2.setBackground(Color.white);
		p3 = new JTextField();		
		p3.setForeground(Color.black); 
		p3.setBackground(Color.white);
		p4 = new JTextField();		
		p4.setForeground(Color.black); 
		p4.setBackground(Color.white);
		p5 = new JTextField();		
		p5.setForeground(Color.black);
		p5.setBackground(Color.white);
		p6 = new JTextField();		
		p6.setForeground(Color.black); 
		p6.setBackground(Color.white);
		p7 = new JTextField();		
		p7.setForeground(Color.black); 
		p7.setBackground(Color.white);
		pp1 = new JTextField();		
		pp1.setForeground(Color.black); 
		pp1.setBackground(Color.white);
		pp2 = new JTextField();		
		pp2.setForeground(Color.black); 
		pp2.setBackground(Color.white);	
		pp3 = new JTextField();		
		pp3.setForeground(Color.black); 
		pp3.setBackground(Color.white);			
		cj1 = new JTextField();		
		cj1.setForeground(Color.black); 
		cj1.setBackground(Color.white);
		
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
		all1 = new Choice();
		all2 = new Choice();
		all3 = new Choice();
		all1.add("1");
		all1.add("2");
		all1.add("3");
		all1.add("4");
		all1.add("5");
		all1.add("6");
		all1.add("7");
		all1.add("8");
		all1.add("9");
		all1.add("10");
		all1.add("11");
		all1.add("12");
		all1.add("13");
		all1.add("14");
		all1.add("15");
		all1.add("16");
		all1.add("17");
		all1.add("18");
		all1.add("19");
		all1.add("20");
		all1.add("21");
		all1.add("22");
		all1.add("23");
		all1.add("24");
		all1.add("25");
		all1.add("26");
		all1.add("27");
		all1.add("28");
		all1.add("29");
		all1.add("30");
		all1.add("31");
		all2.add("JAN");
		all2.add("FEB");
		all2.add("MAR");
		all2.add("APR");
		all2.add("MAY");
		all2.add("JUN");
		all2.add("JUL");
		all2.add("AUG");
		all2.add("SEP");
		all2.add("OCT");
		all2.add("NOV");
		all2.add("DEC");
		all3.add("1970");
		all3.add("1971");
		all3.add("1972");
		all3.add("1973");
		all3.add("1974");
		all3.add("1975");
		all3.add("1976");
		all3.add("1977");
		all3.add("1978");
		all3.add("1979");
		all3.add("1970");
		all3.add("1981");
		all3.add("1982");
		all3.add("1983");
		all3.add("1984");
		all3.add("1985");
		all3.add("1986");
		all3.add("1987");
		all3.add("1988");
		all3.add("1989");
		all3.add("1990");
		all3.add("1991");
		all3.add("1992");
		all3.add("1993");
		all3.add("1994");
		all3.add("1995");
		all3.add("1996");
		all3.add("1997");
		all3.add("1998");
		all3.add("1999");
		all3.add("2000");
		all3.add("2001");
		all3.add("2002");
		all3.add("2003");
		all3.add("2004");
		all3.add("2005");
		all3.add("2006");
		all3.add("2007");
		all3.add("2008");
		all3.add("2009");
		all3.add("2010");
		all3.add("2011");
		all3.add("2012");
		all3.add("2013");
		all3.add("2014");
		all3.add("2015");
		all3.add("2016");
		all3.add("2017");
		all3.add("2018");
		all3.add("2019");
		all3.add("2020");
		all3.add("2021");
		all3.add("2022");
		all3.add("2023");
		all3.add("2024");
		all3.add("2025");
		all3.add("2026");
		all3.add("2027");
		all3.add("2028");
		all3.add("2029");
		all3.add("2030");
		all1.setBounds(190,270,40,20);
		all2.setBounds(235,270,45,20);
		all3.setBounds(285,270,55,20);
			
	    	new1 = new JButton("New",new ImageIcon("image/other/New.GIF")); 
		new1.setForeground(Color.black); 
		new1.setBackground(Color.gray);
        	save = new JButton("Save", new ImageIcon("image/other/Save.gif")); 
		save.setForeground(Color.black); 
		save.setBackground(Color.gray);
        	home = new JButton("Home",new ImageIcon("image/other/New.GIF")); 
		home.setForeground(Color.black); 
		home.setBackground(Color.gray);
        	home.setToolTipText("Goto Home Page");
        	home.setBounds(670,450,100,30);
		home.addActionListener(this);
		c.add(home);
		new1.setToolTipText("Enter New record");	
		save.setToolTipText("Save the record");	
		

			lid.setBounds(70,120,670,20);
			lname.setBounds(70,150,150,20);
			lfn.setBounds(70,180,150,20);
			ldob.setBounds(70,210,150,20);
			lad.setBounds(70,240,150,20);
			lal.setBounds(70,270,150,20);
			las1.setBounds(70,300,150,20);
			las.setBounds(70,300,150,20);
			lcj.setBounds(70,330,150,20);
			lqu.setBounds(70,360,150,20);
			lge.setBounds(70,390,150,20);
			lyr.setBounds(70,420,150,20);
			ph.setBounds(70,450,150,20);
			lpadd.setBounds(70,480,150,20);
			leadd.setBounds(70,510,150,20);
			llp.setBounds(400,350,150,20);
			llp1.setBounds(470,330,150,20);
			llp2.setBounds(510,330,150,20);
			llp3.setBounds(550,330,150,20);
			llp4.setBounds(590,330,150,20);
			llp5.setBounds(630,330,150,20);
			llp6.setBounds(670,330,150,20);
			llp7.setBounds(710,330,150,20);
			lpp.setBounds(400,300,150,20);
			lpp1.setBounds(540,280,150,20);
			lpp2.setBounds(580,280,150,20);
			lpp3.setBounds(660,280,150,20);
			lcj1.setBounds(70,330,150,20);

			id.setBounds(190,120,150,20);
			name.setBounds(190,150,150,20);
			fn.setBounds(190,180,150,20);
			
			as.setBounds(190,300,150,20);
			cj.setBounds(190,330,150,20);
			qu.setBounds(190,360,150,20);
			phno.setBounds(190,450,150,20);
			padd.setBounds(190,480,150,20);
			eadd.setBounds(190,510,150,20);
			
		
			
			p1.setBounds(470,350,30,20);
			p2.setBounds(510,350,30,20);
			p3.setBounds(550,350,30,20);
			p4.setBounds(590,350,30,20);
			p5.setBounds(630,350,30,20);
			p6.setBounds(670,350,30,20);
			p7.setBounds(710,350,30,20);
		
			pp1.setBounds(540,300,30,20);
			pp2.setBounds(580,300,30,20);
			pp3.setBounds(660,300,30,20);
			
			
		

			
		
		new1.setBounds(450,450,100,30);
		save.setBounds(560,450,100,30);
		
		
		save.addActionListener(this);
		new1.addActionListener(this);

		

		
			lcou = new Choice();
		lcou.add("CSE");lcou.add("ECE");lcou.add("IT");lcou.add("EEE");lcou.add("CIVIL");lcou.add("MECH");
		yr = new Choice();
		yr.add("1");
		yr.add("2");
		yr.add("3");
		yr.add("4");
		gen = new Choice();
		gen.add("Male");
		gen.add("Fe male");
		
		lqul = new Choice();
		lqul.add("EAMCET");
		lqul.add("ECET");lqul.add("Managment");
		gen.setBounds(190,390,150,20);
		yr.setBounds(190,420,150,20);
		lcou.setBounds(190,330,150,20);
		lqul.setBounds(190,360,150,20);
			
			c.add(lid);
			c.add(lname);
			c.add(lfn);
			c.add(ldob);
			c.add(lad);
			c.add(lal);
			c.add(las);
			c.add(lcj);
			c.add(lqu);
			c.add(lge);
			c.add(lyr);
			c.add(ph);
			c.add(lpadd);
			c.add(leadd);
			c.add(llp);
			c.add(llp1);
			c.add(llp2);
			c.add(llp3);
			c.add(llp4);
			c.add(llp5);
			c.add(llp6);
			c.add(llp7);
			c.add(lpp);
			c.add(lpp1);
			c.add(lpp2);

			
			c.add(id);
			c.add(name);
			c.add(fn);
			c.add(dob1);
			c.add(dob2);
			c.add(dob3);
			c.add(add1);
			c.add(add2);
			c.add(add3);
			c.add(all1);
			c.add(all2);
			c.add(all3);
			c.add(as);
			c.add(lcou);

			c.add(lqul);
			c.add(gen);
			c.add(yr);
			c.add(phno);
			c.add(padd);
			c.add(eadd);
			c.add(p1);
			c.add(p2);
			c.add(p3);
			c.add(p4);
			c.add(p5);
			c.add(p6);
			c.add(p7);
			c.add(pp1);
			c.add(pp2);
		
			
			c.add(save);
			c.add(new1);
		
		//	cdlogo.setBounds(0,0,800,100);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);}
	public void actionPerformed(ActionEvent ae)
	{	
		String str1=(String)ae.getActionCommand();
		Object source = ae.getSource();
		
		if(source==new1)	
		{
			

			id.setEditable(true);
			name.setEditable(true);
			fn.setEditable(true);
			//dob.setEditable(true);
			//ad.setEditable(true);
			//al.setEditable(true);
			as.setEditable(true);
			//cj.setEditable(true);
			//qu.setEditable(true);
			phno.setEditable(true);
			padd.setEditable(true);
			eadd.setEditable(true);
			//as1.setEditable(true);
			//ex.setEditable(true);
			
			//lqul.setBounds(190,380,150,20);
			
			p1.setEditable(true);
			p2.setEditable(true);
			p3.setEditable(true);
			p4.setEditable(true);
			p5.setEditable(true);
			p6.setEditable(true);
			p7.setEditable(true);
		
			pp1.setEditable(true);
			pp2.setEditable(true);
			//pp3.setEditable(true);

			id.setText(null);
			name.setText(null);
			fn.setText(null);
			//dob.setText(null);
			//ad.setText(null);
			//al.setText(null);
			as.setText(null);
			//cj.setText(null);
			//qu.setText(null);
			phno.setText(null);
			padd.setText(null);
			eadd.setText(null);
			
			//lqul.setBounds(190,380,150,20);
			
			p1.setText(null);
			p2.setText(null);
			p3.setText(null);
			p4.setText(null);
			p5.setText(null);
			p6.setText(null);
			p7.setText(null);
		
			pp1.setText(null);
			pp2.setText(null);
			//as1.setText(null);
			//ex.setText(null);
			//pp3.setText(null);
			
		}
		if(source==home)
		{
			this.dispose();
			college1 t=new college1();
			t.nn();
		}
		if(source==save)
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
				
				if(((p1.getText().length()!=0)&&(Integer.parseInt(p1.getText())>100||Integer.parseInt(p1.getText())<0))||((p2.getText().length()!=0)&&(Integer.parseInt(p2.getText())>100||Integer.parseInt(p2.getText())<0))||((p3.getText().length()!=0)&&(Integer.parseInt(p3.getText())>100||Integer.parseInt(p3.getText())<0))||((p4.getText().length()!=0)&&(Integer.parseInt(p4.getText())>100||Integer.parseInt(p4.getText())<0))||((p5.getText().length()!=0)&&(Integer.parseInt(p5.getText())>100||Integer.parseInt(p5.getText())<0))||((p6.getText().length()!=0)&&(Integer.parseInt(p6.getText())>100||Integer.parseInt(p6.getText())<0))||((p7.getText().length()!=0)&&(Integer.parseInt(p7.getText())>100||Integer.parseInt(p7.getText())<0))||((pp1.getText().length()!=0)&&(Integer.parseInt(pp1.getText())>100||Integer.parseInt(pp1.getText())<0))||((pp2.getText().length()!=0)&&(Integer.parseInt(pp2.getText())>100||Integer.parseInt(pp2.getText())<0)))
				jp.showMessageDialog(this,"Progress must be Aboue 0 and Bellow 100","INFORMATION",jp.ERROR_MESSAGE);
				else
				{
					ResultSet rs1 = stm.executeQuery("select * from btech where sid="+id.getText());
					while(rs1.next())
					{	
						t=1;
					}
					if(t==0)
					{
						t=0;
						PreparedStatement ps  = c.prepareStatement("insert into btech values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
						ps.setString(10,all1.getSelectedItem());
						ps.setString(11,all2.getSelectedItem());
						ps.setString(12,all3.getSelectedItem());
						if((as.getText()).length()!=0)
						ps.setString(13,as.getText());
						else
						ps.setString(13,"");
						ps.setString(14,lcou.getSelectedItem());
						ps.setString(15,lqul.getSelectedItem());
						ps.setString(16,gen.getSelectedItem());
						ps.setString(17,yr.getSelectedItem());
						if((phno.getText()).length()!=0)
						ps.setString(18,phno.getText());
						else
						ps.setString(18,"");
						if((padd.getText()).length()!=0)
						ps.setString(19,padd.getText());
						else
						ps.setString(19,"");
						if((eadd.getText()).length()!=0)
						ps.setString(20,eadd.getText());
						else
						ps.setString(20,"");
						if((pp1.getText()).length()!=0)
						ps.setString(21,pp1.getText());
						else
						ps.setString(21,"");
						if((pp2.getText()).length()!=0)
						ps.setString(22,pp2.getText());
						else
						ps.setString(22,"");
						
						if((p1.getText()).length()!=0)
						ps.setString(23,p1.getText());
						else
						ps.setString(23,"");
						if((p2.getText()).length()!=0)
						ps.setString(24,p2.getText());
						else
						ps.setString(24,"");
						if((p3.getText()).length()!=0)
						ps.setString(25,p3.getText());
						else
						ps.setString(25,"");
						if((p4.getText()).length()!=0)
						ps.setString(26,p4.getText());
						else
						ps.setString(26,"");
						if((p5.getText()).length()!=0)
						ps.setString(27,p5.getText());
						else
						ps.setString(27,"");
						if((p6.getText()).length()!=0)
						ps.setString(28,p6.getText());
						else
						ps.setString(28,"");
						if((p7.getText()).length()!=0)
						ps.setString(29,p7.getText());
						else
						ps.setString(29,"");
						
						ps.executeUpdate();
						jp.showMessageDialog(this,"Record Inserted Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
					}
					else
					{
						jp.showMessageDialog(this,"Sorry, Record ID is Already Exists","INFORMATION",jp.ERROR_MESSAGE);
						t=0;
					}
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
	public void n22()
 	{
 		
		this.setResizable(false);
		
		
	 }
}
		

		