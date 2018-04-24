<?php

require "init.php";
include "Application.php";



$app = new Application($config);
$app->run();
