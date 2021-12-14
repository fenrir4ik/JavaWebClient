package client;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WebServiceWorker {
    private static Orders client;

    public static Orders getWorker() {
        OrdersService service = new OrdersService();
        return service.getOrdersServicePort();
    }

    static {
        OrdersService service = new OrdersService();
        client = service.getOrdersServicePort();
        List<Order> data = null;
        try {
            data = loadData();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        if (!Objects.isNull(data)) {
            for (int i = 0; i < data.size(); i++) {
                client.addOrder(data.get(i));
            }
        }
    }

    private static List<Order> loadData() throws DatatypeConfigurationException {
        List<Order> data = new ArrayList<>();
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar("2021-11-21");
        ContactData orderContactData = new ContactData();
        orderContactData.setOrderTelno("+380505793545");
        data.add(new Order(1, date, "New", orderContactData, "Ул. Степанова, Дом 52, кв. 8", Executed.fromValue("Processing")));
        data.add(new Order(2, date, "Executed", orderContactData, "Ул. Науки, Дом 23, кв. 141", Executed.fromValue("Done")));
        return data;
    }
}
