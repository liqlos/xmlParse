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
    @DisplayName("Right parameters count")
    public void rightParametersCount() throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Order.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Order order = (Order) unmarshaller.unmarshal(new File(orderXmlPath));
        List<Parameter> orderParameters = order.getServices().getService().getParameterGroup().getParameters();
        Assertions.assertEquals(5, orderParameters.size());
    }

}