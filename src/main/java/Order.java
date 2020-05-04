import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(propOrder = {
        "summa",
        "services"
})
@XmlRootElement
public class Order {
    private int summa;
    private List<Service> services;

    public List<Service> getServices() {
        return services;
    }

    public int getSumma() {
        return summa;
    }
}
