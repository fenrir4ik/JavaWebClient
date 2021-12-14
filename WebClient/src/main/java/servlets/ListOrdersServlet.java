package servlets;

import client.Order;
import client.WebServiceWorker;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListOrdersServlet", value = "/")
public class ListOrdersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Order> orders = WebServiceWorker.getWorker().getOrders();
        request.setCharacterEncoding("UTF-8");
        request.setAttribute("orders", orders);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}