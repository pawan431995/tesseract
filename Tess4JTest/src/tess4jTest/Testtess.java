package tess4jTest;

import java.io.File;
import net.sourceforge.tess4j.*;

public class Testtess {

    public static void main(String[] args) {
    	
        File image = new File("C:/bin/Tess4J/songs.png");
       
        Tesseract tessInst = new Tesseract();
        
        tessInst.setDatapath("C://bin//Tess4J");
        
        try {
        	System.out.println("Starting ocr.....\n");
            String result= tessInst.doOCR(image);
            System.out.println(result);
            System.out.println("Ending ocr.....\n");
        } catch (TesseractException e) {
        	System.out.println("\nCatch block.....\n");
            System.err.println(e.getMessage());
        }

    }

}