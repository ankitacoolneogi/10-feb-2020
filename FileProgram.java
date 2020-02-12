import java.io.*;


class CopyDataThread implements Runnable{
	public void run(){
		boolean bool=true;
		try{
			File srcfile = new File("source.txt");
			File trgtfile = new File("target.txt");
			char[] in = new char[200];
			int i=0;
			FileReader fr = new FileReader(srcfile);
			FileWriter fw = new FileWriter(trgtfile);
			fr.read(in);
			//System.out.print(in);

			do{
			for (int j=i; j<i+10 ;j++ ) {
				fw.write(in[j]);
				fw.flush();
				if(in[j]=='\0'){
					bool=false;
					break;
				}
			}
				System.out.println(".......10 characters are copied..... "); 
				i+=10;
			}while(bool);
		
		
		fr.close();
		fw.close();
		} catch(IOException e) {System.out.println("File handling error encountered..."); }
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println("Sleep error encountered...");
		}
	}
}



class FileProgram{
	public static void main(String[] args) {
		CopyDataThread obj = new CopyDataThread();
		Thread t1 = new Thread(obj);
		t1.run();

	}
	
}