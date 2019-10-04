package com.codegrowloop.dockerplay;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DockerAVDManager
{
	private final String containerName="85bd49af84a1";

	public DockerAVDManager()
	{
		
	}
	
	public void startContainer(String handle,String port) throws Exception
	{
		System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        String[] command = { System.getProperty("user.dir")+"/myscript.sh",handle,port};         
        Process process = ( new ProcessBuilder(command) ).start();                    
        BufferedReader stdInput = new BufferedReader(new 
        	     InputStreamReader(process.getInputStream()));

    	BufferedReader stdError = new BufferedReader(new 
    	     InputStreamReader(process.getErrorStream()));

    	// Read the output from the command
    	System.out.println("Here is the standard output of the command:\n");
    	String s = null;
    	while ((s = stdInput.readLine()) != null) {
    	    System.out.println(s);
    	}

    	// Read any errors from the attempted command
    	System.out.println("Here is the standard error of the command (if any):\n");
    	while ((s = stdError.readLine()) != null) {
    	    System.out.println(s);
    	}
        System.out.println("finished");
	}
	
	public void stopContainer(String handle) throws Exception
	{
		System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        String[] command = { System.getProperty("user.dir")+"/stopcontainer.sh",handle};         
        Process process = ( new ProcessBuilder(command) ).start();                    
        BufferedReader stdInput = new BufferedReader(new 
        	     InputStreamReader(process.getInputStream()));

    	BufferedReader stdError = new BufferedReader(new 
    	     InputStreamReader(process.getErrorStream()));

    	// Read the output from the command
    	System.out.println("Here is the standard output of the command:\n");
    	String s = null;
    	while ((s = stdInput.readLine()) != null) {
    	    System.out.println(s);
    	}

    	// Read any errors from the attempted command
    	System.out.println("Here is the standard error of the command (if any):\n");
    	while ((s = stdError.readLine()) != null) {
    	    System.out.println(s);
    	}
        System.out.println("finished");
	}
}