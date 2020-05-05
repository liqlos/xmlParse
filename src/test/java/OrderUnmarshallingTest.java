import order.Order;
import order.Parameter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

class OrderUnmarshallingTest {
    private final String orderXmlPath = "src\\main\\resources\\order.xml";

    @Test
    public void testUnMarshallUsingJAXB() throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Order.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Order order = (Order) unmarshaller.unmarshal(new File(orderXmlPath));
        List<Parameter> orderParameters = order.getServices().getServ().getPars().getPar();

        //all attributes for "step=\"1\"" name="ГРАЖДАНСТВО"
        orderParameters.stream().filter(p -> p.getName().contains("ГРАЖДАНСТВО")).forEach(p -> System.out.println(p));

        //Getting all "<par_list" elements for "ВИД_ДОК" parameter
        orderParameters.stream().filter(p -> p.getName().contains("ВИД_ДОК")).forEach(p -> System.out.println(p.getParameterValues().toString()));
    }


    @Test
    @DisplayName("Right parameters count")
    public void rightParametersCount() throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Order.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Order order = (Order) unmarshaller.unmarshal(new File(orderXmlPath));
        List<Parameter> orderParameters = order.getServices().getServ().getPars().getPar();
        Assertions.assertEquals(5, orderParameters.size());

    }

}