/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.apiatek.fibbonaci;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Adamso
 */
@WebService(serviceName = "Fibbonaci")
@Stateless()
public class Fibbonaci {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fibbonaci")
    public String fibbonaci(@WebParam(name = "argument") int argument) {
        
        StringBuilder result = new StringBuilder();
        
        int a = 0;
        int b = 1;
        int sum = 0;
        
        result.append(a+", "+b);
        for (int i = 0; i < argument-2; i++) {
            sum = b + a;
            a = b;
            b = sum;
            result.append(", "+sum);
        }
                
        return result.toString();
    }
}
