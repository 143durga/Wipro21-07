package com.wipro.hibernate;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wipro.hibernate.entity.Pan1;
import com.wipro.hibernate.repo.PanRepo;
import com.wipro.hibernate.util.*;
 

/**
 * Hello world!
 *
 */
public class App1{
    public static void main( String[] args )
    {
    	
    	
    	int choice=0;
    	do {
    	System.out.println("--Menu---");
    	System.out.println("1.--Create PAN---");
    	System.out.println("2.--Find by Id PAN---");
    	System.out.println("3.--Update PAN---");
    	System.out.println("4.--Delete by  id---");
    	System.out.println("5.--Find All PAN---");
    	System.out.println("6.--Exit---");
    	Scanner sc= new Scanner(System.in);    	
    	  choice= sc.nextInt();
    	  
    	
	    	switch(choice)
	    	{
	    		case 1:
	    			PanRepo.createPan();
	    		break;
	    		case 2:
	    		    System.out.print("Enter PAN id: ");
	    		    int id = sc.nextInt();
	    		    Pan1 pan = PanRepo.findById(id);
	    		    System.out.println(pan);
	    		    break; 
	    		case 3:
	    			PanRepo.updatePan();
	    			break;
	    			
	    		case 4:
	    			 
	    			System.out.println("Please enter PAN id:");
	    			int id1= sc.nextInt();
	    			PanRepo.deleteById(id1);
	    			break;
	    			
	    		case 5:
	    			List<Pan1> list=PanRepo.findAll();
	    			System.out.println(list);
	    			break;
	    		case 6:
	    			return;
	    		
	    		default:
	    			System.out.println("Invalid option please try again");
	    			break;
	    	
	    	 }
    
        	 
    	}while(choice!=9);
    }
    
}
