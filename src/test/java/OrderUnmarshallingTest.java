import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class OrderUnmarshallingTest {
    @Test
    public void testUnMarshallUsingJAXB() throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Order.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Order order = (Order) unmarshaller.unmarshal(new File("order.xml"));

    }
}