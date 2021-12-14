package servlets;

import client.Order;
import client.WebServiceWorker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "OrderDetailsServlet", value = "/OrderDetailsServlet")
public class OrderDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("order_id");
        Order order = WebServiceWorker.getWorker().getOrderDetails(Integer.parseInt(id));
        request.setAttribute("order", order);
        request.getRequestDispatcher("/details.jsp").forward(request, response);
    }
}
