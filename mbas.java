import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
import javax.swing.JPopupMenu;
//import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
public class mbas extends JFrame implements ActionListener
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
	public mbas()
	{
		super("M.B.A. Students Details");
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
		JLabel lid = new JLabel("ID :");  
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
       		JLabel lp = new JLabel("Progress(%)"); 
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
		JLabel lpp = new JLabel("Previous Progress(%) :"); 
		lpp.setForeground(Color.black);
		JLabel lpp1 = new JLabel("Ssc"); 
		lpp1.setForeground(Color.black);
		JLabel lpp2 = new JLabel("Inter");
		lpp2.setForeground(Color.black);
		JLabel lpp3 = new JLabel("Degree");
		lpp3.setForeground(Color.black);
		
		tp=JOptionPane.showInputDialog("Enter Id of Student");	
		ImageIcon id1 = new ImageIcon("image/mba/"+tp+".JPEG");
			JLabel idd1 = new JLabel(id1);
			c.add(idd1);
		idd1.setBounds(500,100,200,230);
			
			
		
		id = new JTextField(); 
		id.setForeground(Color.black); 
		id.setBackground(Color.white);
		yr1 = new JTextField(); 
		yr1.setForeground(Color.black); 
		yr1.setBackground(Color.white);
		ge = new JTextField(); 
		ge.setForeground(Color.black); 
		ge.setBackground(Color.white);
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

		
		
		
	    	
        	
        	bupdate = new JButton("Update", new ImageIcon("image/other/update.gif"));
 		bupdate.setForeground(Color.black); 
		bupdate.setBackground(Color.gray);
		
			
		
		
		bupdate.setToolTipText("Update the record");	
		home = new JButton("Home",new ImageIcon("image/other/New.GIF")); 
		home.setForeground(Color.black); 
		home.setBackground(Color.gray);
        	home.setToolTipText("Goto Home Page");
        	home.setBounds(600,480,100,30);
		home.addActionListener(this);
		c.add(home);
		

			lid.setBounds(70,120,670,20);
			lname.setBounds(70,150,150,20);
			lfn.setBounds(70,180,150,20);
			ldob.setBounds(70,210,150,20);
			lad.setBounds(70,240,150,20);
			lal.setBounds(70,270,150,20);
			las.setBounds(70,300,150,20);
			las.setBounds(70,300,150,20);
			lcj.setBounds(70,330,150,20);
			lqu.setBounds(70,360,150,20);
			lge.setBounds(70,390,150,20);
			lyr.setBounds(70,420,150,20);
		
			ph.setBounds(70,450,150,20);
			lpadd.setBounds(70,480,150,20);
			leadd.setBounds(70,510,150,20);
			lp.setBounds(400,410,150,20);
			lp1.setBounds(470,390,150,20);
			lp2.setBounds(510,390,150,20);
			lp3.setBounds(550,390,150,20);
			lp4.setBounds(590,390,150,20);
			
			
			lpp.setBounds(400,360,150,20);
			lpp1.setBounds(540,340,150,20);
			lpp2.setBounds(580,340,150,20);
			lpp3.setBounds(620,340,150,20);
			
			lcj.setBounds(70,330,150,20);

			id.setBounds(190,120,150,20);
			name.setBounds(190,150,150,20);
			fn.setBounds(190,180,150,20);
			do1.setBounds(190,210,40,20);
			do2.setBounds(240,210,45,20);
			do3.setBounds(295,210,45,20);
			ad1.setBounds(190,240,40,20);
			ad2.setBounds(240,240,45,20);
			ad3.setBounds(295,240,45,20);
			al1.setBounds(190,270,40,20);
			al2.setBounds(240,270,45,20);
			al3.setBounds(295,270,45,20);
			as.setBounds(190,300,150,20);
			cj.setBounds(190,330,150,20);
			qu.setBounds(190,360,150,20);
			phno.setBounds(190,450,150,20);
			padd.setBounds(190,480,150,20);
			eadd.setBounds(190,510,150,20);
			yr1.setBounds(190,420,150,20);
			ge.setBounds(190,390,150,20);
			
			p1.setBounds(470,410,30,20);
			p2.setBounds(510,410,30,20);
			p3.setBounds(550,410,30,20);
			p4.setBounds(590,410,30,20);
			
		
			pp1.setBounds(540,360,30,20);
			pp2.setBounds(580,360,30,20);
			pp3.setBounds(620,360,30,20);
			

			

			ImageIcon backg = new ImageIcon("mbas.GIF");
			JLabel cdlogo = new JLabel(backg);
			c.add(cdlogo);  
			 
		bupdate.setBounds(450,480,105,30);
		
			c.add(lid);
			c.add(lname);
			c.add(lfn);
			c.add(ldob);
			c.add(lad);
			c.add(lal);
			c.add(las);
			c.add(lcj);
			c.add(lqu);
			c.add(ph);
			c.add(lpadd);
			c.add(leadd);
			c.add(lp);
			c.add(lp1);
			c.add(lp2);
			c.add(lp3);
			c.add(lp4);
			
			
			c.add(lpp);
			c.add(lpp1);
			c.add(lpp2);
			c.add(lpp3);
			c.add(lyr);
			c.add(lge);
			
			c.add(id);
			c.add(name);
			c.add(fn);
			c.add(do1);
			c.add(do2);
			c.add(do3);
			c.add(ad1);
			c.add(ad2);
			c.add(ad3);
			c.add(al1);
			c.add(al2);
			c.add(al3);
			c.add(as);
			c.add(cj);
			c.add(yr1);
			c.add(ge);
			c.add(qu);
			c.add(phno);
			c.add(padd);
			c.add(eadd);
			c.add(p1);
			c.add(p2);
			c.add(p3);
			c.add(p4);
			
			
			c.add(pp1);
			c.add(pp2);
			c.add(pp3);
			c.add(idd1);
			c.add(bupdate);
			
		
			//cdlogo.setBounds(0,0,800,100);
			bupdate.addActionListener(this);
			//cdok.setBounds(200,420,98,25);
			//cdok.addActionListener(this);
		   
		
		
			if(tp.length()!=0)
			{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection c = DriverManager.getConnection("jdbc:odbc:sysDSN","system","tiger");
				Statement stm = c.createStatement();
				t=0;
				ResultSet rs = stm.executeQuery("select * from mba where sid="+tp);
				while(rs.next())
				{	
					t=1;
				
			
					id.setText(rs.getString("sid"));
			        	name.setText(rs.getString("name"));	
			    		fn.setText(rs.getString("fname"));
					do1.setText(rs.getString("do1"));
			    		do2.setText(rs.getString("do2"));
					do3.setText(rs.getString("do3"));
					ad1.setText(rs.getString("ad1"));
			    		ad2.setText(rs.getString("ad2"));
					ad3.setText(rs.getString("ad3"));
					al1.setText(rs.getString("al1"));
			    		al2.setText(rs.getString("al2"));
					al3.setText(rs.getString("al3"));
					as.setText(rs.getString("ad"));
			    		cj.setText(rs.getString("cou"));
					qu.setText(rs.getString("join"));
					ge.setText(rs.getString("gen"));
			    		yr1.setText(rs.getString("year"));
					phno.setText(rs.getString("phno"));
					padd.setText(rs.getString("padd"));
			    		eadd.setText(rs.getString("eadd"));
					pp1.setText(rs.getString("pp1"));
					pp2.setText(rs.getString("pp2"));
					pp3.setText(rs.getString("pp3"));
					p1.setText(rs.getString("p1"));
					p2.setText(rs.getString("p2"));
					p3.setText(rs.getString("p3"));
					p4.setText(rs.getString("p4"));
					
					
				}
				if(t==0)
				{
					jp.showMessageDialog(this,"Sorry, No Such Record exisits","INFORMATION",jp.ERROR_MESSAGE);
					t=0;
				}
		        	c.close();
				stm.close();
		}
		catch(ClassNotFoundException cnf)
		{
			jp.showMessageDialog(this,cnf,"EXCEPTION",jp.ERROR_MESSAGE);
			System.out.println("Cnf Exception");
		}
		catch(SQLException sql)
		{
			jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
		}
			}
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
		if(source==bupdate)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection c = DriverManager.getConnection("jdbc:odbc:sysDSN","system","tiger");
				Statement stm = c.createStatement();
				ResultSet rs = stm.executeQuery("select * from pd");
				t=0;
				if((Integer.parseInt(yr1.getText())>2)||(Integer.parseInt(yr1.getText())<1))
				jp.showMessageDialog(this,"Year Range Between 1-2 Years","INFORMATION",jp.ERROR_MESSAGE);
			else
			{
				if(((phno.getText()).length()!=0)&&((phno.getText()).length()!=10))
			jp.showMessageDialog(this,"Phone Number Must Contains 10 Digits","INFORMATION",jp.ERROR_MESSAGE);
			else
			{
				
				if(((p1.getText().length()!=0)&&(Integer.parseInt(p1.getText())>100||Integer.parseInt(p1.getText())<0))||((p2.getText().length()!=0)&&(Integer.parseInt(p2.getText())>100||Integer.parseInt(p2.getText())<0))||((p3.getText().length()!=0)&&(Integer.parseInt(p3.getText())>100||Integer.parseInt(p3.getText())<0))||((p4.getText().length()!=0)&&(Integer.parseInt(p4.getText())>100||Integer.parseInt(p4.getText())<0))||((pp3.getText().length()!=0)&&(Integer.parseInt(pp3.getText())>100||Integer.parseInt(pp3.getText())<0))||((pp1.getText().length()!=0)&&(Integer.parseInt(pp1.getText())>100||Integer.parseInt(pp1.getText())<0))||((pp2.getText().length()!=0)&&(Integer.parseInt(pp2.getText())>100||Integer.parseInt(pp2.getText())<0)))
				jp.showMessageDialog(this,"Progress must be Aboue 0 and Bellow 100","INFORMATION",jp.ERROR_MESSAGE);
				else
				{
					ResultSet rs1 = stm.executeQuery("select * from mba where sid="+id.getText());
					while(rs1.next())
					{	
						t=1;
					}
					if(t==1)
					{
						t=0;
						//if(((id.getText()).length()!=0)&&(((name.getText()).length()!=0)||((fn.getText()).length()!=0)||((cj.getText()).length()!=0)||((dob.getText()).length()!=0)||((ad.getText()).length()!=0)||((phno.getText()).length()!=0)||((qu.getText()).length()!=0)||((as.getText()).length()!=0)||((padd.getText()).length()!=0)||((eadd.getText()).length()!=0)))
						{
							if((name.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set name=? where sid="+id.getText());	
								ps.setString(1,name.getText());	ps.executeUpdate();
							}
							if((fn.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set fname=? where sid="+id.getText());	
								ps.setString(1,fn.getText());ps.executeUpdate();
							}
							if((do1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set do1=? where sid="+id.getText());	
								ps.setString(1,do1.getText());ps.executeUpdate();
							}
							
							if((do2.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set do2=? where sid="+id.getText());	
								ps.setString(1,do2.getText());ps.executeUpdate();
							}
							
							if((do3.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set do3=? where sid="+id.getText());	
								ps.setString(1,do3.getText());ps.executeUpdate();
							}
							
							if((ad1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set ad1=? where sid="+id.getText());	
								ps.setString(1,ad1.getText());ps.executeUpdate();
							}
							
							if((ad2.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set ad2=? where sid="+id.getText());	
								ps.setString(1,ad2.getText());ps.executeUpdate();
							}
							
							if((ad3.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set ad3=? where sid="+id.getText());	
								ps.setString(1,ad3.getText());ps.executeUpdate();
							}
							
							
							if((al1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set al1=? where sid="+id.getText());	
								ps.setString(1,al1.getText());ps.executeUpdate();
							}
							if((al2.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set al2=? where sid="+id.getText());	
								ps.setString(1,al2.getText());ps.executeUpdate();
							}if((al3.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set al3=? where sid="+id.getText());	
								ps.setString(1,al3.getText());ps.executeUpdate();
							}
							if((as.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set ad=? where sid="+id.getText());	
								ps.setString(1,as.getText());ps.executeUpdate();
							}
							if((cj.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set cou=? where sid="+id.getText());	
								ps.setString(1,cj.getText());ps.executeUpdate();
							}
							if((qu.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set join=? where sid="+id.getText());	
								ps.setString(1,qu.getText());ps.executeUpdate();
							}
							if((ge.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set gen=? where sid="+id.getText());	
								ps.setString(1,ge.getText());ps.executeUpdate();
							}
							if((yr1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set year=? where sid="+id.getText());	
								ps.setString(1,yr1.getText());ps.executeUpdate();
							}
							if((phno.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set phno=? where sid="+id.getText());	
								ps.setString(1,phno.getText());ps.executeUpdate();
							}
							if((padd.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set padd=? where sid="+id.getText());	
								ps.setString(1,padd.getText());ps.executeUpdate();
							}
							if((eadd.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set eadd=? where sid="+id.getText());	
								ps.setString(1,eadd.getText());ps.executeUpdate();
							}
							if((pp1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set pp1=? where sid="+id.getText());	
								ps.setString(1,pp1.getText());ps.executeUpdate();
							}
							if((pp2.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set pp2=? where sid="+id.getText());	
								ps.setString(1,pp2.getText());ps.executeUpdate();
							}
							if((pp3.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set pp3=? where sid="+id.getText());	
								ps.setString(1,pp3.getText());ps.executeUpdate();
							}
							if((p1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set p1=? where sid="+id.getText());	
								ps.setString(1,p1.getText());ps.executeUpdate();
							}
							if((p2.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set p2=? where sid="+id.getText());	
								ps.setString(1,p2.getText());ps.executeUpdate();
							}
							if((p3.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set p3=? where sid="+id.getText());	
								ps.setString(1,p3.getText());ps.executeUpdate();
							}
							if((p4.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update mba set p4=? where sid="+id.getText());	
								ps.setString(1,p4.getText());ps.executeUpdate();
							}
							
							
							jp.showMessageDialog(this,"Record Updated Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
						}
						
					}
					else
					{
						jp.showMessageDialog(this,"Sorry, No Such Record exisits","INFORMATION",jp.ERROR_MESSAGE);
						t=0;
		
					}
				}
			}}
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
	}	
	public void n7()
 	{
 		this.setResizable(false);
		 
	 }
}