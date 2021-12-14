import client.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<Order> generateTestData() throws DatatypeConfigurationException {
        List<Order> data = new ArrayList<>();
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar("2021-11-21");
        ContactData orderContactData = new ContactData();
        orderContactData.setOrderTelno("+380505793545");
        data.add(new Order(1, date, "New", orderContactData, "Ул. Степанова, Дом 52, кв. 8", Executed.fromValue("Processing")));
        data.add(new Order(2, date, "Executed", orderContactData, "Ул. Науки, Дом 23, кв. 141", Executed.fromValue("Done")));
        return data;
    }

    public static void main(String[] args) throws DatatypeConfigurationException {
        List<Order> data = generateTestData();
        OrdersService service = new OrdersService();
        Orders client = service.getOrdersServicePort();

        System.out.println("Method 1 | AddOrder():");
        System.out.println("AddOrder with id 1: " + (client.addOrder(data.get(0))?"Success":"Already exists"));
        System.out.println("AddOrder with id 2: " + (client.addOrder(data.get(1))?"Success":"Already exists"));
        System.out.println("AddOrder with id 2: " + (client.addOrder(data.get(1))?"Success":"Already exists"));

        int orderId = 2;
        System.out.println("\nMethod 2 | GetOrderDetails("+orderId+"):");
        Order item = client.getOrderDetails(orderId);
        System.out.println(item);

        System.out.println("\nMethod 3 | GetOrders():");
        for (Order order : client.getOrders())
        {
            System.out.println(order);
        }

        orderId = 1;
        System.out.println("\nMethod 4 | DeleteOrder("+orderId+"):");
        client.deleteOrder(orderId);
        for (Order order : client.getOrders())
        {
            System.out.println(order);
        }

        orderId = 2;
        System.out.println("\nMethod 5 | ChangeOrder("+orderId+"):");
        Order changedItem = data.get(1);
        changedItem.setAddress("Новый адресс который не имеет смысла");
        client.changeOrder(changedItem);
        for (Order order : client.getOrders())
        {
            System.out.println(order);
        }
    }
}
