<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
        <c:if test="${not empty pageContext.request.remoteUser}">
        <c:url var="logoutUrl" value="/logout"/>
        <form class="form-inline" action="${logoutUrl}" method="post">
            Usuário Logado: <c:out value="${pageContext.request.remoteUser}"/>
            <input type="submit" value="Log out" />
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <hr/>
        </c:if>
        <h2>
            <a href="produtos/listaProdutos">Produtos</a>
        </h2>
    </body>
</html>
