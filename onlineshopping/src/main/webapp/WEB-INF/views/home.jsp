<div class="container">

      <div class="row">

        <div class="col-lg-3">
       <%@ include file="/WEB-INF/shared/sidebar.jsp" %>  
        </div>
        <!-- /.col-lg-3 -->

        <div class="col-lg-9">

          <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
              <div class="carousel-item active">
              <c:url value="/resources/images/" var="frontImage" />`
               <img src="${frontImage}/Front.jpg" style="height:200px;width:800px" ></img></div>
              <br>
              <br>
              <div class="carousel-item">
                <img src="${frontImage}/PRDABC123DEFX.jpg" style="height:400px;width:1000px" alt="Second slide"><br>
              </div>
              <br>
              <br>
              <div>
                <img src="${frontImage}/PRDPQR123WGTX.jpg" style="height:400px;width:1000px" alt="Third slide">
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>


          <!-- /.row -->

        </div>
        <!-- /.col-lg-9 -->

      </div>
      <!-- /.row -->

    </div>