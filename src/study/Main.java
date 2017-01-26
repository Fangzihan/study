package study;
import java.awt.*;
import javax.swing.*;
/*
 * ╒────────╕    ╒─╕   ╒────────╕          ╒─── ──╕                                        ╒─╕
 * └───╕╒───┘    ╘─╛    │ ┌────┐   │   ┌─┐└─────┘            ┌────┐            │  │
 *            ││                ┌┐      ││             │  │   │  │                       ┌─┐└────┘┌─┐    │  │
 * 			   ││                ││      ││─────┘ │   │   └──────╕   │  │                 │   │    │  │
 *            ││                ││      ││──────┘    └───────╕ │   │ │                  │   │    │  │
 *            ││                ││      ││                        ┌─────┐└─┘   └─┘┌────╕│   │    │  │
 *            └┘                └┘      └┘                         └─────┘                   └────┘└─┘    └─┘
 *           
 *           
 *           作者:方子寒
 *                                                        
 */
public class Main extends JFrame {
	JPanel pan1,pan2,pan3;
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1;
	JPasswordField p1;
	Main() {//方法
		pan1=new JPanel();
		pan2=new JPanel();
		pan3= new JPanel();
		l1=new JLabel("帐号");
		l2=new JLabel("密码");
		b1=new JButton("登录");
		b2=new JButton("取消");
		t1=new JTextField(10);
		p1=new JPasswordField(10);
		//创建各种对象
		this.setLayout(new GridLayout(3,1));
		//设置界面布局方式
		pan1.add(l1);		pan1.add(t1);
		pan2.add(l2);		pan2.add(p1);
		pan3.add(b1);	pan3.add(b2);
		//每个容器添加物品
		this.add(pan1);
		this.add(pan2);
		this.add(pan3);
		
		this.setTitle("登录系统");
		this.setSize(300,200);
		this.setLocation(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String[] args) {//主函数
		Main win1=new Main();
		
	}

}
