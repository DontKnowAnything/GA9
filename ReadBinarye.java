
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
			FileInputStream fis=new FileInputStream("H:\\jG9\\G9\\src\\mybinary.dat");

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
				int j2=dis.readInt();
				int j3=dis.readInt();
				int j4=dis.readInt();
				int j5=dis.readInt();
				int j6=dis.readInt();
				int j7=dis.readInt();
				int j8=dis.readInt();
				System.out.println(y+j3+j4+j5+j6+j7+j8);
				String bbs=dis.readUTF();
				int bb=dis.readInt();
				int bb2=dis.readInt();
				int bb3=dis.readInt();
				int bb4=dis.readInt();
				int bb5=dis.readInt();
				System.out.println(bbs+bb2+bb3+bb4+bb5);
				String je=dis.readUTF();
				int jei=dis.readInt();
				int jei2=dis.readInt();
				int jei3=dis.readInt();
				int jei4=dis.readInt();
				int jei5=dis.readInt();
				System.out.println(je+jei2+jei3+jei4+jei5);
				String cl=dis.readUTF();
				int cgr=dis.readInt();
				int cgr2=dis.readInt();
				int cgr3=dis.readInt();
				int cgr4=dis.readInt();
				int cgr5=dis.readInt();
				int cgr6=dis.readInt();
				int cgr7=dis.readInt();
				System.out.println(cl+cgr+cgr2+cgr3+cgr4+cgr5+cgr6+cgr7);

				//Sally
				String sy=dis.readUTF();

				while(dis.readBoolean()){
				int syi=dis.readInt();
				int syi1=dis.readInt();//count
				int syi2=dis.readInt();
				int syi3=dis.readInt();
				int []sya=new int[syi];

				Student sarray=new Student(sy,sya);
				a.add(sarray);
				
				System.out.println(a.toString()+syi1+syi2+syi3);
				
				String sm=dis.readUTF();
				int smi=dis.readInt();
				System.out.println(sm);}

			} 
			catch (EOFException eo) {
				// TODO: handle exception
			}
			finally
			{
				dis.close();
			}

		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{


		}

	}
}
