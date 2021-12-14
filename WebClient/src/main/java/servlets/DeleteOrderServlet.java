package servlets;

import client.Order;
import client.WebServiceWorker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DeleteOrderServlet", value = "/DeleteOrderServlet/*")
public class DeleteOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("deleteId");
        WebServiceWorker.getWorker().deleteOrder(Integer.parseInt(id));
        response.sendRedirect(request.getContextPath() + "/index");
    }
}
