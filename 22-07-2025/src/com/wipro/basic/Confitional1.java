package com.wipro.basic;

public class Confitional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      float number=-0.5f;
      if(number==0) {
    	  System.out.println("Zero");
      }
      else if(number>0) {
    	  System.out.println("positive");
      }
      else {
    	  if(Math.abs(number)<1) {
    		  System.out.println("positive and small");
    	  }
    	  else if(Math.abs(number)>1000000) {
    		  System.out.println("negative and Large");
    	  }
    	  else {
    		  System.out.println("negative");
    	  }
      }
    	  
      }

}
