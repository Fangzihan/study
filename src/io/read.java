package io;

import java.io.FileReader;

public class read  {
	static void read() throws Exception {
		FileReader sb=	sb=new FileReader("F:/javaRead.txt");
		int input;
		input=sb.read();
		String text=new String();
		while(input!=-1) {
			text=text+(char)input;
			input=sb.read();
		}
		System.out.println(text);
		sb.close();
		
		
		
	}
}
