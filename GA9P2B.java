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


	public static void createFile()
	{
		String writeName = "";
		int writeNumberofScores = 0;
		int [] writeStudentScores = null;
		System.out.println("Writing file...");

		try{
			DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("H:\\eg9\\g9\\src\\mybinary.dat"));
			try{
				//dataOutputStream.flush();


				/*** Write each students information ***/

				

				dataOutputStream.writeInt(writeNumberofScores);
				dataOutputStream.writeUTF(writeName);

				/*** Create an array w/ enough elements to store the scores ***/

				if ( writeNumberofScores == 0 )
				{
					writeStudentScores = new int[ writeNumberofScores ];

					/*** write every score into the array ***/

					for ( int score = 0; score < writeStudentScores.length-1; ++score )
					{
						dataOutputStream.writeInt(score);
					}
				}
				else
				{
					writeStudentScores = null;
				}
				/*** Instantiate Student and add to the ArrayList ***/

				list.add( new Student( writeName, writeStudentScores ) );



				/*** Write the list of students to binary file ***/

				for ( Student eachStudent : list )
				{
					
					
					
					dataOutputStream.writeInt(list.size() );
					dataOutputStream.writeUTF( eachStudent.toString() );
					
				}

				dataOutputStream.close();            


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


		catch( IOException e )
		{
			System.out.println( "\nBinary file is bad!" );
			System.out.println( e.getMessage() );
			System.exit( 1 );
		}
	}
}
