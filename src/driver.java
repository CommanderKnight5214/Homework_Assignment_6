//Java Libaries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class driver 
{
	public static void main(String[] args) throws FileNotFoundException    //throws Exception
	{
		//Intial array
		BibleBooks[] ar = new BibleBooks[4];
		//Finding the file for input
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/BookName.dat"));
		//Running input through to create an array
		while(input.hasNext())
		{
			BibleBooks a = new BibleBooks (input.nextLine());
			a.display();
		}
		input.close();
	}
}	