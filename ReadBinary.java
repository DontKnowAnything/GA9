/**
 * @author User
 *
 */
import java.util.*;
import java.io.*;
public class ReadBinary
{

	public static void main(String[]args) throws IOException
	{

		ArrayList<Student>a=new ArrayList<Student>();

		try {
			FileInputStream fis=new FileInputStream("C:\\Stuff\\GA9B\\src\\mybinary.dat");

			DataInputStream dis = new DataInputStream(fis);
			try {

				String s=dis.readUTF();
				int g1=dis.readInt();
				int g2=dis.readInt();
				int g3=dis.readInt();
				System.out.println(s+g2+g3);
				String t=dis.readUTF();
				int tn=dis.readInt();
				int tn2=dis.readInt();
				int tn3=dis.readInt();
				int tn4=dis.readInt();
				System.out.println(t+tn2+tn3+tn4);
				String y=dis.readUTF();
				System.out.println(y);



			} catch (EOFException eo) {
				// TODO: handle exception
			}
			finally
			{
				dis.close();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		

		}

	}
}
