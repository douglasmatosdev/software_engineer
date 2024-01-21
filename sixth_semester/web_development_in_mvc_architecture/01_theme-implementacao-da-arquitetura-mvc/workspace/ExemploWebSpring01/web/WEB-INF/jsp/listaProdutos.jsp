<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1>Lista de Produtos Cadastrados</h1>
        <a href="../">Página Inicial</a><hr/>
        <c:if test="${not empty produtos}">
            <table width="80%" border="1">
                <tr><td>Codigo</td><td>Nome</td><td>Quantidade</td>
                    <td>&nbsp;</td>
                </tr>
                <c:forEach var="prod" items="${produtos}">
                    <tr><td>${prod.codigo}</td><td>${prod.nome}</td>
                        <td>${prod.quantidade}</td>
                        <td><a href="removeProduto?codigo=${prod.codigo}">X</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <a href="dadosProduto">Novo Produto</a>
    </body>
</html>
