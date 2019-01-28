package tess4jTest;

import java.io.File;
import net.sourceforge.tess4j.*;

public class Testtess {

    public static void main(String[] args) {
    	System.out.println("\nFile Loading.....\n");
        File image = new File("C:/bin/Tess4J/songs.png");
        System.out.println("\nFile Loaded.....\n");
        Tesseract tessInst = new Tesseract();
        System.out.println("\nCreating Tesseract.....\n");
        tessInst.setDatapath("C://bin//Tess4J");
        System.out.println("\nsetDatapath.....\n");
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