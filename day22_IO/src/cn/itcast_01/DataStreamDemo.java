package cn.itcast_01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
		public static void main(String[] args) throws IOException {
			write();
			read();
		}

		private static void read() throws IOException {
			// TODO Auto-generated method stub
			DataInputStream dis=new DataInputStream(new FileInputStream("a.txt"));
			Byte a=dis.readByte();
			Short b=dis.readShort();
			int c=dis.readInt();
			Long d=dis.readLong();
			float e=dis.readFloat();
			double f=dis.readDouble();
			char g=dis.readChar();
			boolean h=dis.readBoolean();
		//释放资源
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
			System.out.println(h);
	
		}

		private static void write() throws IOException {
			// TODO Auto-generated method stub
	DataOutputStream dos=new DataOutputStream(new FileOutputStream("a.txt"));
	
	dos.writeByte(10);
	
	dos.writeShort(100);
	dos.writeInt(1000);
	dos.writeLong(10000);
	dos.writeFloat(12.34F);
	dos.writeDouble(12.56);
	dos.writeChar('a');
	dos.writeBoolean(true);
	
	//释放资源
	dos.close();
		}
}
