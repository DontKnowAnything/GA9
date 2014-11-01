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
      //Student na=new Student("");
      ArrayList<Student>al=new ArrayList<Student>();
      int[] jw;
      boolean b;
      Student x=new Student("");
      try{
         FileInputStream fis=new FileInputStream("C:/Stuff/GA9ev2/9v2/src/mybinary.dat");//open
         DataInputStream dis=new DataInputStream(fis);
      
         try {
            String l;
         //int j=0;
         //int []i3;
         //while((l=dis.readUTF())!=null){
         //while((l=dis.readUTF())!=eof){
            while(dis.available()!=0){
            //do{
               String s=dis.readUTF();
               jw= new int[dis.readInt()];
            
            
               for (int j = 0; j < jw.length; j++) {
               //na.setScores(i3);//Must Have this
               //i3=na.getScores();
               //i3=na.getScores();
               
               
                  jw[j]=dis.readInt();
               //na.setScores(i3);
               }
            //na.setScores(jw);
            //jw=na.getScores();
               x=new Student(s,jw);
               al.add(x);
               
            }
            for(Student op:al){
               System.out.println(op.toString());}
         //j++;
         }//while(true);
         
         catch (EOFException e)
         {
         // TODO Auto-generated catch block
         //b=true;
            System.out.println("9");
         }
         //catch(NullPointerException ne){}
         finally{
         
            // for(Student s:al){
               // System.out.println(s);
            // }
            dis.close();}
      }
      catch(IOException ioe){}
   }
}

