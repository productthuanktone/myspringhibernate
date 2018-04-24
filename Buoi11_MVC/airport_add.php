<?php 


		require "init.php";
		include "models/Airport.php";

		$mAiport = new Airport();
		$countries = $mAiport->getAllCountry();

		$country = "";

		// GET -> Show form
		// POST --> Lưu dữ liệu
		$error = "";
		$isPost = $_SERVER["REQUEST_METHOD"] == "POST";
		
		if ($isPost){ 
			 
			$data = $_POST;
			
			$mAiport->load($data);
			
			if (! $mAiport->save()){
				$error = "Lỗi: Không thể lưu."	;
			}else{
				header("location: airport.php");
			}

		}

		$view = "airport_add.phtml";

		require "views/layout.phtml";	
		 


		