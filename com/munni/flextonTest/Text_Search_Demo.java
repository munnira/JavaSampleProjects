//package com.munni.flextonTest;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//import com.gnostice.pdfone.PDFOne;
//import com.gnostice.pdfone.PdfDocument;
//import com.gnostice.pdfone.PdfException;
//import com.gnostice.pdfone.PdfSearchElement;
//import com.gnostice.pdfone.PdfSearchMode;
//import com.gnostice.pdfone.PdfSearchOptions;
//
//public class Text_Search_Demo
//{
//    public static void main(String[] args) throws IOException, PdfException, Exception {
//        
//        int i, n;
//        PdfSearchElement pseResult;
//        
//        // Load a PDF document 
//        PdfDocument doc = new PdfDocument();
//        doc.load("Input_Docs\\input_doc.pdf");
//        
//        // Obtain all instances of the word "alcohol" in page 4 
//        ArrayList lstSearchResults1 = 
//           (ArrayList) doc.search("alcohol",
//                                  4,
//                                  PdfSearchMode.LITERAL,
//                                  PdfSearchOptions.NONE);
//        // Close the document
//        doc.close();
//        
//        // Iterate through all search results
//        n = lstSearchResults1.size();        
//        for (i = 0; i < n; i++) {
//            pseResult = (PdfSearchElement) lstSearchResults1.get(i);
//            // Print search results to console output
//            System.out.println("Found \"" + 
//                               pseResult.getMatchString()  + 
//                               "\" in page #" + 
//                               pseResult.getPageNum() + 
//                               " text \"" + 
//                               pseResult.getLineContainingMatchString()  + 
//                               "\"" );
//        }
//    }
//}
