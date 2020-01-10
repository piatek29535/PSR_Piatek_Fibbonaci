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
    public float fibbonaci(@WebParam(name = "argument") int argument) {
        
        int result = 0;
        
        if(argument == 0){
            result = 0;
        }else if(argument == 1){
            result = 1;
        }else {
            result = (int) (fibbonaci(argument-1) + fibbonaci(argument-2));
        }
        
        return (float)result;
    }
}
