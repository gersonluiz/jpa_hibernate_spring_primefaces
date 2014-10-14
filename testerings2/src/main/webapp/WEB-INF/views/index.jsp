<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--@elvariable id="accounts" type="java.util.List<com.paulius.hibernateviajpa.entity.Account>"--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hibernate Via JPA Example</title>
        <style type="text/css">
            .label {
                display: block;
            }
        </style>
    </head>
    <body>
        <h1>Hibernate Via JPA Example Application</h1>

        <form:form action="${pageContext.servletContext.contextPath}/index.htm" commandName="index">

            <div>
                <form:label cssClass="label" path="name">Name: </form:label>
                <form:input path="name"/>
            </div>

            <div>
                <form:label cssClass="label" path="email">Email address: </form:label>
                <form:input path="email"/>
            </div>

            <div>
                <form:label cssClass="label" path="username">Username: </form:label>
                <form:input path="username"/>
            </div>

            <div>
                <form:label cssClass="label" path="password">Password: </form:label>
                <form:password path="password"/>
            </div>

            <div>
                <input type="submit" value="Register user"/>
            </div>

        </form:form>

        <hr/>

        <div>
            <a href="${pageContext.servletContext.contextPath}/index/show-users.htm">Show all users</a>

            <c:if test="${not empty accounts}">
            <div>
                <h3>Registered Users:</h3>

                <table border="1">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Username</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="account" items="${accounts}">
                        <tr>
                            <td><c:out value="${account.name}"/></td>
                            <td><c:out value="${account.email}"/></td>
                            <td><c:out value="${account.username}"/></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </div>
            </c:if>
        </div>

    </body>
</html>