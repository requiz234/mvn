package printXML;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by User on 28.11.2015.
 */
public class Print {
    public  void printNote(NodeList nodeList) {
        for (int temp = 0; temp < nodeList.getLength(); temp++) {

            Node node = nodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("Node Name = " + node.getNodeName() + ", value= " + node.getTextContent());

                if (node.hasAttributes()) {

                    NamedNodeMap nodeMap = node.getAttributes();
                    for (int i = 0; i < nodeMap.getLength(); i++) {
                        Node tempNode = nodeMap.item(i);
                        System.out.println("Attr name : " + tempNode.getNodeName() + ", Attr value = " + tempNode.getNodeValue());

                    }
                    if (node.hasChildNodes()) {
                        printNote(node.getChildNodes());
                        System.out.println("");
                    }
                }
            }
        }

    }
}
