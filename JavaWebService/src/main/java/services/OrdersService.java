package services;

import models.Order;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@WebService(endpointInterface = "services.Orders", serviceName = "OrdersService")
public class OrdersService implements Orders {
    private static List<Order> orderList = new ArrayList<>();

    @Override
    public List<Order> getOrders() {
        return orderList;
    }

    @Override
    public Order getOrderDetails(int orderId) {
        for (Order item: orderList) {
            if (item.getId()==orderId) {
                return item;
            }
        }
        return null;
    }

    @Override
    public boolean addOrder(Order order) {
        boolean contains = false;
        for (Order item: orderList) {
            if (item.getId()==order.getId()) {
                contains = true;
            }
        }
        if (!contains){
            orderList.add(order);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void deleteOrder(int orderId) {
        orderList.removeIf(e->e.getId() == orderId);
    }

    @Override
    public void changeOrder(Order order) {
        ListIterator<Order> iterator = orderList.listIterator();
        while (iterator.hasNext()) {
            Order next = iterator.next();
            if (next.getId() == order.getId()) {
                iterator.set(order);
            }
        }
    }
}
