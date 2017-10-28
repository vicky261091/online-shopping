<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<html>
<body>
	<h2> Vicky's Food </h2>
	<h7>A place for all India Food</h7>

<div class="list-group">
		
			<c:forEach var="category" items="${categories}">
				<a href="${contextRoot}/show/category/${category.id}/Menu" class="list-group-item" id="a_${category.name}">${category.name}</a>
			</c:forEach>
		
</div>
	
</body>
</html>