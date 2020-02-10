import java.io.*;
class FileReadingWithNumbers {
public static void main(String [] args) {
char[] in = new char[100]; // to store input
int size = 0, i = 1;
try{
	File file = new File("MyNewFile.txt");  
	StringBuilder sb = new StringBuilder("");
 
	BufferedReader br = new BufferedReader(new FileReader(file));
	String str = "";
	System.out.println("\n\n......The contents of the file with line nos are:...\n\n\n");
	while((str = br.readLine()) != null)
	{
		System.out.print(i + " ");
    	System.out.println(str);
		i++;
	}
	br.close();
  	} catch(IOException e) {System.out.println("Can't read from the file currently..."); }
 }
}