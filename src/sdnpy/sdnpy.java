package sdnpy;
import java.awt.*;
import javax.swing.*;
/*
 * �V�����������������Y    �V���Y   �V�����������������Y          �V������ �����Y                                        �V���Y
 * ���������Y�V��������    �\���_    �� ������������   ��   ��������������������            ������������            ��  ��
 *            ����                ����      ����             ��  ��   ��  ��                       ������������������������    ��  ��
 * 			   ����                ����      ���������������� ��   ��   ���������������Y   ��  ��                 ��   ��    ��  ��
 *            ����                ����      ������������������    �����������������Y ��   �� ��                  ��   ��    ��  ��
 *            ����                ����      ����                        ��������������������   �����������������Y��   ��    ��  ��
 *            ����                ����      ����                         ��������������                   ������������������    ������
 *           
 *           
 *           ����:���Ӻ�
 *           ֧��:���                                             
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
		l1=new JLabel("�������м���Ů����?");
		l2=new JLabel("��ϲ��������Ů��?");
		l3=new JLabel("����ʲô������?");
		dxk1=new JRadioButton("1��");
		dxk2=new JRadioButton("2��");
		dxk3=new JRadioButton("3��");
		dxk4=new JRadioButton("4��������");
		fxk1=new JCheckBox("�崿");
		fxk2=new JCheckBox("�ɰ�");
		fxk3=new JCheckBox("�ߴ�");
		fxk4=new JCheckBox("����");
		wbk1=new JTextField(10);
		b1=new JButton("�ύ");
		anz1=new ButtonGroup();
		//���������齨
		
		l1.setFont(new java.awt.Font("΢���ź�",0,15)); 
		l2.setFont(new java.awt.Font("΢���ź�",0,15)); 
		l3.setFont(new java.awt.Font("΢���ź�",0,15)); 
		
		
		this.setLayout(new GridLayout(7,1));
		pan1.setLayout(new FlowLayout(0));
		pan2.setLayout(new FlowLayout(0));
		pan3.setLayout(new FlowLayout(2));
		//���ò��ֹ�����
		
		anz1.add(dxk1);		anz1.add(dxk2);		anz1.add(dxk3);		anz1.add(dxk4);
		//��ť����Ӱ�ť
		
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
		//��Ӹ������
		
		this.setTitle("��Ƶĵ����ʾ�");
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
