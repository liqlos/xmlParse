package order;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public class ParameterGroup {
    @XmlElement
    private ArrayList <Parameter> par;

    public ArrayList<Parameter> getPar() {
        return par;
    }
}
