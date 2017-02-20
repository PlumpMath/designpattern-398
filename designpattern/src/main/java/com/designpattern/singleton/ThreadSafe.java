package com.designpattern.singleton;

public class ThreadSafe {


	   /* private static ThreadSafe instance;
	    
	    private ThreadSafe(){}
	    
	    public static synchronized ThreadSafe getInstance(){
	        if(instance == null){
	            instance = new ThreadSafe();
	        }
	        return instance;
	    }
	    */
	   
	
	//Double Checked Locking
 private static  ThreadSafe instance;
	    
	    private ThreadSafe(){}
	    
	    public static ThreadSafe getInstance(){
	    	if(null==instance){
	    		synchronized (ThreadSafe.class) {
	              if(null == instance){
	               instance = new ThreadSafe();
	              }
	    		}
	    	}
			return instance;
	    }
	    
	    }    
	    
	

