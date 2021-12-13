package services;

import models.Order;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface Orders {
    @WebMethod
    List<Order> getOrders();

    @WebMethod
    Order getOrderDetails(int orderId);

    @WebMethod
    boolean addOrder(Order order);

    @WebMethod
    void deleteOrder(int orderId);

    @WebMethod
    void changeOrder(Order order);
}
