
    
<div class="container">
<div class="row">



<!-- to display sidebar -->
<div class="col-lg-3">

       <jsp:include page="../shared/sidebar.jsp" />    
       
  </div>
  
  
  
<!-- to display actual products -->
<div class="col-md-9">
<!-- added bread crum component -->
<div class="row">

<div class="col-lg-12">

<c:if test="${userClickAllProducts==true}">
<ol class="breadcrumb">
<li><a href="${contextRoot}/home">Home</a></li>
<li class="active">All Products</li>
</ol>
</c:if>

<c:if test="${userClickCategoryProducts==true}">
<ol class="breadcrumb">
<li><a href="${contextRoot}/home">Home</a></li>
<li class="active">Category</li>
<li class="active">${category.name}</li>

</ol>
</c:if>

</div>

</div>

</div>







</div>
</div>