package tess4jTest;

import java.awt.Rectangle;
import java.io.File;
import java.util.Date;

import net.sourceforge.tess4j.*;

public class Testtess2 {

    public static void main(String[] args) {
        org.apache.log4j.PropertyConfigurator.configure("C://bin//Tess4J//log4j.properties.txt"); // sets properties file for log4j
    	System.out.println("\nFile Loading.....\n");

        File image = new File("C:/bin/Tess4J/PRE_19578075.pdf");
        System.out.println("\nFile Loaded.....\n");
        Tesseract tessInst = new Tesseract();
        System.out.println("\nCreating Tesseract.....\n");
        tessInst.setDatapath("C://bin//Tess4J");
        System.out.println("\nsetDatapath.....\n");
       long sTime= new Date().getTime();
        System.out.println("\n"+sTime+"\n");
        try {
        	System.out.println("Starting ocr.....\n");
            //String result= tessInst.doOCR(image);
            String result= tessInst.doOCR(image, new Rectangle(0, 0, 1000, 1500));
            System.out.println(result);
            System.out.println("Ending ocr.....\n");
        } catch (TesseractException e) {
        	System.out.println("\nCatch block.....\n");
            System.err.println(e.getMessage());
        }
        long eTime=new Date().getTime();
        System.out.println("\n"+eTime+"\n");
        System.out.println("\nEllaps Time= "+(eTime-sTime));

    }

}