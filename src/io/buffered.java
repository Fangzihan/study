package io;
import java.io.*;

public class buffered {
	static void buffered() throws Exception{
		BufferedInputStream rd=new BufferedInputStream( new FileInputStream("e:/run.jpg"));
		BufferedOutputStream wt=new BufferedOutputStream(new FileOutputStream("f:/run.jpg"));
		byte[] hc=new byte[2048];
		int sj;
		
		sj=rd.read(hc);
		while(sj!=-1) {
			wt.write(hc,0,sj);
			sj=rd.read(hc);
			
		}
		wt.flush();
		
		rd.close();
		wt.close();
	}
}
