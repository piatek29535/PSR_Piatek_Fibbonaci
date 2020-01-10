/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apiatek_fibbonaci_client;

/**
 *
 * @author Adamso
 */
public class APiatek_Fibbonaci_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println(fibbonaci(6));
    }

    private static float fibbonaci(int argument) {
        org.apiatek.fibbonaci.Fibbonaci_Service service = new org.apiatek.fibbonaci.Fibbonaci_Service();
        org.apiatek.fibbonaci.Fibbonaci port = service.getFibbonaciPort();
        return port.fibbonaci(argument);
    }
    
}
