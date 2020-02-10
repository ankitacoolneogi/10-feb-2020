import java.io.*;


class CountingFileElements {

public static void main(String [] args) {

	char[] in = new char[120]; // to store input
	int size = 0, word = 0, lines = 0;
	try{
		File file = new File("MyNewFile.txt"); 

		FileReader fr = new FileReader(file); 	
		size = fr.read(in); // read the whole file!
		for(char c : in) {
			if (c ==' ' )
 				word++;
			if (c=='\n' || c==-1){ 
				lines++;
				word++;
			}
		}
		fr.close(); // again, always close
	} catch(IOException e) {System.out.println("Some issues reading from the file" + e.getMessage()); }
 	System.out.println("Number of words are :: " + word);
 	System.out.println("Number of lines are :: " + lines);
 	System.out.println("Number of Characters are :: " + size);
 
 
 
// StringBuilder sb = new StringBuilder("");
 
// BufferedReader br = new BufferedReader(new FileReader(file));
// String str = "";
// while((str = br.readLine()) != null)
// {
//     sb.append(str + "\n");
// //System.out.println(str);
// // str = br.readLine();
// // System.out.println(str);
// }
// br.close();
// // fr.close();
// System.out.println("Contents from file are : " + sb);
//   } catch(IOException e) {System.out.println("Can't read from the file currently..."); }
 }
}