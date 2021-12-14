<%@ include file="WEB-INF/jspf/taglib.jspf" %>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<head>
    <jsp:include page="header.jsp"/>
</head>
<body>
<jsp:include page="navigation.jsp"/>
<div class="container">
    <div class="card mb-3">
        <div class="card-body">
            <h5 class="card-title">Order №${order.getId()}</h5>
            <p class="card-text">Telephone number: ${order.getOrderContactData().getOrderTelno()}</h4>
            <p class="card-text">Date updated: ${order.getDateUpdated()}</h4>
            <p class="card-text">Delivery address: ${order.getAddress()}</h4>
            <p class="card-text">Order status: ${order.getOrderStatus()}</h4>
        </div>
    </div>
    <div class="float-right">
        <div class="d-flex flex-row-reverse justify-content-between" >
            <c:if test="${!order.getOrderStatus().equals('Executed')}">
                <form id="delete" action="/DeleteOrderServlet" method="post">
                    <input type="hidden" name="deleteId" value="${order.getId()}"/>
                    <button class="btn btn-danger">Delete</button>
                </form>
                <form id="update" action="/UpdateOrderServlet" method="get">
                    <input type="hidden" name="updateId" value="${order.getId()}"/>
                    <button class="btn btn-success">Change</button>
                </form>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>
