package study;
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
 *                                                        
 */
public class Main extends JFrame {
	JPanel pan1,pan2,pan3;
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1;
	JPasswordField p1;
	Main() {//����
		pan1=new JPanel();
		pan2=new JPanel();
		pan3= new JPanel();
		l1=new JLabel("�ʺ�");
		l2=new JLabel("����");
		b1=new JButton("��¼");
		b2=new JButton("ȡ��");
		t1=new JTextField(10);
		p1=new JPasswordField(10);
		//�������ֶ���
		this.setLayout(new GridLayout(3,1));
		//���ý��沼�ַ�ʽ
		pan1.add(l1);		pan1.add(t1);
		pan2.add(l2);		pan2.add(p1);
		pan3.add(b1);	pan3.add(b2);
		//ÿ�����������Ʒ
		this.add(pan1);
		this.add(pan2);
		this.add(pan3);
		
		this.setTitle("��¼ϵͳ");
		this.setSize(300,200);
		this.setLocation(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String[] args) {//������
		Main win1=new Main();
		
	}

}
