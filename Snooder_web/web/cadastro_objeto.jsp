<%-- 
    Document   : cadastro_objeto
    Created on : 28/09/2015, 22:07:16
    Author     : pernambucanas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
  <title>Alpha Snooder</title>

  <!-- Bootstrap -->
  <link href="css/bootstrap.min.css" rel="stylesheet">

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>

<body>
  <div class="header-top navbar-inverse" id="header">
    <div class="container">
      <div class="collapse navbar-collapse navbar-left">
        <div class="nav navbar-nav">
          <p class="navbar-text">Telefone: 99 9999-9999</p>
          <p class="navbar-text">E-mail: contact@snooder.com</p>
        </div>
      </div>
      <div class="collapse navbar-collapse pull-right" >
        <ul class="nav navbar-nav">
          <li><a href="#"> Registrar </a></li>
          <li class="vertical-line"></li>
          <li><p class="navbar-text"> | </p></li>
          <li><a href="#"> Entrar </a></li>
        </ul>
      </div>
    </div>
  </div>

  <nav id="top-bar" class="navbar navbar-default navbar-static-top" style="width: 100%; margin: 0px">
  <!--
  <nav class="navbar navbar-default navbar-static-top affix" data-spy="affix" style="width: 100%; margin-top: 50px;">
  <nav class="header fixed clearfix">
  -->
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">

        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a href="index.html" class="navbar-brand" style="padding-left: 50px">Snooder</a>

      </div>
      <!--<p class="navbar-text"></p>-->

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse pull-right" id="bs-example-navbar-collapse-1">

        <ul class="nav navbar-nav">
          <li class="active"><a href="#"> Home <span class="sr-only">(current)</span></a></li>
          <li><a href="#perdidos"> Perdidos </a></li>
          <li><a href="#encontrados"> Encontrados </a></li>
          <li><a href="#"> Contato </a></li>
        </ul>
        <form class="navbar-form navbar-left" role="search">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="Pesquisar">
          </div>
          <button type="submit" class="btn btn-default">Submit</button>
        </form>

      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>

  <div class="well" style="margin: 3% 30%">
    <form>
      <div class="form-group">
		<label for="nome">Tipo de cadastro:</label>&nbsp;&nbsp;
		<input type="radio" name="tipocadastro" value="perdido"> Perdido<br />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="radio" name="tipocadastro" value="encontrado"> Encontrado<br />
        <label for="nome">Nome do Objeto:</label>
        <input type="nome" class="form-control" id="nome" placeholder="Nome do objeto">
      </div>
      <div class="form-group">
        <label for="local">Local da instituição:</label>
        <input type="local" class="form-control" id="local" placeholder="Local">
      </div>
      <div class="form-group">
    	<label for="email">Descrição:</label>
    	<textarea class="form-control" style="resize:none" id="descricao" maxlength="300" rows="9" placeholder="Descrição"></textarea>
  	</div>
      <div class="form-group">
        <label for="categoria">Categoria:</label>
        <div class="btn-group">
          <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Selecione <span class="caret"></span>
          </button>
          <ul id="categoria" class="dropdown-menu">
            <li><a href="#">Material Escolar</a></li>
            <li><a href="#">Documento</a></li>
            <li><a href="#">Roupa</a></li>
          </ul>
        </div>
      </div>
      <div class="form-group">
        <label for="imagem">Imagem:</label>
        <input id="imagem" type="file" class="file">
      </div>
	  <div class="text-center"><button type="submit" class="btn btn-default">Cadastrar</button></div>
	</form>
    </form>
  </div>


  <footer class="footer navbar-inverse">
    <div class="container">
      <div class="row">
        <div class="col-md-4">
          <p class="text-muted h1">Snooder</p>
          <p class="text-muted">teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto</p>
        </div>

        <div class="col-md-4">
          <p class="text-muted h3" style="padding: 6px 0px">Contato</p>
          <p class="text-muted">222222222222222 teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto teste de texto</p>
        </div>

        <div class="col-md-4">
          <p class="text-muted h3" style="padding: 6px 0px">Facebook</p>
          <p class="text-muted">Link do FB</p>

          <p class="text-muted h3" style="padding: 6px 0px">Twitter</p>
          <p class="text-muted">Link do Twitter</p>
        </div>
      </div>
    </div>
  </footer>


  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>-->
  <!-- Include all compiled plugins (below), or include individual files as needed -->

  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>
</html>
