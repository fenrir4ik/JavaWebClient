package servlets;

import client.ContactData;
import client.Order;
import client.WebServiceWorker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet(name = "UpdateOrderServlet", value = "/UpdateOrderServlet")
public class UpdateOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("updateId");
        Order order = WebServiceWorker.getWorker().getOrderDetails(Integer.parseInt(id));
        ArrayList<String> order_status = new ArrayList<>(Arrays.asList("New", "Accepted", "Declined", "Formed", "Canceled", "Executed"));
        order_status.remove(order.getOrderStatus());
        request.setAttribute("order", order);
        request.setAttribute("order_status", order_status);
        request.getRequestDispatcher("/update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("updateId"));
        ContactData orderContactData = new ContactData();
        orderContactData.setOrderTelno(request.getParameter("telno"));
        String address = request.getParameter("address");
        String status = request.getParameter("orderStatus");
        XMLGregorianCalendar order_date = null;
        try {
            String FORMATER = "yyyy-MM-dd";
            DateFormat format = new SimpleDateFormat(FORMATER);
            Date date = new Date();
            order_date = DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        WebServiceWorker.getWorker().changeOrder(new Order(id, order_date, status, orderContactData, address));
        if (status.equals("Executed")) {
            response.sendRedirect(request.getContextPath() + "/index");
        }
        else {
            response.sendRedirect(request.getContextPath() + "/UpdateOrderServlet?updateId=" + Integer.toString(id));
        }
    }
}
