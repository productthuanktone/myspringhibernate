<?php
/**
 * Created by PhpStorm.
 * User: dangvo
 * Date: 4/20/2018
 * Time: 11:04 AM
 */

include_once "Bootstrap.php";
include_once "Controller.php";

class Application extends Bootstrap
{

    public $config;

    public function __construct($config = null)
    {
        if (! isset($config['router']) ){
            throw new \Exception("Invalid config file.");

        }

       parent::__construct($config);
       $this->config = $config;

       $this->init();
    }

    private function init()
    {
        $this->resolveURL();
    }

    public function getControllerPath(){
        return $this->config['controllerPath'];
    }

    public function run()
    {
        $controller_file = $this->getControllerPath() . DIRECTORY_SEPARATOR . $this->controller . ".php";

        if (! file_exists($controller_file)){
            header("location: /error.html");
            exit;
        }

        include_once  $controller_file;

        $controllerClass = $this->controller;
        $controllerObject = new $controllerClass($this->controllerName, $this->actionName);
        $page  =  $controllerObject->runAction($this->action);
        echo $page;

    }


}