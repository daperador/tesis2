package co.edu.uniandes.csw.ecoredoc.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	
	public final void copy(String orig, String dest){
		File fOrig=new File(orig);
		File fDest=new File(dest);
		System.out.println(fOrig.getAbsolutePath());
		System.out.println(fDest.getAbsolutePath());
		try {
			FileReader fr=new FileReader(fOrig);
			FileWriter fw=new FileWriter(fDest);
			int c;
			while((c=fr.read())!=-1){
				fw.write(c);
			}
			fw.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	@Override
	public String toString() {
		return "aaaa"+super.toString();
	}
	
}
