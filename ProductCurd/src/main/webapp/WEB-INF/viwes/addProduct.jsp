<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>


</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<h1 class="text-centar-mb-3">AddProduct</h1>

				<form action="showForm" method="post">
					<div class="title">
						<i class="fas fa-pencil-alt"></i>
					</div>
					<div class="info">



						<input class="id" type="number" name="productId"
							placeholder="Enter id Number">
							
							 <input class="productName"
							type="text" name="productName" placeholder="Full name of product">


						<input class="address" type="text" name="productDes"
							placeholder="Diecreption"> 
							
							<input type="text"
							name="productPrice" placeholder="Enter price ">

					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger"> back </a>
							
							<button type="submit" class="btn btn-primary">add</button>






					</div>




				</form>





			</div>



		</div>


	</div>








</body>
</html>