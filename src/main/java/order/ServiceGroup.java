package order;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public class ServiceGroup {
    @XmlElement(name = "serv")
    private Service service;

    public Service getService() {
        return service;
    }
}
