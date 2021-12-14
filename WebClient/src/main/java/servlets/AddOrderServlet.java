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
import java.util.Date;
import java.util.GregorianCalendar;

@WebServlet(name = "AddOrderServlet", value = "/AddOrderServlet")
public class AddOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("/add.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String telno = request.getParameter("telno");
        ContactData orderContactData = new ContactData();
        orderContactData.setOrderTelno(telno);
        String address = request.getParameter("address");
        String status = "New";
        XMLGregorianCalendar order_date = null;
        try {
            String FORMATER = "yyyy-MM-dd";
            DateFormat format = new SimpleDateFormat(FORMATER);
            Date date = new Date();
            order_date = DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        WebServiceWorker.getWorker().addOrder(new Order(4, order_date, status, orderContactData, address));
        response.sendRedirect(request.getContextPath() + "/index");
    }
}
