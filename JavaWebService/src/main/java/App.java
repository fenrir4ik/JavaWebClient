import services.OrdersService;

import javax.xml.ws.Endpoint;

public class App {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8000/orders", new OrdersService());
    }
}
