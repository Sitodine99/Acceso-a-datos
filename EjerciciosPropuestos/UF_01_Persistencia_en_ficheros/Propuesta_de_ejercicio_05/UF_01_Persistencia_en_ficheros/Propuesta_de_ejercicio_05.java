package UF_01_Persistencia_en_ficheros;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Propuesta_de_ejercicio_05 extends DefaultHandler {
    
    boolean bName = false;
    boolean bAge = false;
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("person")) {
            System.out.println("Start Element: " + qName);
        } else if (qName.equalsIgnoreCase("name")) {
            bName = true;
        } else if (qName.equalsIgnoreCase("age")) {
            bAge = true;
        }

    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("person")) {
            System.out.println("End Element: " + qName);
        }
    }
    
    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        if (bName) {
            System.out.println("Name: " + new String(ch, start, length));
            bName = false;
        } else if (bAge) {
            System.out.println("Age: " + new String(ch, start, length));
            bAge = false;
        }
    }
    
    public static void main(String[] args) {
        
        try {
            File inputFile = new File("Propuesta_de_ejercicio_05/miDirectorio/xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            Propuesta_de_ejercicio_05 userhandler = new Propuesta_de_ejercicio_05();
            saxParser.parse(inputFile, userhandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
