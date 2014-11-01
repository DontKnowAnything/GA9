import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class ReadBinary {

   public static void main(String[] args) throws IOException {
   	// TODO Auto-generated method stub
      Student na=new Student("");
      ArrayList<Student>al=new ArrayList<Student>();
      int jw;
      boolean b;
      FileInputStream fis=new FileInputStream("C:/Stuff/GA9ev2/9v2/src/mybinary.dat");
      DataInputStream dis=new DataInputStream(fis);
      EOFException eof;
   
      try {
         String l;
         //int j=0;
         //int []i3;
         //while((l=dis.readUTF())!=eof){
         while(dis.available()!=0){
         //do{
            String u=dis.readUTF();
            int[]i3 = new int[dis.readInt()];
            for (int j = 0; j < i3.length; j++) {
               //na.setScores(i3);//Must Have this
               i3[j]=dis.readInt();
               na.setScores(i3);
            }
            Student x=new Student(u,i3);
            al.add(x);
            System.out.println(al.toString());
            //j++;
         }//while(j<i3.length);
      } 
      catch (EOFException e)
      {
      	// TODO Auto-generated catch block
         //b=true;
      }
      //catch(NullPointerException ne){}
      finally{
         dis.close();}
   }
}

