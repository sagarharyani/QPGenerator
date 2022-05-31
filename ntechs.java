import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
import javax.swing.JPopupMenu;
//import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
public class ntechs extends JFrame implements ActionListener
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
	public ntechs()
	{
		super("NON-Teaching Staff Details");
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
		
		

		tp=JOptionPane.showInputDialog("Enter Id of  Empolyee");
		ImageIcon id1 = new ImageIcon("image/nontech/"+tp+".JPEG");
			JLabel idd1 = new JLabel(id1);
			c.add(idd1);
		idd1.setBounds(500,100,200,230);

			
		
		JLabel ldep = new JLabel("Department :"); 
		ldep.setForeground(Color.black);
		
		
		
		
       		JLabel lex = new JLabel("Experience (Yr's):");
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
		ex1 = new JTextField();		
		ex1.setForeground(Color.black);
		ex1.setBackground(Color.white);
		rat1 = new JTextField();		
		rat1.setForeground(Color.black);
		rat1.setBackground(Color.white);
		as1 = new JTextField(); 
		as1.setForeground(Color.black); 
		as1.setBackground(Color.white);
		jo1 = new JTextField(); 
		jo1.setForeground(Color.black); 
		jo1.setBackground(Color.white);
		d1 = new JTextField(); 
		d1.setForeground(Color.black); 
		d1.setBackground(Color.white);
		q1 = new JTextField(); 
		q1.setForeground(Color.black); 
		q1.setBackground(Color.white);
		ge1 = new JTextField(); 
		ge1.setForeground(Color.black); 
		ge1.setBackground(Color.white);
		
		phno = new JTextField();  
		phno.setForeground(Color.black); 
		phno.setBackground(Color.white);
	      	padd = new JTextField();		
		padd.setForeground(Color.black); 
		padd.setBackground(Color.white);
		eadd = new JTextField();		
		eadd.setForeground(Color.black); 
		eadd.setBackground(Color.white);
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
		
		
		nupdate = new JButton("Update", new ImageIcon("image/other/update.gif"));
 		nupdate.setForeground(Color.white); 
		nupdate.setBackground(new Color(128,0,0));
		
			
		
		
		nupdate.setToolTipText("Update the record");	
			  
			 
		nupdate.setBounds(450,480,105,30);
		home = new JButton("Home",new ImageIcon("image/other/New.GIF")); 
		home.setForeground(Color.white); 
		home.setBackground(new Color(128,0,0));
        	home.setToolTipText("Goto Home Page");
        	home.setBounds(600,480,100,30);
		home.addActionListener(this);
		c.add(home);
	    	
		

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
			ex1.setBounds(190,330,100,20);
			ex.setBounds(300,330,40,20);
			id.setBounds(190,120,150,20);
			name.setBounds(190,150,150,20);
			fn.setBounds(190,180,150,20);
			as1.setBounds(190,420,150,20);
			do1.setBounds(190,210,40,20);
			do2.setBounds(240,210,45,20);
			do3.setBounds(295,210,45,20);
			ad1.setBounds(190,240,40,20);
			ad2.setBounds(240,240,45,20);
			ad3.setBounds(295,240,45,20);
			jo1.setBounds(190,270,150,20);
			d1.setBounds(190,300,150,20);
			q1.setBounds(190,360,150,20);
			ge1.setBounds(190,390,150,20);

			phno.setBounds(190,450,150,20);
			padd.setBounds(190,480,150,20);
			eadd.setBounds(190,510,150,20);
			
		rat1.setBounds(190,540,150,20);
			
			
			
		
		
		
			
			
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
			c.add(ph);
			c.add(lpadd);
			c.add(leadd);
			c.add(lge);
			c.add(lqu1);

			c.add(id);
			c.add(name);
			c.add(fn);
			c.add(do1);
			c.add(do2);
			c.add(do3);
			c.add(ad1);
			c.add(ad2);
			c.add(ad3);
			c.add(ex1);
			c.add(ex);
			c.add(as1);
			c.add(rat1);
			c.add(d1);
			c.add(q1);
			c.add(phno);
			c.add(padd);
			c.add(eadd);
			c.add(jo1);
			c.add(ge1);
			c.add(nupdate);
			
			
			//cd.getContentPane().add(new2);
			
		nupdate.addActionListener(this);
			//cdlogo.setBounds(0,0,800,100);
			
			  
			if(tp.length()!=0)
			{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection c = DriverManager.getConnection("jdbc:odbc:sysDSN","system","tiger");
				Statement stm = c.createStatement();
				t=0;
				ResultSet rs = stm.executeQuery("select * from ntech where sid="+tp);
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
					
					
			    		jo1.setText(rs.getString("job"));
					d1.setText(rs.getString("dep"));
					ex1.setText(rs.getString("exp"));
			    		ex.setText(rs.getString("exp1"));
					q1.setText(rs.getString("qual"));
					ge1.setText(rs.getString("gen"));
					as1.setText(rs.getString("sal"));
			    		phno.setText(rs.getString("phno"));
					padd.setText(rs.getString("padd"));
					eadd.setText(rs.getString("eadd"));
					rat1.setText(rs.getString("rat"));	
					
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
		if(source==nupdate)
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
					if(t==1)
					{
						t=0;
						//if(((id.getText()).length()!=0)&&(((name.getText()).length()!=0)||((fn.getText()).length()!=0)||((cj.getText()).length()!=0)||((dob.getText()).length()!=0)||((ad.getText()).length()!=0)||((phno.getText()).length()!=0)||((qu.getText()).length()!=0)||((as.getText()).length()!=0)||((padd.getText()).length()!=0)||((eadd.getText()).length()!=0)))
						{
							if((name.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set name=? where sid="+id.getText());	
								ps.setString(1,name.getText());	ps.executeUpdate();
							}
							if((fn.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set fname=? where sid="+id.getText());	
								ps.setString(1,fn.getText());ps.executeUpdate();
							}
							if((do1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set do1=? where sid="+id.getText());	
								ps.setString(1,do1.getText());ps.executeUpdate();
							}
							
							if((do2.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set do2=? where sid="+id.getText());	
								ps.setString(1,do2.getText());ps.executeUpdate();
							}
							
							if((do3.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set do3=? where sid="+id.getText());	
								ps.setString(1,do3.getText());ps.executeUpdate();
							}
							
							if((ad1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set ad1=? where sid="+id.getText());	
								ps.setString(1,ad1.getText());ps.executeUpdate();
							}
							
							if((ad2.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set ad2=? where sid="+id.getText());	
								ps.setString(1,ad2.getText());ps.executeUpdate();
							}
							
							if((ad3.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set ad3=? where sid="+id.getText());	
								ps.setString(1,ad3.getText());ps.executeUpdate();
							}
							
							
							if((jo1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set job=? where sid="+id.getText());	
								ps.setString(1,jo1.getText());ps.executeUpdate();
							}
							if((d1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set dep=? where sid="+id.getText());	
								ps.setString(1,d1.getText());ps.executeUpdate();
							}
							if((ex.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set exp=? where sid="+id.getText());	
								ps.setString(1,ex.getText());ps.executeUpdate();
							}
							if((q1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set qual=? where sid="+id.getText());	
								ps.setString(1,q1.getText());ps.executeUpdate();
							}
							if((ge1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set gen=? where sid="+id.getText());	
								ps.setString(1,ge1.getText());ps.executeUpdate();
							}
							if((as1.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set sal=? where sid="+id.getText());	
								ps.setString(1,as1.getText());ps.executeUpdate();
							}
							
							if((phno.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set phno=? where sid="+id.getText());	
								ps.setString(1,phno.getText());ps.executeUpdate();
							}
							if((padd.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set padd=? where sid="+id.getText());	
								ps.setString(1,padd.getText());ps.executeUpdate();
							}
							if((eadd.getText()).length()!=0)
							{
								PreparedStatement ps=c.prepareStatement ("Update ntech set eadd=? where sid="+id.getText());	
								ps.setString(1,eadd.getText());ps.executeUpdate();
							}
							
							
							jp.showMessageDialog(this,"Record Updated Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
						}
						/*else
						{
							jp.showMessageDialog(this,"Fields are Incomplete or Incorrect","INFORMATION",jp.ERROR_MESSAGE);
						}*/
					}
					else
					{
						jp.showMessageDialog(this,"Sorry, No Such Record exisits","INFORMATION",jp.ERROR_MESSAGE);
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
				jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
			}
		}
	 }	
	public void n11()
 	{
 		this.setResizable(false);
		
	 }
}