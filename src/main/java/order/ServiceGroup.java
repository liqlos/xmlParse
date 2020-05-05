package order;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public class ServiceGroup {
    @XmlElement
    private Service serv;

    public Service getServ() {
        return serv;
    }
}
