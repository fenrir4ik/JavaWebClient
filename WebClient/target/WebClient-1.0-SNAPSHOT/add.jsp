<%@ include file="WEB-INF/jspf/taglib.jspf" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="WEB-INF/jspf/head.jspf" %>
</head>
<body>
<jsp:include page="navigation.jsp" />
<div class="container">
    <form action="/AddOrderServlet" method="post">
        <div class="form-group">
            <label for="telno">Telephone number</label>
            <input class="form-control" id="telno" name="telno" placeholder="Enter telephone number" pattern="\+380[0-9]{9,9}" required>
            <small id="telnoinfo" class="text-muted">Telephone number in format +380XXXXXXXXX</small>
        </div>
        <div class="form-group">
            <label for="address">Delivery address</label>
            <textarea class="form-control"  id="address" name="address" placeholder="Enter address" rows="3" required></textarea>
        </div>
        <button class="btn btn-success">Add</button>
    </form>
</div>
</body>
</html>
