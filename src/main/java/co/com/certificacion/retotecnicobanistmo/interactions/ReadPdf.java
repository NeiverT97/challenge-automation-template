package co.com.certificacion.retotecnicobanistmo.interactions;

import static co.com.certificacion.retotecnicobanistmo.utils.PathDownLoadPDF.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ReadPdf {
    public static List<String> informationPdfList = new ArrayList<>();
    public static List<String> listInformation(){
        try {
            PDDocument document = PDDocument.load(new File(PATH_FILE));
            if (!document.isEncrypted()){
                PDFTextStripper pdfTextStripper =  new PDFTextStripper();
                String strInformation = pdfTextStripper.getText(document);

                String arrayInformation = strInformation.replace("\r\n"," ").replace("  "," ");
                informationPdfList.add(arrayInformation.trim());
            }
            document.close();
            File file = new File(PATH_FILE);
            file.delete();
        }catch (Exception e){
            Logger.getLogger("Fallo al leer pdf"+e.getMessage());
        }


        return informationPdfList;
    }

}
