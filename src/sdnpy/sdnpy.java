package sdnpy;
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
 *           支持:神灯                                             
 */

public class sdnpy extends JFrame {
	JPanel pan1,pan2,pan3;
	JLabel l1,l2,l3;
	JRadioButton dxk1,dxk2,dxk3,dxk4;
	JCheckBox fxk1,fxk2,fxk3,fxk4;
	JTextField wbk1;
	JButton b1;
	ButtonGroup  anz1;
	
	
	sdnpy() {
		
		pan1=new JPanel();
		pan2=new JPanel();
		pan3=new JPanel();
		l1=new JLabel("请问你有几个女朋友?");
		l2=new JLabel("你喜欢怎样的女生?");
		l3=new JLabel("还有什么需求吗?");
		dxk1=new JRadioButton("1个");
		dxk2=new JRadioButton("2个");
		dxk3=new JRadioButton("3个");
		dxk4=new JRadioButton("4个或以上");
		fxk1=new JCheckBox("清纯");
		fxk2=new JCheckBox("可爱");
		fxk3=new JCheckBox("高大");
		fxk4=new JCheckBox("暴力");
		wbk1=new JTextField(10);
		b1=new JButton("提交");
		anz1=new ButtonGroup();
		//创建各种组建
		
		l1.setFont(new java.awt.Font("微软雅黑",0,15)); 
		l2.setFont(new java.awt.Font("微软雅黑",0,15)); 
		l3.setFont(new java.awt.Font("微软雅黑",0,15)); 
		
		
		this.setLayout(new GridLayout(7,1));
		pan1.setLayout(new FlowLayout(0));
		pan2.setLayout(new FlowLayout(0));
		pan3.setLayout(new FlowLayout(2));
		//设置布局管理器
		
		anz1.add(dxk1);		anz1.add(dxk2);		anz1.add(dxk3);		anz1.add(dxk4);
		//按钮组添加按钮
		
		pan1.add(dxk1);		pan1.add(dxk2);		pan1.add(dxk3);		pan1.add(dxk4);
		pan2.add(fxk1);		pan2.add(fxk2);		pan2.add(fxk3);		pan2.add(fxk4);
		pan3.add(b1);
		this.add(l1);
		this.add(pan1);
		this.add(l2);
		this.add(pan2);
		this.add(l3);
		this.add(wbk1);
		this.add(pan3);
		//添加各种组件
		
		this.setTitle("神灯的调查问卷");
		this.setSize(400,300);
		this.setLocation(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		sdnpy win1=new sdnpy();
		
	}

}
