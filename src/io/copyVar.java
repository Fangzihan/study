package io;
import java.io.*;

public class copyVar {

	static void main() throws Exception {
		int a=5438;
		int b;
		ByteArrayOutputStream w1=new ByteArrayOutputStream();
		DataOutputStream w2=new DataOutputStream(w1);
		w2.writeInt(a);
		
		byte[] sz=w1.toByteArray();
		ByteArrayInputStream r1=new ByteArrayInputStream(sz);
		DataInputStream r2=new DataInputStream(r1);
		b=r2.readInt();
		System.out.println(b);
		
	}
}
