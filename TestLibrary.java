import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;


class TestLibraryDemo extends JFrame implements ActionListener, ListSelectionListener
{
	LibraryCollection library;

	//------------------------------------------------------------------------------
	// ªÁøÎ¿⁄ UI∏¶ ¿ß«ÿ « ø‰«— ∫ØºˆµÈ º±æ 
	//------------------------------------------------------------------------------
<<<<<<< HEAD
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel jp1;
	private JPanel jp2;
	private JPanel jp3;
	private JPanel jp4;
=======
	private JPanel pup;
	private JPanel pdown;
	private JPanel pdown1;
	private JPanel pdown2;
	//private JPanel panel3;
	//private JPanel panel4;
	private JPanel pdown1left1;
	private JPanel pdown1left2;
	private JPanel pdown2right1;
	private JPanel pdown2right2;
	private JPanel pdown2right2up;
	private JPanel pdown2right2down;
	//private JPanel jp4;
>>>>>>> Tbranch
	
	
	private JTextField title;
	private JTextField publisher;
	private JTextField authors;
	private JTextField isbn;
	private JTextField availability;
	private JTextField renting;
	
	private JTextField id;
	private JTextField pw;
	private JTextField name;
	private JTextField major;
	private JTextField curious;
	
	private JButton Jlogin; //∑Œ±◊¿Œ πˆ∆∞
	private JButton Jjoin; //»∏ø¯∞°¿‘ πˆ∆∞
	private JButton Jsearch; //∞Àªˆ πˆ∆∞
	
	private JButton Jadd; //√ﬂ∞° πˆ∆∞
	private JButton Jmod; //ºˆ¡§ πˆ∆∞
	private JButton Jdel; //ªË¡¶ πˆ∆∞
	
	private JButton Jsearch; //∞Àªˆ πˆ∆∞
	private JTextField curious; // ∞Àªˆ √¢
	
	private JList list; // µµº≠∏Ò∑œ
	//private JLabel icon;
	private JTextArea info; //µµº≠ ¡§∫∏
	public int a;
	
	JMenuItem jmi1;
	JMenuItem jmi2;
	
	


