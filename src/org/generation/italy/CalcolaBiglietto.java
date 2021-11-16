/**
 * 
 */
package org.generation.italy;
import java.util.Scanner;

/**
 * @author mfabr
 *
 */
public class CalcolaBiglietto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sconto=100;
		double km;
		int eta;
		double tot;
		double costo=0.21;
		
		Scanner cIn = new Scanner(System.in);
		System.out.println("inserire numero km");
		km=cIn.nextDouble();
		System.out.println("inserire età");
		eta=cIn.nextInt();
		
		
		if(eta>=65) {
			sconto=40;
			System.out.println("hai diritto al 40% di socnto");
		}
		else if(eta<18) {
			sconto=20;
			System.out.println("hai diritto al 20% di sconto");
		}
		else
			System.out.println("non hai diritto a sconti");
		
		tot=km*costo;
		tot=(tot/100)*sconto;
		
		if(sconto!=100)
		System.out.println("costo totale: "+tot+"$  con uno sconto del: "+sconto+"%");
		else System.out.println("costo totale: "+tot+"$");
	}

}
