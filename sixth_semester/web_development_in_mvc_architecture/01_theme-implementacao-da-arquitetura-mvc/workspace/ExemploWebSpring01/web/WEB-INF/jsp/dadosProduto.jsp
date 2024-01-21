<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produto</title>
    </head>
    <body>
        <h1>Novo Produto</h1>
        <f:form method="POST" action="addProduto">
            <f:label path="codigo">Codigo:</f:label>
            <f:input path="codigo"/><br/>
            <f:label path="nome">Nome:</f:label>
            <f:input path="nome"/><br/>            
            <f:label path="quantidade">Quantidade:</f:label>
            <f:input path="quantidade"/><br/>  
            <input type="submit" value="adicionar"/> 
        </f:form>
    </body>
</html>