	//------------------------------------------------------------------------------
	//ª˝º∫¿⁄ - GUI∏¶ ±∏º∫«—¥Ÿ.
	//------------------------------------------------------------------------------
	
	
	public TestLibraryDemo() 
	{
		JMenuBar jmb=new JMenuBar();
		JMenu menu=new JMenu("∆ƒ¿œ");
		jmi1=new JMenuItem("∫“∑Øø¿±‚");
		menu.add(jmi1);
		jmi2=new JMenuItem("¿˙¿Â«œ±‚");
		menu.add(jmi2);
		jmb.add(menu);
		
		setJMenuBar(jmb);
		jmi1.setAccelerator(KeyStroke.getKeyStroke('O',Event.CTRL_MASK));//Ctrl+0
		jmi2.setAccelerator(KeyStroke.getKeyStroke('S',Event.CTRL_MASK));//Ctrl+S
		
		library=new LibraryCollection();	

		//------------------------------------------------------------------------------
		// ªÁøÎ¿⁄ »≠∏Èø° ƒƒ∆˜≥Õ∆ÆµÈ ±∏º∫«œø© πËƒ°
		// ∞¢ ƒƒ∆˜≥Õ∆Æ ±∏º∫Ω√ « ø‰«— ∏ÆΩ∫≥  √ﬂ∞°
		//------------------------------------------------------------------------------
		pup = new JPanel();
		//pup.setLayout(new GridLayout(1,6));
		id = new JTextField(10);
		pw = new JTextField(10);	
		Jlogin = new JButton("∑Œ ±◊ ¿Œ");
		Jjoin = new JButton("»∏ø¯∞°¿‘");
		pup.add(new Label("ID:"));
		pup.add(id);
		pup.add(new Label("PW:"));
		pup.add(pw);
		pup.add(Jlogin);
		pup.add(Jjoin);
		
		pdown = new JPanel();
		pdown.setLayout(new GridLayout(1,2));
		
		pdown1 = new JPanel();
		pdown1.setLayout(new BorderLayout());
		
		pdown1left1 = new JPanel();
		pdown1left1.setLayout(new GridLayout(6,2,10,10));
		title = new JTextField(10);
		publisher = new JTextField(10);
		authors = new JTextField(10);
		isbn = new JTextField(10);
		availability = new JTextField(10);
		renting = new JTextField(10);	
		//ºˆ¡§
		pdown1left1.add(new Label("µµº≠ ¡¶∏Ò     "));
		pdown1left1.add(title);
		pdown1left1.add(new Label("√‚∆«ªÁ        "));
		pdown1left1.add(publisher);
		pdown1left1.add(new Label("¿˙  ¿⁄          "));
		pdown1left1.add(authors);
		pdown1left1.add(new Label("∞Ì¿Ø π¯»£    "));
		pdown1left1.add(isbn);
		pdown1left1.add(new Label("¥Î√‚∞°¥…ø©∫Œ"));
		pdown1left1.add(availability);
		pdown1left1.add(new Label("¥Î√‚¿⁄     "));
		pdown1left1.add(renting);
		
		pdown1left2 = new JPanel();
		//pdown1left2.setLayout(new GridLayout(1,3,20,20));
		Jadd = new JButton("√ﬂ ∞°");
		Jmod = new JButton("ºˆ ¡§");
		Jdel = new JButton("ªË ¡¶");
		pdown1left2.add(Jadd);
		pdown1left2.add(Jmod);
		pdown1left2.add(Jdel);
		
		pdown1.add(pdown1left1, BorderLayout.CENTER);
		pdown1.add(pdown1left2, BorderLayout.SOUTH);
		
		pdown2 = new JPanel();
		pdown2.setLayout(new BorderLayout());
		
		pdown2right1 = new JPanel();
		pdown2right1.setLayout(new GridLayout(1,2,10,10));
		curious = new JTextField(10);
		pdown2right1.add(curious);
		Jsearch = new JButton("∞À ªˆ");
		pdown2right1.add(Jsearch);
		
		pdown2right2 = new JPanel();
		pdown2right2.setLayout(new GridLayout(2,1));
		
		pdown2right2up = new JPanel();
		pdown2right2up.setLayout(new GridLayout(1,1));
		list = new JList();
		pdown2right2up.add(list);
		
		pdown2right2down = new JPanel();
		pdown2right2down.setLayout(new GridLayout(1,1));
		info = new JTextArea();
		pdown2right2down.add(info);
		
		pdown2right2.add(pdown2right2up);
		pdown2right2.add(pdown2right2down);
		
		pdown2.add(pdown2right1, BorderLayout.NORTH);
		pdown2.add(pdown2right2, BorderLayout.CENTER);
		
		pdown.add(pdown1);
		pdown.add(pdown2);
		/*
		jp1 = new JPanel();
		jp1.setLayout(new GridLayout(3,4,15,15));
		jp2 = new JPanel();
		jp2.setLayout(new GridLayout(1,3,50,50));

		jp2.add(Jadd);
		jp2.add(Jmod);
		jp2.add(Jdel);
		
		panel2=new JPanel(new GridLayout(2,1));
		panel3=new JPanel(new GridLayout(1,1));
		panel4=new JPanel(new GridLayout(0,1));
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel(new GridLayout(1,3));
<<<<<<< HEAD
		*/
		pdown1.setBorder(new TitledBorder("µµº≠ ªÛºº ¡§∫∏"));
		pdown2right1.setBorder(new TitledBorder("∞Àªˆ√¢"));
		pdown2right2up.setBorder(new TitledBorder("µµº≠ ∏Ò∑œ"));
		pdown2right2down.setBorder(new TitledBorder("µµº≠ ¡§∫∏"));
=======
		jp1.setBorder(new TitledBorder("√ﬂ∞°/ºˆ¡§"));
	
		jp3.setBorder(new TitledBorder("µµº≠ ∏Ò∑œ"));
		jp4.setBorder(new TitledBorder("µµº≠ ¡§∫∏"));
		
		id=new JTextField(10);
		pw=new JTextField(10);	
		
		title=new JTextField(10);
		publisher=new JTextField(10);
		authors=new JTextField(10);
		isbn=new JTextField(10);
		availability=new JTextField(10);
		renting=new JTextField(10);
		curious=new JTextField(10);
		
		
		panel1.add(id);
		panel1.add(pw);
		jp1.add(new Label("µµº≠ ¡¶∏Ò     "));
		jp1.add(title);
		jp1.add(new Label("√‚∆«ªÁ        "));
		jp1.add(publisher);
		jp1.add(new Label("¿˙  ¿⁄          "));
		jp1.add(authors);
		jp1.add(new Label("∞Ì¿Ø π¯»£    "));
		jp1.add(isbn);
		jp1.add(new Label("¥Î√‚∞°¥…ø©∫Œ"));
		jp1.add(availability);
		jp1.add(new Label("¥Î√‚¿⁄     "));
		jp1.add(renting);
		jp1.add(new Label("∞Àªˆ∂ı     "));
		jp1.add(curious);
		
		Jlogin=new JButton("∑Œ±◊¿Œ");
		Jjoin=new JButton("»∏ø¯∞°¿‘");
		Jadd=new JButton("√ﬂ∞°");
		Jmod=new JButton("ºˆ¡§");
		Jdel=new JButton("ªË¡¶");
		Jsearch=new JButton("∞Àªˆ");
		
		panel1.add(Jlogin);
		panel1.add(Jjoin);
		
		
		jp1.add(Jadd);
		jp1.add(Jmod);
		jp1.add(Jdel);
		jp1.add(Jsearch);
		
		 
	
		list=new JList();
		info=new JTextArea();
>>>>>>> Í≤ÄÏÉâ Í∏∞Îä•Ïù¥ Ï∂îÍ∞ÄÎêú TestLibrary.java upload
		
		//pt.add(panel2);
		//pt.add(panel3);
		
<<<<<<< HEAD
		//jp3.add(list);
=======
	
>>>>>>> Í≤ÄÏÉâ Í∏∞Îä•Ïù¥ Ï∂îÍ∞ÄÎêú TestLibrary.java upload
		
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(info,v,h);
		//jp4.add(icon,BorderLayout.CENTER);
		pdown2right2down.add(jsp);
		
		
		/*
		//panel3.add(jp2);//,BorderLayout.CENTER);
		panel3.add(jp3);
		panel2.add(jp1);
		panel2.add(jp2);
		panel2.add(panel3);
		panel4.add(panel2);
		panel4.add(jp4);
		*/
		
		//------------------------------------------------------------------------------
		//	Frame º”º∫
		//------------------------------------------------------------------------------
		

		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());		
		//c.add(jmb);
		//c.add(menu);
		//c.add(panel1,BorderLayout.NORTH);
		c.add(pup, BorderLayout.NORTH);
		c.add(pdown, BorderLayout.CENTER);
		//c.add(panel4,BorderLayout.CENTER);
		
		
		Jlogin.addActionListener(this);
		Jjoin.addActionListener(this);
		
