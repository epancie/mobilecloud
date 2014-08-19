/**
 * 
 */
/**
 * @author pancho
 *
 */
package org.pancho.loger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Loger {
	
	private String phrase;
	
	public Loger(){
		
	}
	
	public Loger(String log){
		this.phrase = log;
	}
	
	public void setLoger(String log){
		this.phrase = log;
	}
		
	public void output(String log) {
		setLoger(log);
	    try {
	         Logger.getLogger(getClass().getName()).log(
	            Level.INFO, "LOG ->" + this.phrase);
	       } catch (Exception err) {
	         Logger.getLogger(getClass().getName()).log(
	            Level.SEVERE, "Mensaje crítico...en " + this.phrase, err);
	       }
	}
}