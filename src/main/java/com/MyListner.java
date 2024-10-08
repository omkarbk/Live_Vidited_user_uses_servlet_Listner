package com;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListner
 *
 */
public class MyListner implements HttpSessionListener {
	int count=0;

    /**
     * Default constructor. 
     */
    public MyListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	
         // TODO Auto-generated method stub
    	count++;
    	HttpSession hs=se.getSession();
    	hs.setAttribute("user", count);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	count--;
    	HttpSession hs=se.getSession();
    	hs.setAttribute("user", count);
    	
    }
	
}
