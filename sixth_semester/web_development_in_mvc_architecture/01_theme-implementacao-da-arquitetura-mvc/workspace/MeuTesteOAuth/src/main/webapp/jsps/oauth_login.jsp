<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css" />
    <body>
        <div class="col-sm-3 well">
            <h3>Logar com:</h3>
            <div class="list-group">
                <c:forEach var="url" items="${urls}">
                    <p>
                        <a href="${url.value}" class="list-group-item active">${url.key}</a>
                    </p>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
