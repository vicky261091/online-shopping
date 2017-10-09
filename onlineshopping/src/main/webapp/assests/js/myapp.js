
    $(function(){

    	switch(menu){
    	case 'Home':
        	$('#homepage').addClass('active');
        	break;
        	
    	case 'About Us':
    	$('#about').addClass('active');
    	break; 
    	
    	case 'Contact':
        	$('#contact').addClass('active');
           break;
           
    	case 'Allproducts':
        	$('#listProducts').addClass('active');
           break;
           
    	default:
        	$('#listProducts').addClass('active');
        	$('#a_'+menu).addClass('active');
           break;
    
    	}
    	
    	
    	});