import java.io.*;
import java.util.Scanner;
import java.lang.String;
class EnterFileAndCheck {

public static void main(String [] args) {
	char[] in = new char[120]; // to store input
	int size = 0;
	Scanner sc = new Scanner(System.in);
	String name;
	try{
		System.out.print("Enter File name :: ");
		File file = new File(name = sc.next()); //Again this is just an object
 		if(file.createNewFile()){
 			System.out.println("The file does not exists...");
 			return;
 		}
 		else{
 			System.out.println("The file exists...");
 			FileReader fr = new FileReader(file); 
 			size = fr.read(in);
 			System.out.println("The length of file in bytes:: " + size);
 			System.out.println("The type of file is: " + name.substring((name.length()-3), name.length()));
 			if (file.canRead()) 
 				System.out.println("The file can Read...");
 			if (file.canWrite())
 				System.out.println("The file can Write..");


 		}
	 } catch(IOException e) {System.out.println("Can't read from the file currently..."); }
 }
}