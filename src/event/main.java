package event;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class main extends JFrame implements ActionListener {
	JButton bt1=null;
	JButton bt2=null;
	JLabel l1=null;
	JPanel p1=null;
	public static void main(String[] args) {

		main win=new main();
	}
	public main() {
		bt1=new JButton("钱澄");
		bt2=new JButton("黄舜尧");
		l1=new JLabel("无名氏");
		p1=new JPanel();
		bt1.setBackground(new Color(255,255,255)); 
		bt1.setBorder(null);
		bt2.setBackground(new Color(255,255,255)); 
		bt2.setBorder(null);
		bt1.addActionListener(this);
		bt1.setActionCommand("1");
		bt2.addActionListener(this);
		bt2.setActionCommand("2");
		this.setLayout(new GridLayout(1,2));
		p1.setLayout(new GridLayout(2,1));
		p1.add(bt1); p1.add(bt2);
		this.add(l1);
		this.add(p1);
		
		this.setTitle("方逸寒小程序");
		this.setSize(400,200);
		this.setLocation(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("用户点击按钮!");
		if(e.getActionCommand().equals("1")) {
			l1.setText("钱澄");
			System.out.println("钱澄");
			
		}else if(e.getActionCommand().equals("2")) {
			l1.setText("黄舜尧");
			System.out.println("黄舜尧");
			
		}
		
	}
}
