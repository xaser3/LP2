/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.tp;

import java.util.Vector;

/**
 *
 * @author miguel
 */
public class exercises {
    
    public float[] redimArray(float[] arrayOri, int tam){
        float newArray[];
        newArray = new float[tam];       
        if(arrayOri.length<=tam){
            System.arraycopy(arrayOri, 0, newArray, 0, arrayOri.length);
        }else{
            System.arraycopy(arrayOri, 0, newArray, 0, tam);
        }
        return newArray;
    }
    
    public void vecFactorial(Vector vec1, Vector vec2){
        for(int i=0;i<vec1.size();i++){
            vec2.add(i, factorial((float)vec1.elementAt(i)));
            System.out.println(vec2.elementAt(i));
        }
        
    }
    
    public float factorial(float num){
        float fact = 1;
        for(int i=2;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
}
