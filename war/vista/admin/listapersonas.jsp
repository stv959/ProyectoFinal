<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="modelo.*"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>CLickComputer</title>
<style>
  .transpa  {
    background-color: transparent;
    
    border: 0px solid #000000;
}


</style>
<!-- Bootstrap -->
<link rel="stylesheet" href="css/basedatos.css">
<link rel="stylesheet" href="css/principal.css">
<link rel="stylesheet" href="css/secundaria.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<nav>
  <div class="container"> 
    
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-brand" href="#">CLickComputer</a> </div>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Inicio <span class="sr-only">(current)</span></a> </li>
     
        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu <span class="caret"></span></a>
         <ul class="dropdown-menu" role="menu">
            <li><a href="#"></a> </li>
            <li><a href="paginaprincipal.html">Principal</a> </li>
            <li class="divider"></li>
            <li><a href="quienessomos.html">¿Quienes Somos?</a> </li>
            <li class="divider"></li>
            <li><a href="#">Lista</a> </li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-right" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Ingrese el texto a buscar">
        </div>
        <button type="submit" class="btn btn-default">Buscar</button>
      </form>
    
    </div>
    <!-- /.navbar-collapse --> 
  </div>
  <!-- /.container-fluid --> 
</nav>
<div class="container">
    <div class="row">
      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
        <div id="carousel1" class="carousel slide">
          <ol class="carousel-indicators">
            <li data-target="#carousel2" data-slide-to="1" class="active"> </li>
            <li data-target="#carousel2" data-slide-to="2" class=""> </li>
            <li data-target="#carousel1" data-slide-to="3" class=""> </li>
            <li data-target="#carousel1" data-slide-to="4" class=""> </li>
                      
          </ol>
          <div class="carousel-inner">
            <div class="item"> <img class="img-responsive" src="img/fr1.jpg" alt="thumb">
              <div class="carousel-caption"><h3>Toshiba Satellite Radius</h3></div>
            </div>
            <div class="item active"> <img class="img-responsive" src="img/fr2.jpg" alt="thumb">
              <div class="carousel-caption"><h3>Dell Inspiron 15R M531R</h3> </div>
            </div>
            <div class="item"> <img class="img-responsive" src="img/fr3.jpg" alt="thumb">
              <div class="carousel-caption"><h3>Asus</h3></div>
            </div>
            
            <div class="item"> <img class="img-responsive" src="img/fr4.jpg" alt="thumb">
              <div class="carousel-caption"><h3>Lenovo</h3></div>
            </div>
                 
          </div>
          <a class="left carousel-control" href="#carousel1" data-slide="prev"><span class="icon-prev"></span></a> <a class="right carousel-control" href="#carousel1" data-slide="next"><span class="icon-next"></span></a></div>
      </div>
</div>
    <hr>
    
  </div>
<div class="container">
  <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
      <div class="row">
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-2"><a href="inicioadmin.jsp"><img class="img-circle" alt="Free Shipping" src="img/home.jpg"></a></div>
        <div class="col-lg-6 col-md-9 col-xs-9 col-sm-7">
          <h4><center>Inicio</center></h4>
        </div>
      </div>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
      <div class="row">
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-2"><img class="img-circle" alt="Free Shipping" src="img/quienessomos.jpg"></div>
        <div class="col-lg-6 col-md-9 col-xs-9 col-sm-7">
          <h4><center>Quienes Somos ?</center></h4>
        </div>
      </div>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
     <div class="row">
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-2"><img class="img-circle" alt="Free Shipping" src="img/logueado.jpg"></div>
        <div class="col-lg-6 col-md-9 col-xs-9 col-sm-7">
          <h4><center>ADMIN</center></h4>
        </div>      
      </div> 
    </div>
    
    
  </div>
  
</div>



<div class="container">
  <div class="row text-center">
    
   
    
    <%
List<Persona> personas = (List<Persona>)request.getAttribute("personas");
%>

<div class="Table">
	<div class="Title"><p>Se encuentran <%= personas.size()%> personas registradas </p></div>
	<center><div class="row">
	
		<div class="Cell"><p>Nombres</p></div>
		<div class="Cell"><p>Apellidos</p></div>
		<div class="Cell"><p>Correo electrónico</p></div>
		<div class="Cell"><p>Tipo de cuenta</p></div>
		<div class="Cell"><p>Activo</p></div>
		<div class="Cell"><p>cambiar por</p></div>
		
	</div></center>

