import java.io.*;
import java.util.*;
public class CreateBinaryFile  {

   static ArrayList<Student> list = new ArrayList<Student>();
   public static void main(String[] args)   {          
   
      Student s3 = new Student("Will",new int[] {20,20,20,20,20});
      list.add(s3);
      s3 = new Student("Sue", new int[] {10,10});
      list.add(s3);
      s3 = new Student("Alex",new int[] {20,20,20,20});
      list.add(s3);
      s3 = new Student("Carol",new int[] {15,15,14,13,12,11});
      list.add(s3);
      s3 = new Student("Ted", new int[] {10,20,30});
      list.add(s3);
      s3 = new Student("Sally",new int[] {3,2,1});
      list.add(s3);
      s3 = new Student("Jane",new int[] {6,5,4,3,2,1});
      list.add(s3);
      s3 = new Student("Wayne");
      list.add(s3);
      s3 = new Student("Sam",new int[] {17,20,10});
      list.add(s3);
      s3 = new Student("Tom",new int[] {2,1});
      list.add(s3);
      s3 = new Student("Bob",new int[] {16,20,20,10});
      list.add(s3);
      s3 = new Student("Joe",new int[] {6,5,2,1});
      list.add(s3);
   
      createFile();       // binary file output 
   }
	
	
   public static void createFile()  {
   	 
      System.out.println("Writing file...");
      try{
         DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("mybinary2.txt"));
         System.out.println(list);
      }
      catch(FileNotFoundException fnf){
         System.out.println("new file");
      }
   }
}
