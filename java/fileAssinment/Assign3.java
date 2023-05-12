package fileAssinment;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author su22034
 *
 *3. Display number of characters, lines, words from a file.
 *
 *
 *
 *
 */
public class Assign3 {

	public static void main(String[] args) throws IOException {
		File file=new File("count.txt");
		
		FileOutputStream f1=new FileOutputStream("count.txt");
		System.out.println("prese the key @ writing stoped");
        int k;
        while((k=System.in.read())!='@'){
        	f1.write((char)k);
        }
        System.out.print("writeing completed");
        System.out.println("count the number charter into the file");
        Path file1 = Paths.get("count.txt");

        // read all lines of the file
        long count = Files.lines(file1).count();
        System.out.println("Total Lines: " + count);
        
		
        
	}

}
