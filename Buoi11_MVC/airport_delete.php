<?php 
	require "init.php";
	include "models/Airport.php";

$code = isset($_GET["code"])?$_GET["code"]:"";

$m = new Airport();

$isOK = $m->delete($code);
  
if ($isOK){
	header("location: airport.php");	
}else{

		$view = "airport_delete.phtml";

		require "views/layout.phtml";	
}

