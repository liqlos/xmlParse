import database.SqliteConnection;
import order.Order;
import order.Parameter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run {
    public static void main(String[] args) throws JAXBException {

        final String orderXmlPath = "src\\main\\resources\\order.xml";

        JAXBContext jc = JAXBContext.newInstance(Order.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Order order = (Order) unmarshaller.unmarshal(new File(orderXmlPath));
        List<Parameter> orderParameters = order.getServices().getService().getParameterGroup().getParameters();

        //Getting all "<par_list" elements for "ВИД_ДОК" parameter
        orderParameters.stream().filter(p -> p.getName().contains("ВИД_ДОК"))
                .forEach(parameter -> parameter.getParameterValues()
                        .stream().forEach(parameterValue -> System.out.println(parameterValue.toString())));


        SqliteConnection.open();
        orderParameters.stream().filter(p -> p.getName().contains("ВИД_ДОК"))
                .forEach(parameter -> parameter.getParameterValues()
                        .stream().forEach(parameterValue -> SqliteConnection.insertDocType(parameterValue.toString())));
        SqliteConnection.close();

        System.out.println("----------");
        //all attributes for "step=\"1\"" name="ГРАЖДАНСТВО"
        orderParameters.stream().filter(p -> p.getName().contains("ГРАЖДАНСТВО")).forEach(p -> System.out.println(p));


    }
}