		Jadd.addActionListener(this);
		Jmod.addActionListener(this);
		Jdel.addActionListener(this);
		Jsearch.addActionListener(this);
		list.addListSelectionListener(this);
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		
		
		setTitle("Test Library");
		setSize(750, 550); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	
	}
	
	
	
	

	//------------------------------------------------------------------------------
	// ∏ÆΩ∫≥  ¿Œ≈Õ∆‰¿ÃΩ∫∏¶ ¿ß«— ∞¢ ∏ﬁº“µÂ ±∏«ˆ
	//æÓ∂≤ ¿Ã∫•∆Æ∞° πﬂª˝«ﬂ¥¬¡ˆø° µ˚∂Û ∞¢∞¢¿« ±‚¥…¿ª ºˆ«‡«—¥Ÿ.
	//------------------------------------------------------------------------------
	public void actionPerformed(ActionEvent event){

	if(event.getSource()==Jadd)//∞¥√º¿Ã∏ß))//if(event.getActionCommand().equals("√ﬂ∞°"//∂Û∫ß¿Ã∏ß))
	{
		
		Library newLibrary=new Library(title.getText(),publisher.getText(),authors.getText(),isbn.getText(),availability.getText(),renting.getText());//id.getText(),pw.getText(),name.getText(),major.getText());
		library.addLibrary(newLibrary);
			Vector Title=new Vector();
			for(int i=0;i<library.getLibraryCount();i++)
			{
				Title.addElement(library.getLibraryAt(i).getTitle());
				
			}
			list.setListData(Title);
			info.setText("");
			info.setText(library.toString());
			title.setText("");
			publisher.setText("");
			authors.setText("");
			isbn.setText("");
			availability.setText("");
			renting.setText("");
			
			
	}
			
	else if(event.getSource()==Jmod)
	{
		pdown2right2.setBorder(new TitledBorder("µµº≠ ∏Ò∑œ ª—¿◊"));
		//Jmod.hide();
		Library newLibrary2=library.getLibraryAt(list.getSelectedIndex());
		if(newLibrary2!=null)
			pdown2right2.setBorder(new TitledBorder("¿ΩΩø"));
		newLibrary2.setTitle(title.getText());
		newLibrary2.setPublisher(publisher.getText());
		newLibrary2.setAuthors(authors.getText());
		newLibrary2.setIsbn(isbn.getText());
		newLibrary2.setAvailibility(availability.getText());
		newLibrary2.setRenting(renting.getText());
	
		info.setText("");
		info.setText(library.toString());
		
		title.setText("");
		publisher.setText("");
		authors.setText("");
		isbn.setText("");
		availability.setText("");
		renting.setText("");
		
		Vector Title=new Vector();
		
		for(int i=0;i<library.getLibraryCount();i++)
		{
			Title.addElement(library.getLibraryAt(i).getTitle());
		}
		
		list.setListData(Title);
		
		
		
		
		
	}
			
	else if(event.getSource()==Jdel)
	{
		
		library.delLibrary(list.getSelectedIndex());
		info.setText("");
		info.setText(library.toString());
		title.setText("");
		publisher.setText("");
		authors.setText("");
		isbn.setText("");
		availability.setText("");
		renting.setText("");
		
		Vector Title=new Vector();
		for(int i=0;i<library.getLibraryCount();i++)
		{
			Title.addElement(library.getLibraryAt(i).getTitle());
			
		}
		list.setListData(Title);
		
		
	}
	
	else if(event.getSource()==Jsearch)
	{

		String str=curious.getText();
		info.setText("");
		String title;
		
			Vector Title=new Vector();
			
			list.setListData(Title);
			for(int i=0;i<library.getLibraryCount();i++)
			{
				title=(library.getLibraryAt(i).getTitle());
				if(title.contains(str))
				{
					
					Title.addElement(library.getLibraryAt(i).getTitle());
					info.setText(library.getLibraryAt(i).getTitle());
					
				}
			}
			list.setListData(Title);
			
			
			curious.setText("");
			
			
	}
	else if((event.getActionCommand()).equals("∫“∑Øø¿±‚"))
	{
		try{
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("libraryinfo.txt"));
			int count=ois.readInt();
			library=(LibraryCollection)ois.readObject();
			info.setText("");
			info.append(library.toString());
			
			Vector Title=new Vector();
			for(int i=0;i<count;i++)
			{
				Title.addElement(library.getLibraryAt(i).getTitle());
				
			}
			list.setListData(Title);
			ois.close();
			
		}catch (IOException e) 
		{
			info.setText("1ø°∑Ø");
		}catch (ClassNotFoundException e)
		{
			info.setText("2ø°∑Ø");
		}
		
		

	}
	else if((event.getActionCommand()).equals("¿˙¿Â«œ±‚"))
	{
		try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libraryinfo.txt"));
				oos.writeInt(library.getLibraryCount());
				oos.writeObject((Object)library);oos.close();
				info.setText("¿˙¿Âµ∆Ω¿¥œ¥Ÿ!");
				oos.close();
				
		} catch (IOException e){
			info.setText("¿˙¿Âø°∑Ø");
		}
		
		
	}
	
	}

	//------------------------------------------------------------------------------
	//º±≈√µ» ¿Œµ¶Ω∫ø° «ÿ¥Áµ«¥¬ øµ»≠ ¡§∫∏∏¶ textArea ø°º≠ √‚∑¬«—¥Ÿ.
	//------------------------------------------------------------------------------
	public void valueChanged(ListSelectionEvent event){

		Library newLibrary2=library.getLibraryAt(list.getSelectedIndex());
		title.setText(newLibrary2.getTitle());
		publisher.setText(newLibrary2.getPublisher());
		authors.setText(newLibrary2.getAuthors());
		isbn.setText(newLibrary2.getIsbn());
		availability.setText(newLibrary2.getAvailibility());
		renting.setText(newLibrary2.getRenting());
		
		info.setText("");
		info.append(newLibrary2.toString());
		
		
	}

	
}	

public class TestLibrary //extends Frame
{
	public static void main(String[] args)throws Exception 
	{
		//new TestLibrary();
		new TestLibraryDemo();
	}
}
/*
public TestLibrary(){
	super("¡¶∏Ò");
	this.init();
	this.start();
	this.setSize(300,200);
	this.setLocation(400,200);
	this.setVisible(true);
}
public void init(){
	System.out.println("∏ﬁ∑’");
}
public void start(){
	System.out.println("¡∂¡÷");
}
}
}
*/


