<%@ include file="WEB-INF/jspf/taglib.jspf" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="WEB-INF/jspf/head.jspf" %>
</head>
<body>
<jsp:include page="navigation.jsp" />
<div class="container">
    <h6 class="card-title">Order №${order.getId()}</h6>
    <c:choose>
        <c:when test="${order.getOrderStatus().equals('Executed')}">
            <form>
                <div class="form-group">
                    <label for="telno">Telephone number</label>
                    <input value="${order.getOrderContactData().getOrderTelno()}" class="form-control" id="telno" name="telno" placeholder="Enter telephone number" pattern="\+380[0-9]{9,9}" disabled>
                    <small id="telnoinfo" class="text-muted">Telephone number in format +380XXXXXXXXX</small>
                </div>
                <div class="form-group">
                    <label for="address">Delivery address</label>
                    <textarea class="form-control" id="address" name="address" placeholder="Enter address" rows="3" disabled>${order.getAddress()}</textarea>
                </div>
                <div class="form-group">
                    <label for="orderStatus">Order status</label>
                    <select name="orderStatus" class="custom-select" disabled>
                        <option value="New" selected>${order.getOrderStatus()}</option>
                        <c:forEach var="status" items="${order_status}">
                            <option value="${status}">${status}</option>
                        </c:forEach>
                    </select>
                </div>
            </form>
        </c:when>
        <c:otherwise>
            <form action="/UpdateOrderServlet" method="post">
                <div class="form-group">
                    <label for="telno">Telephone number</label>
                    <input value="${order.getOrderContactData().getOrderTelno()}" class="form-control" id="telno" name="telno" placeholder="Enter telephone number" pattern="\+380[0-9]{9,9}" required>
                    <small id="telnoinfo" class="text-muted">Telephone number in format +380XXXXXXXXX</small>
                </div>
                <div class="form-group">
                    <label for="address">Delivery address</label>
                    <textarea class="form-control" id="address" name="address" placeholder="Enter address" rows="3" required>${order.getAddress()}</textarea>
                </div>
                <div class="form-group">
                    <label for="orderStatus">Order status</label>
                    <select name="orderStatus" class="custom-select">
                        <option value="New" selected>${order.getOrderStatus()}</option>
                        <c:forEach var="status" items="${order_status}">
                            <option value="${status}">${status}</option>
                        </c:forEach>
                    </select>
                </div>
                <input type="hidden" name="updateId" value="${order.getId()}"/>
                <div class="float-right">
                    <div class="d-flex flex-row-reverse justify-content-between" >
                        <button type="submit" class="btn btn-success" style="margin-top: 5px">Save</button>
                    </div>
                </div>
            </form>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>
