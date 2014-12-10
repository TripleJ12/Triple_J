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
	// ����� UI�� ���� �ʿ��� ������ ���� 
	//------------------------------------------------------------------------------
//<<<<<<< HEAD
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel jp1;
	private JPanel jp2;
	private JPanel jp3;
	private JPanel jp4;
//=======
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
//>>>>>>> Tbranch
	
	
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
	
	private JButton Jlogin; //�α��� ��ư
	private JButton Jjoin; //ȸ������ ��ư
	
	private JButton Jadd; //�߰� ��ư
	private JButton Jmod; //���� ��ư
	private JButton Jdel; //���� ��ư
	
	private JButton Jsearch; //�˻� ��ư
	private JTextField curious; // �˻� â
	
	private JList list; // �������
	//private JLabel icon;
	private JTextArea info; //���� ����
	public int a;
	
	JMenuItem jmi1;
	JMenuItem jmi2;
	
	


	//------------------------------------------------------------------------------
	//������ - GUI�� �����Ѵ�.
	//------------------------------------------------------------------------------
	
	
	public TestLibraryDemo() 
	{
		JMenuBar jmb=new JMenuBar();
		JMenu menu=new JMenu("����");
		jmi1=new JMenuItem("�ҷ�����");
		menu.add(jmi1);
		jmi2=new JMenuItem("�����ϱ�");
		menu.add(jmi2);
		jmb.add(menu);
		
		setJMenuBar(jmb);
		jmi1.setAccelerator(KeyStroke.getKeyStroke('O',Event.CTRL_MASK));//Ctrl+0
		jmi2.setAccelerator(KeyStroke.getKeyStroke('S',Event.CTRL_MASK));//Ctrl+S
		
		library=new LibraryCollection();	

		//------------------------------------------------------------------------------
		// ����� ȭ�鿡 ������Ʈ�� �����Ͽ� ��ġ
		// �� ������Ʈ ������ �ʿ��� ������ �߰�
		//------------------------------------------------------------------------------
		pup = new JPanel();
		//pup.setLayout(new GridLayout(1,6));
		id = new JTextField(10);
		pw = new JTextField(10);	
		Jlogin = new JButton("�� �� ��");
		Jjoin = new JButton("ȸ������");
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
		//����
		pdown1left1.add(new Label("���� ����     "));
		pdown1left1.add(title);
		pdown1left1.add(new Label("���ǻ�        "));
		pdown1left1.add(publisher);
		pdown1left1.add(new Label("��  ��          "));
		pdown1left1.add(authors);
		pdown1left1.add(new Label("���� ��ȣ    "));
		pdown1left1.add(isbn);
		pdown1left1.add(new Label("���Ⱑ�ɿ���"));
		pdown1left1.add(availability);
		pdown1left1.add(new Label("������     "));
		pdown1left1.add(renting);
		
		pdown1left2 = new JPanel();
		//pdown1left2.setLayout(new GridLayout(1,3,20,20));
		Jadd = new JButton("�� ��");
		Jmod = new JButton("�� ��");
		Jdel = new JButton("�� ��");
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
		Jsearch = new JButton("�� ��");
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
		*/
		pdown1.setBorder(new TitledBorder("���� �� ����"));
		pdown2right1.setBorder(new TitledBorder("�˻�â"));
		pdown2right2up.setBorder(new TitledBorder("���� ���"));
		pdown2right2down.setBorder(new TitledBorder("���� ����"));
		
		//pt.add(panel2);
		//pt.add(panel3);
		
		//jp3.add(list);
		
		
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
		//	Frame �Ӽ�
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
		list.addListSelectionListener(this);
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		
		
		setTitle("Test Library");
		setSize(750, 550); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	
	}
	
	
	
	

	//------------------------------------------------------------------------------
	// ������ �������̽��� ���� �� �޼ҵ� ����
	//� �̺�Ʈ�� �߻��ߴ����� ���� ������ ����� �����Ѵ�.
	//------------------------------------------------------------------------------
	public void actionPerformed(ActionEvent event){

	if(event.getSource()==Jadd)//��ü�̸�))//if(event.getActionCommand().equals("�߰�"//���̸�))
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
		pdown2right2.setBorder(new TitledBorder("���� ��� ����"));
		//Jmod.hide();
		Library newLibrary2=library.getLibraryAt(list.getSelectedIndex());
		if(newLibrary2!=null)
			pdown2right2.setBorder(new TitledBorder("����"));
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
	else if(event.getSource()==Jsearch)//��ü�̸�))//if(event.getActionCommand().equals("�߰�"//���̸�))

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

	
	else if((event.getActionCommand()).equals("�ҷ�����"))
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
			info.setText("1����");
		}catch (ClassNotFoundException e)
		{
			info.setText("2����");
		}
		
		

	}
	else if((event.getActionCommand()).equals("�����ϱ�"))
	{
		try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libraryinfo.txt"));
				oos.writeInt(library.getLibraryCount());
				oos.writeObject((Object)library);oos.close();
				info.setText("����ƽ��ϴ�!");
				oos.close();
				
		} catch (IOException e){
			info.setText("���忡��");
		}
		
		
	}
	
	}

	//------------------------------------------------------------------------------
	//���õ� �ε����� �ش�Ǵ� ��ȭ ������ textArea ���� ����Ѵ�.
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
