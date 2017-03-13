package io;
import java.io.*;
public class writeIn {
	static void main() throws Exception{
		PrintStream p1=new PrintStream(new FileOutputStream("F:/2.txt"));
		
		for(int i=0;i<10;i++) {
		p1.println("华硕飞行堡垒ZX53VE的游戏外观主要通");
		}
		p1.close();
		System.out.println("成功摧毁!");
		
	}

}
