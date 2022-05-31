import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
import javax.swing.JPopupMenu;
//import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
public class college1 extends JFrame implements ActionListener
{
	JTextField qu1,ex1,rat1,qu2,qu3,uname,ge,yr1,un,id,name,fn,as,as1,jo1,ge1,d1,q1,dob,ad,al,cj,cj1,ex,qu,phno,padd,eadd,p1,p2,p3,p4,p5,p6,p7,pp1,pp2,pp3,do1,do2,do3,ad1,ad2,ad3,al1,al2,al3;
	JPasswordField opd,cpd,npd,pa;
	Container c;
	JButton bte,bts,mbe,mbs,mce,mcs,nte,nts,tee,tes;
	JButton cd,abd,abp,abu;
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
	public college1()
	{
		super("College Management");
		c = getContentPane(); c.setBackground(new Color(238,148,13));
		c.setLayout(null); 
		setBounds(0,0,850,590);
		setFont(new Font("Brejesh",50,44));
		cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
		setCursor(cur);
		
		ImageIcon coll = new ImageIcon("image/other/college.jpg");
		JLabel LogoColl = new JLabel(coll);
		
		menuBar = new JMenuBar(); 	
		menu1 = new JMenu("File");
		menu1.setBackground(Color.white);
		menu1.setMnemonic('F');	
		menu2 = new JMenu("Entry");	
		menu2.setBackground(Color.white);
		menu2.setMnemonic('E');
		menu3 = new JMenu("Show"); 	
		menu3.setMnemonic('S');	
		menu3.setBackground(Color.white);
		menu4 = new JMenu("Help"); 	
		menu4.setMnemonic('H');	
		menu4.setBackground(Color.white);
		menuItemS = new JMenu("Studets"); 
		menuItemS.setBackground(Color.white);
		menuItemS.setMnemonic('t');
		menuItemT = new JMenu("Staff");
		menuItemT.setBackground(Color.white);
		menuItemT.setMnemonic('a');
		menuItemE = new JMenuItem("Exit",new ImageIcon("image/other/Exit.PNG")); 
		menuItemE.setBackground(Color.white);
		menuItemE.setMnemonic('E');
		menuItemSS = new JMenu("Studets"); 
		menuItemSS.setBackground(Color.white);
		menuItemSS.setMnemonic('t');
		menuItemST = new JMenu("Staff");
		menuItemST.setBackground(Color.white);
		menuItemST.setMnemonic('a');
		menuItemus = new JMenu("Studets"); 
		menuItemus.setBackground(Color.white);
		menuItemus.setMnemonic('t');
		menuItemut = new JMenu("Staff");
		menuItemut.setBackground(Color.white);
		menuItemut.setMnemonic('a');
		menuItemU = new JMenuItem("About US");
		menuItemU.setBackground(Color.white);
		menuItemU.setMnemonic('U');
		menuItemA = new JMenuItem("About Project",new ImageIcon("image/other/help.gif")); 
		menuItemA.setBackground(Color.white);
		menuItemA.setMnemonic('E');
		btech = new JMenuItem("B.Tech"); 
		btech.setBackground(Color.white);
		btech.setMnemonic('T');
		
		btechs = new JMenuItem("B.Tech");
		btechs.setBackground(Color.white);
		btechs.setMnemonic('T');
		
		mca = new JMenuItem("MCA");
		mca.setBackground(Color.white);
		mca.setMnemonic('C');
		
		mcas = new JMenuItem("MCA");
		mcas.setBackground(Color.white);
		mcas.setMnemonic('C');
		mba = new JMenuItem("MBA");
		mba.setBackground(Color.white);
		mba.setMnemonic('A');
		
		mbas = new JMenuItem("MBA");
		mbas.setBackground(Color.white);
		mbas.setMnemonic('A');
		tech = new JMenuItem("TEACHING");
		tech.setBackground(Color.white);
		tech.setMnemonic('I');
		
		techs = new JMenuItem("TEACHING");
		techs.setBackground(Color.white);
		techs.setMnemonic('I');
		ntech = new JMenuItem("NON TEACHING");
		ntech.setBackground(Color.white);
		ntech.setMnemonic('N');
		
		ntechs = new JMenuItem("NON TEACHING");
		ntechs.setBackground(Color.white);
		ntechs.setMnemonic('N');
		menuItemD = new JMenuItem("About DataBase",new ImageIcon("image/other/bookbig.gif"));
		menuItemD.setBackground(Color.white);
		menuItemD.setMnemonic('A');
		
		

		cdpd= new JMenuItem("Change Password",new ImageIcon("image/other/lock.PNG"));
		cdpd.setBackground(Color.white);
		cdpd.setMnemonic('P');
		setJMenuBar(menuBar);


		bte = new JButton(new ImageIcon("image/other/bteche.PNG")); 
		bte.setForeground(Color.black); 
		bte.setBackground(Color.green);
        	bte.setToolTipText("B.Tech Entry");
        	bte.setBounds(10,110,50,50);
		bte.addActionListener(this);
		c.add(bte);
		bts = new JButton(new ImageIcon("image/other/btechs.PNG")); 
		bts.setForeground(Color.black); 
		bts.setBackground(Color.green);
        	bts.setToolTipText("Show B.Tech");
        	bts.setBounds(70,110,50,50);
		bts.addActionListener(this);
		c.add(bts);
		mce = new JButton(new ImageIcon("image/other/mcae.PNG")); 
		mce.setForeground(Color.black); 
		mce.setBackground(Color.green);
        	mce.setToolTipText("M.C.A. Entry");
        	mce.setBounds(130,110,50,50);
		mce.addActionListener(this);
		c.add(mce);
		mcs = new JButton(new ImageIcon("image/other/mcas.PNG")); 
		mcs.setForeground(Color.black); 
		mcs.setBackground(Color.green);
        	mcs.setToolTipText("Show M.C.A.");
        	mcs.setBounds(190,110,50,50);
		mcs.addActionListener(this);
		c.add(mcs);
		mbe = new JButton(new ImageIcon("image/other/mbae.PNG")); 
		mbe.setForeground(Color.black); 
		mbe.setBackground(Color.green);
        	mbe.setToolTipText("M.B.A. Entry");
        	mbe.setBounds(250,110,50,50);
		mbe.addActionListener(this);
		c.add(mbe);
		mbs = new JButton(new ImageIcon("image/other/mbas.PNG")); 
		mbs.setForeground(Color.black); 
		mbs.setBackground(Color.green);
        	mbs.setToolTipText("Show M.B.A.");
        	mbs.setBounds(310,110,50,50);
		mbs.addActionListener(this);
		c.add(mbs);
		tee = new JButton(new ImageIcon("image/other/teche.PNG")); 
		tee.setForeground(Color.black); 
		tee.setBackground(Color.green);
        	tee.setToolTipText("Teching Staff Entry");
        	tee.setBounds(370,110,50,50);
		tee.addActionListener(this);
		c.add(tee);
		tes = new JButton(new ImageIcon("image/other/techs.PNG")); 
		tes.setForeground(Color.black); 
		tes.setBackground(Color.green);
        	tes.setToolTipText("Show Teching Staff");
        	tes.setBounds(430,110,50,50);
		tes.addActionListener(this);
		c.add(tes);
		nte = new JButton(new ImageIcon("image/other/nteche.PNG")); 
		nte.setForeground(Color.black); 
		nte.setBackground(Color.green);
        	nte.setToolTipText("NON-Tech Entry");
        	nte.setBounds(490,110,50,50);
		nte.addActionListener(this);
		c.add(nte);
		nts = new JButton(new ImageIcon("image/other/ntechs.PNG")); 
		nts.setForeground(Color.black); 
		nts.setBackground(Color.green);
        	nts.setToolTipText("Show NON-Tech");
        	nts.setBounds(550,110,50,50);
		nts.addActionListener(this);
		c.add(nts);
		cd = new JButton(new ImageIcon("image/other/lock.PNG")); 
		cd.setForeground(Color.black); 
		cd.setBackground(Color.green);
        	cd.setToolTipText("Change Password");
        	cd.setBounds(610,110,50,50);
		cd.addActionListener(this);
		c.add(cd);
		abp = new JButton(new ImageIcon("image/other/help.GIF")); 
		abp.setForeground(Color.black); 
		abp.setBackground(Color.green);
        	abp.setToolTipText("About Project");
        	abp.setBounds(670,110,50,50);
		abp.addActionListener(this);
		c.add(abp);
		abd = new JButton(new ImageIcon("image/other/bookbig.GIF")); 
		abd.setForeground(Color.black); 
		abd.setBackground(Color.green);
        	abd.setToolTipText("About DataBase");
        	abd.setBounds(730,110,50,50);
		abd.addActionListener(this);
		c.add(abd);
		abu = new JButton(new ImageIcon("image/other/abs.PNG")); 
		abu.setForeground(Color.black); 
		abu.setBackground(Color.green);
        	abu.setToolTipText("About US");
        	abu.setBounds(790,110,50,50);
		abu.addActionListener(this);
		c.add(abu);
		
		
		
		
		ImageIcon background = new ImageIcon("image/other/backg.jpg");
		JLabel img = new JLabel(background);

		ImageIcon college = new ImageIcon("image/other/Movie1.jpg");
		JLabel colLogo = new JLabel(college);
		colLogo.setBounds(0,0,850,100);
		c.add(colLogo);
		

			
		LogoColl.setBounds(0,170,850,550);
		


		
		
		//LogoColl.setBounds(100,300,850,142);
		
		img.setBounds(90,100,20,40);
		
		
		

		menu1.add(cdpd);
		menu1.add(menuItemE);
		
		menuItemS.add(btech);
		menuItemS.add(mca);
		menuItemS.add(mba);
		menu2.add(menuItemS);
		
		menuItemT.add(tech);
		menuItemT.add(ntech);
		menu2.add(menuItemT);
		
		
		
		
		menuItemSS.add(btechs);
		menuItemSS.add(mcas);
		menuItemSS.add(mbas);
		menu3.add(menuItemSS);
		
		menuItemST.add(techs);
		menuItemST.add(ntechs);
		menu3.add(menuItemST);
		
		
		
		menu4.add(menuItemA);
		menu4.add(menuItemD);
		menu4.add(menuItemU);
		
		
		
		menuItemS.addActionListener(this);
		menuItemT.addActionListener(this);
		menuItemSS.addActionListener(this);
		menuItemST.addActionListener(this);
		menuItemA.addActionListener(this);
		menuItemD.addActionListener(this);
		menuItemU.addActionListener(this);
		menuItemE.addActionListener(this);

		btech.addActionListener(this);
		btechs.addActionListener(this);	
		mca.addActionListener(this);
		mcas.addActionListener(this);
		
		mba.addActionListener(this);
		mbas.addActionListener(this);
		
		tech.addActionListener(this);
		techs.addActionListener(this);
		
		ntech.addActionListener(this);
		ntechs.addActionListener(this);
		
		cdpd.addActionListener(this);

				menuBar.add(menu1);
				menuBar.add(menu2);
				menuBar.add(menu3);
				menuBar.add(menu4);
			
		
	
		
		
		c.add(LogoColl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		String str1=(String)ae.getActionCommand();
		Object source = ae.getSource();
		
		

		if(source==menuItemU||source==abu)
		{
			this.dispose();
			aboutus u=new aboutus();
			u.n1();
		}
		if(source==menuItemD||source==abd)
		{
			this.dispose();
			aboutdb u1=new aboutdb();
			u1.n2();
		}
		
		
		if(source==menuItemE)
		{
			System.exit(0);
			jp = new JOptionPane();
		}	
		if(source==btech||source==bte)
		{	this.dispose();
			btech u2=new btech();
			u2.n22();
		}	
		
		
 		
		if(source==mca||source==mce)
		{	this.dispose();
			mca u4=new mca();
			u4.n4();
			
 		}
		
		if(source==mba||source==mbe)
		{	this.dispose();
			mba u6=new mba();
			u6.n6();
 		}
		
		if(source==tech||source==tee)
		{	this.dispose();
			tech u8=new tech();
			u8.n8();
			
 		}	
		
		if(source==ntech||source==nte)
		{	this.dispose();
			ntech u10=new ntech();
			u10.n10();
			
 		}
		if(source==btechs||source==bts)
		{	this.dispose();
			btechs u3=new btechs();
			u3.n3();
		}
		if(source==mcas||source==mcs)
		{	this.dispose();
			mcas u5=new mcas();
			u5.n5();
 		}
		if(source==mbas||source==mbs)
		{	this.dispose();
			mbas u7=new mbas();
			u7.n7();
 		}	
		if(source==techs||source==tes)
		{	this.dispose();
			techs u9=new techs();
			u9.n9();
		
		}	
		if(source==ntechs||source==nts)
		{	this.dispose();
			ntechs u11=new ntechs();
			u11.n11();
 		}
		
		
		if(source==cdpd||source==cd)
		{	this.dispose();
			cpass u18=new cpass();
			u18.n18();
 		}
		
		
		if(source==menuItemA||source==abp)
		{this.dispose();
			aboutp u13=new aboutp();
			u13.n13();
 		}
		
		
		if(str1.equals("Exit"))
		{
			System.exit(0);
		}
	  }	
	public void nn()
 	{
 		college1 u=new college1();
		u.setResizable(false);
		u.setBounds(0,0,850,590);
		u.show();
	 }
}