<% for( Persona p : personas ) { %>		<form action="editar" method="post">

	<div class="Row">		
		<div class="Cell"><p><input class="transpa" type="text" name="nombre" readonly value="<%= p.getNombre() %>" size="12"></p></div>
		<div class="Cell"><p><input class="transpa" type="text" name="apellido" readonly value="<%= p.getApellido() %>" size="12"></p></div>
		<div class="Cell"><p><input class="transpa" type="text" name="email" readonly value="<%= p.getEmail() %>" size="20"></p></div>
		<div class="Cell"><p><input class="transpa" type="text" name="tipo" readonly value="<%= p.getTipo() %>" size="12"></p></div>
		<div class="Cell"><p><%= p.getActivo() %></p></div>
		<div class="Cell"><p><input class="transpa" type="text" name="activo" readonly value="<%=!p.getActivo() %>" size="1">
		<input type="submit" value="si"></p></div>
		
		</div>
	
	</form>
<% } %>


</div>



  </div>
  <div class="row text-center hidden-xs">
  </div>
  <nav class="text-center">
    <!-- Add class .pagination-lg for larger blocks or .pagination-sm for smaller blocks-->
    
  </nav>
</div>
<h2 class="text-center">varios</h2>
<hr>
<div class="container">
  <div class="row">
    <div class="col-md-6 col-lg-6">
      <div class="media-object-default">
        <div class="media">
          <div class="media-left"> <a href="#"> <img src="img/o1.jpg" alt="placeholder image" width="140" height="110" class="media-object"> </a> </div>
          <div class="media-body">
            <h4 class="media-heading">Rocket League®</h4>
          </div>
        </div>
        <div class="media">
          <div class="media-left"> <a href="#"> <img src="img/o2.jpg" alt="placeholder image" width="140" height="110" class="media-object"> </a> </div>
          <div class="media-body">
            <h4 class="media-heading">Sleeping Dogs: Definitive Edition</h4>
           </div>
        </div>
       
      </div>
    </div>
    <hr class="hidden-md hidden-lg">
    <div class="col-md-6 col-lg-5 col-lg-offset-1">
      <div class="media-object-default">
        <div class="media">
          <div class="media-left"> <a href="#"> <img src="img/o3.jpg" alt="placeholder image" width="140" height="110" class="media-object"></a></div>
          <div class="media-body">
            <h4 class="media-heading">STAR WARS™ Empire at War - Gold Pack</h4>
          </div>
        </div>         
        </div>
 <div class="media">
          <div class="media-left"> <a href="#"> <img src="img/o4.jpg" alt="placeholder image" width="140" height="110" class="media-object"></a></div>
          <div class="media-body">
            <h4 class="media-heading">Sid Meier’s Civilization® VI</h4>
           </div>
        </div>
        
      </div>
    </div>
    <hr class="hidden-lg">
    <div class="col-lg-4 col-md-12 hidden-md">
      <div class="media-object-default">
        
       
        
      </div>
    </div>
  </div>
  <div class="container well">
    <div class="row">
    
     
      <div class="col-xs-6 col-sm-6 col-md-6 col-lg-7">
      <h4>TambiÃ©n nos encuentran en: </h4>
      <br>
       <h5> &nbsp &nbsp &nbsp   Facebook   &nbsp &nbsp  &nbsp &nbsp  &nbsp Twitter &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp   Gmail</h5>
         <nav class="finalredes">

        <ul class="redes">

            <li>
<ul class="listasocial">

        <li><a class="sociales" href="#"><span class="fontawesome-facebook"></span></a></li>

                    <li><a class="sociales" href="#"><span class="fontawesome-twitter"></span></a></li>

                    <li><a class="sociales" href="#"><span class="fontawesome-google-plus"></span></a></li>

                </ul>

          </li>

        </ul>

    </nav>
<div class="row">
  
  
  
  
  
  
  
  
  
</div>
        
      </div>
   <div class="col-xs-6 col-sm-6 col-md-6 col-lg-5"> 
        <address>
        <strong>CLickComputer</strong><br>
        Arequipa, Perú<br>
        ------------------------------------<br>
        <abbr title="Phone">Desarrolladores: Córdova Puma Steven 
        <br> &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp  Murga Díaz Frank 
        <br> &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp  Rivera Quispe Anderson </abbr>
      </address>
        <address>
        <strong>Contáctenos</strong><br>
        <a href="mailto:#">click.computer2@hotmail.com</a><br>
                </address>
      </div>
    </div>
  </div>

<footer class="text-center">
  <div class="container">
    <div class="row">
      <div class="col-xs-12">
        <p>Copyright Â© CLickComputer. All rights reserved.</p>
      </div>
    </div>
  </div>
</footer>
<script src="js/jquery-1.11.2.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
</body>
</html>