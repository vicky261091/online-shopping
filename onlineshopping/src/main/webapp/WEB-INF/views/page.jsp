<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
        <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
    <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
    <spring:url var="css" value="/resources/css" />
    <spring:url var="js" value="/resources/js" />
    <spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping-${title}</title>
    <script>

    window.menu='${title}';
    window.contextRoot='${contextRoot}'
   
    
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
       
        <!-- Bootstrap readable theme -->
        <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
    

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>
<div class="wrapper">
    <!-- Navigation -->
<%@include file="/WEB-INF/shared/navbar.jsp"%>
    <!-- Page Content -->
    <div class="content">
    <c:if test="${userClickHome==true}">
<%@include file="/WEB-INF/views/home.jsp"%>
    </c:if>
     <c:if test="${userClickAbout==true}">
<%@include file="/WEB-INF/views/about.jsp"%>
    </c:if>
    <c:if test="${userClickContact==true}">
<%@include file="/WEB-INF/views/contact.jsp"%>
    </c:if>
        
    <c:if test="${userClickAllmenu==true or userClickCategoryMenu==true}">
<%@include file="/WEB-INF/views/listproducts.jsp"%>
    </c:if>
    <!-- /.container -->
</div>

    <!-- Footer -->
<%@include file="../shared/footer.jsp"%>
    

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/popper.min.js"></script>
    <script src="${js}/bootstrap.min.js"></script>
     <script src="${js}/jquery.dataTables.js"></script>
    
    <script src="${js}/myapp.js"></script>
    
   
    </div>
    
  </body>

</html>
