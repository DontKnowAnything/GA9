import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadBinary
{
    /*** Application ***/
    
   public static void main( String[] args )
   {
          /*** Local Variables **/
          
      ArrayList<Student> listOfStudents = new ArrayList<Student>();
       
      int numberOfScores = 0;
      int studentScores[] = null;
      String studentName = "";
      
      FileInputStream fileInputStream = null;
      DataInputStream dataInputStream = null;      
       
      System.out.println( "\n...Application started...\n" );  
      
      try
      {
         fileInputStream = new FileInputStream( "C:/Stuff/GA9ev2/9v2/src/mybinary.dat" );
         dataInputStream = new DataInputStream( fileInputStream );
          
         try
         {                    
            /*** Read all data from binary input file ***/
         
            while ( dataInputStream.available() != 0 )               
            {
                /*** Extract each students information ***/
               
               studentName = dataInputStream.readUTF();
               
               numberOfScores = dataInputStream.readInt();
               
                /*** Create an array w/ enough elements to store the scores ***/
               
               if ( numberOfScores > 0 )
               {
                  studentScores = new int[ numberOfScores ];
               
                   /*** Read every score into the array ***/
               
                  for ( int score = 0; score < studentScores.length; score++ )
                  {
                     studentScores[ score ] = dataInputStream.readInt();
                  }
               }
               else
               {
                  studentScores = null;
               }
                /*** Instantiate Student and add to the ArrayList ***/
                 
               listOfStudents.add( new Student( studentName, studentScores ) );
            }
            
            /*** Display list of students read from binary file ***/
            
            for ( Student student : listOfStudents )
            {
               System.out.println( student.toString() );
            }
            
            dataInputStream.close();            
              
         }
            
         catch( EOFException e )  //Not expecting EOF since checking to see if data is available
         {
            System.out.println( "\nFound EOF -- not expected!" );
            System.out.println( e.getMessage() );
            System.exit( 1 );
         }
         
         catch( IOException e )
         {
            System.out.println( "\nBinary file is bad!" );
            System.out.println( e.getMessage() );
            System.exit( 1 );
         }        
      }
         
      catch ( IOException e )  //Some error in file opening
      {
         System.out.println( "\nBinary file is bad!" );
         System.out.println( e.getMessage() );
         System.exit( 1 );
      }
         
      finally
      {
         System.out.println( "\n...Application ending...\n" ); 
      }
   }
}
