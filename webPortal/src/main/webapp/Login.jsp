<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 	<script type="text/javascript" src="https://code.jquery.com/jquery-1.7.2.min.js"></script> -->
<!--     <script src="https://code.jquery.com/jquery-3.2.1.js" type="text/javascript"></script>  -->
    <script src="https://code.jquery.com/jquery-1.9.1.min.js" type="text/javascript"></script> 

<script type="text/javascript" src="static/js/login.js"></script>
<script type="text/javascript" src="static/js/jquery.blockui.js"></script>
<script type="text/javascript" src="static/js/validador.js"></script>
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link type="text/css" rel="stylesheet" href="static/css/styleUrrea.css">
<link type="text/css" rel="stylesheet" href="static/css/chosen.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
    
<!--     <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script> -->
<!--     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> -->
    

  <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

       <!-- Material Design Bootstrap -->

<title>PORTAL URREA BPM</title>

</head>
<body>
	<div id="dialog" title="Aviso" class="popup">
		<span id="descripcion">Internet Explorer no est&aacute;	soportado, se recomienda utilizar Google Chrome.</span>
	</div>


		<table align="center" width="100%" height="100%">
	<form name='f' action="j_spring_security_check" method='POST'>
<!-- 	<form name='f' action="acceso" method='POST'> -->
			<tr>
				<td width="40%">
				<a href="http://bsvalur05:8080/BizAgi-war/" target="_blank">
					<img src="data:image/jpg;base64,${imagen}" id="figuraImg" class="showModalFig" width="100%" alt="100%" />
					</a>
				</td>
<!-- 				<td width="30%" bordercolor="red" > -->
<%-- 				<a href="<c:url value="/justificantes"/>" class="boton_1">Generar Permisos</a> --%>
<!-- 				</td> -->
				<td width="30%" bordercolor="blue" >
				<a href="<c:url value="/procesos/usuarios/permisosJusticantes"/>" class="boton_1">Generar Permisos M&oacute;vil</a>
				</td>
				<td  width="30%" >
					<h1>Acceso a usuarios</h1> 
					<c:if test="${param.error!=null } ">
						<span style="color: red;" >!Error de credenciales!</span>
					</c:if>
					<table>
						<tr>
							<td>Usuario</td>
							<td><input type="text" name="usuario" id="usuario"></td>
						</tr>
						<tr>
							<td>Contraseña:</td>
							<td><input type="password" name="clave" id="clave"></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Acceder "></td>
						</tr>
						<tr>
						<td colspan="2" align="center">
							Olvidaste tu contraseña?
							<a id="recordarPassword" >click aqui para recuperarla </a>
						</td>
						</tr>
					</table> <br>

<!-- 					<hr>Recursos y preguntas frecuentes -->
<!-- 					<hr /> -->
					
					 <br> <br>
					
					<hr>
    	<div class="dropdown mb-2">
            <button class="btn btn-dark dropdown-toggle text-capitalize" id="botonDropdown"
            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Recursos y preguntas frecuentes
            </button>
            <div class="dropdown-menu" aria-labelledby="botonDropdown">
<%--                 <a href="<c:url value="/about/preg"/>" class="dropdown-item">Preguntas Frecuentes</a> --%>
          
            </div>
        </div>
        <hr>
				</td>
			</tr>
			
			<tr>
			<td width="100%" colspan="3">
			<img src="data:image/jpg;base64,${imagen2}" id="figuraImg2" class="showModalFig" width="100%" alt="100%"/>
			</td>
<!-- 			<td> -->
<!-- 		otra columna  -->
<!-- 			</td> -->
			</tr>
</form>
		</table>

		<!-- BEGIN CERTIFICADO SSL -->
		<div style="text-align: -webkit-right;">
			<script type="text/javascript"
				src="https://seal.verisign.com/getseal?host_name=urreaenlinea.mx&amp;size=L&amp;use_flash=YES&amp;use_transparent=YES&amp;lang=es"></script>
			<br /> <a
				href="http://www.verisign.es/products-services/security-services/ssl/ssl-information-center/"
				target="_blank">Acerca de los certificados SSL</a>
		</div>
		<!-- END CERTIFICADO SSL -->
	
	
</body>
</html>