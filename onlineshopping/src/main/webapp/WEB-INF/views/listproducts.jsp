

<div class="container">
	<div class="row">



		<!-- to display sidebar -->
		<div class="col-lg-3">

			<jsp:include page="../shared/sidebar.jsp" />

		</div>



		<!-- to display actual Menu -->
		<div class="col-md-9">
			<!-- added bread crum component -->
			<div class="row">

				<div class="col-lg-12">
					<table id="productListTable"
						class="table table-striped table-borderd">
						<thead>
							<tr>
								<th></th>
								<th>NAME</th>
								<th>BRAND</th>
								<th>UNIT PRICE</th>
								<th>QUANTITY</th>
								<th></th>


							</tr>
						</thead>
						>
					</table>
					<c:if test="${userClickAllmenu==true}">
						<script>
							window.categoryId = 0;
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Menu</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryMenu==true}">
						<script>
							window.categoryId = '${category.id}';
						</script>
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
