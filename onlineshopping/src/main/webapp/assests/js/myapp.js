$(function() {

	switch (menu) {
	case 'Home':
		$('#homepage').addClass('active');
		break;

	case 'About Us':
		$('#about').addClass('active');
		break;

	case 'Contact':
		$('#contact').addClass('active');
		break;

	case 'Menu':
		$('#listMenu').addClass('active');
		break;

	default:
		$('#listMenu').addClass('active');
		$('#a_' + Menu).addClass('active');
		break;

	}

});

var $table = $('#productListTable');

var jsonUrl = "";

if (window.categoryId == 0) {

	jsonUrl = window.contextRoot + '/json/data/all/products';

} else {

	jsonUrl = window.contextRoot + '/json/data/category/' + window.categoryId
			+ '/products';

}

// excute the below code only where we have this table

if ($table.length) {

	// console.log('Inside the table');
	$table
			.DataTable({
				lengthMenu : [
						[ 3, 5, 10, -1 ],
						[ '3 Records', '5 Records', '10 Records', 'All Records' ] ],
				pageLength : 5,
				ajax : {
					url : jsonUrl,
					dataSrc : ''
				},
				columns : [
						{
							data : 'code',
							mRender : function(data, type, row) {
								
								return '<img src="' + window.contextRoot
										+ '/resources/images/' + data
										+ '.jpg" style="height:100px;width:100px"></img>';
							}
						},
						{
							data : 'name'
						},
						{
							data : 'brand'
						},
						{
							data : 'unitPrice',
							mRender : function(data, type, row) {
								return '&#x24;' + data;
							}
						},
						{
							data : 'quantity'
						},
						{

							data : 'id',
							mRender : function(data, type, row) {
								var str = '';
								str += '<a href="'
										+ window.contextRoot
										+ '/show/'
										+ data
										+ '/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span>view</a>&#160;';
								str += '<a href="'
										+ window.contextRoot
										+ '/cart/add/'
										+ data
										+ '/product"class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span>Add to Delivery</a>';
								return str;

							}
						}

				]
			});

}