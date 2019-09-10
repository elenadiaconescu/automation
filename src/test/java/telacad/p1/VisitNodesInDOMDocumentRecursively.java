package telacad.p1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class VisitNodesInDOMDocumentRecursively {
    public VisitNodesInDOMDocumentRecursively(final String file) throws Exception {
        DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
        Document doc = docBuilder.parse(this.getClass().getResourceAsStream(
                file));
        List<String> l = new ArrayList<String>();
        parse(doc, l, doc.getDocumentElement());
        System.out.println(l);
    }

    public static void main(final String[] args) throws Exception {
        new VisitNodesInDOMDocumentRecursively("telacad/p1/personWithDTD.xml");
    }

    private void parse(final Document doc, final List<String> list, Element e) {
        NodeList children = e.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node n = children.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE) {
                list.add(n.getNodeName());
                parse(doc, list, (Element) n);
            }
        }
    }
}
