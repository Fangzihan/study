package io;
import java.io.*;

class QD implements Serializable{
	String name=null;
	int IQ =0;
	public QD(String name,int IQ) {
		this.name=name;
		this.IQ=IQ;
		
	}
	
	
}
public class object {
	static void main() {
	ObjectOutputStream o1=null;
	ObjectInputStream o2=null;
	QD qd=new QD("钱澄",250);
	QD dmm=null;
	
	try {
		FileOutputStream xx=new FileOutputStream("F:/object.txt");
		o1=new ObjectOutputStream(xx);
		o1.writeObject(qd);
		
		o2=new ObjectInputStream(new FileInputStream("F:/object.txt"));
		dmm=(QD)o2.readObject();
		System.out.println(dmm.name);
		System.out.println(dmm.IQ);
		
	}catch(Exception e) {
		System.out.println("出错了:(");
		
	}
	finally{
		try{
			o1.close();
			o2.close();
			System.exit(0);
			
		}
		catch(Exception e)
		{
			System.exit(0);
			
		}finally{
			System.exit(0);
		}
		
		
	}
	}
}
