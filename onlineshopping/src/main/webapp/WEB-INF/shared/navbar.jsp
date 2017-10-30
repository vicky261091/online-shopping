         <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
 
 <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="${contextRoot}/home">Online Fooding</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
          
             <li id="homepage" class="nav-item" >
              <a class="nav-link" href="${contextRoot}/home">Home</a>
            </li>
            <li id="about" class="nav-item">
              <a class="nav-link" href="${contextRoot}/about">About Us</a>
            </li>
            
            <li id="listMenu"class="nav-item">
              <a class="nav-link" href="${contextRoot}/show/all/Menu">Menu</a>
            </li>
            <li id="contact"class="nav-item">
              <a class="nav-link" href="${contextRoot}/contact">Contact</a>
            </li>
           
            
            
          </ul>
        </div>
      </div>
    </nav>
