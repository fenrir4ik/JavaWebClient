<%@ include file="WEB-INF/jspf/taglib.jspf" %>
<%@ page import="java.util.List" %>
<%@ page import="client.Order" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="WEB-INF/jspf/head.jspf" %>
</head>
<body>
<jsp:include page="navigation.jsp"/>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">№</th>
            <th scope="col">Telephone number</th>
            <th scope="col">Order status</th>
            <th scope="col">Date updated</th>
            <th scope="col" width="45px"></th>
            <th scope="col" width="45px"></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="order" items="${orders}">
            <tr>
                <th scope="row"><a href="/OrderDetailsServlet?order_id=${order.getId()}">${order.getId()}</a></th>
                <td>${order.getOrderContactData().getOrderTelno()}</td>
                <td>${order.getOrderStatus()}</td>
                <td>${order.getDateUpdated()}</td>
                <c:choose>
                    <c:when test="${order.getOrderStatus().equals('Executed')}">
                        <td><a class="btn disabled btn-secondary">Change</a></td>
                        <td><a class="btn disabled btn-secondary">Delete</a></td>
                    </c:when>
                    <c:otherwise>
                        <td>
                            <form id="update" action="/UpdateOrderServlet" method="get">
                                <input type="hidden" name="updateId" value="${order.getId()}"/>
                                <button class="btn btn-success">Change</button>
                            </form>
                        </td>
                        <td>
                            <form id="delete" action="/DeleteOrderServlet" method="post">
                                <input type="hidden" name="deleteId" value="${order.getId()}"/>
                                <button class="btn btn-danger">Delete</button>
                            </form>
                        </td>
                    </c:otherwise>
                </c:choose>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>