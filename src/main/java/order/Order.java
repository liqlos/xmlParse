package order;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "order")
public class Order {
    @XmlElement
    private int summa;

    @XmlElement
    private ServiceGroup services;

    public int getSumma() {
        return summa;
    }

    public ServiceGroup getServices() {
        return services;
    }
}
