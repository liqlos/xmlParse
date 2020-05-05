package order;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public class ParameterGroup {
    @XmlElement(name = "par")
    private ArrayList <Parameter> parameters;

    public ArrayList<Parameter> getParameters() {
        return parameters;
    }
}
