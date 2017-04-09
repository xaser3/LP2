/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.tp;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author migue
 */
public class MainTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exercises e1 = new exercises();
        
        float arrayFloats[] = new float [10];
        Vector v1 = new Vector(), v2 = new Vector();
        
        for(int i=1;i<arrayFloats.length;i++){
            arrayFloats[i-1] = i;
            v1.add((float)i);
        }
        
        char[] ar = new char[10];
        exercises[] ar2 = new exercises[10];
        ArrayList<exercises> ex = new ArrayList<>();
        String[] arstr = new String[10];
        int matrix[][] = new int[5][];
        String mstr[][] = new String[6][];
        Vector vec = new Vector();
        String str = new String("Hello world");
        //vec.addElement(str);
        int a = 342342;
        vec.addElement(a);
        System.out.println(vec.get(0));
        
        
        /*
        for(int i=0;i<arrayFloats.length;i++){
            //System.out.println(arrayFloats[i]);
            //System.out.println(v1.elementAt(i));
        }
        */
        /*
        //Redimensionar array
        arrayFloats = e1.redimArray(arrayFloats,5);
        for(int i=0;i<arrayFloats.length;i++){
            System.out.println(arrayFloats[i]);
        }
        */
        
        e1.vecFactorial(v1, v2);
    }
    
}
