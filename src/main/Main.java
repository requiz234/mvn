package main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import printXML.Print;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by User on 27.11.2015.
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Print print = new Print();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/resource/config.xml"));
        document.getDocumentElement().normalize();
        Element root = document.getDocumentElement();
        System.out.println("Root element :" + root.getNodeName());

        if (root.hasChildNodes()) {

            print.printNote(root.getChildNodes());

        }

    }


}
    

