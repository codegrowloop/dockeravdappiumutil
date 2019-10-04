package com.codegrowloop.dockerplay;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception
    {      
    	DockerAVDManager dockerAVDManager = new DockerAVDManager();
    	dockerAVDManager.startContainer("alexmcinteer","4723");
    	//dockerAVDManager.stopContainer("alexmcinteer");
    }  
}