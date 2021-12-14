package servlets;

import client.Order;
import client.Orders;
import client.OrdersService;
import client.WebServiceWorker;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MainServlet", value = "/MainServlet")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrdersService service = new OrdersService();
        Orders worker = service.getOrdersServicePort();
        System.out.println(worker.getOrders());
        for (Order order : WebServiceWorker.getWorker().getOrders())
        {
            System.out.println(order);
        }
        PrintWriter pw = response.getWriter();
        pw.println("<h1>Data</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}