/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.figgeo;

import java.awt.Color;

/**
 *
 * @author migue
 */
public class MainFiggeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new Point(1,3), new Point(3,1),Color.white);
        System.out.println(r1.getPoint(0));
        System.out.println(r1.perimeter());
        System.out.println(r1.area());
        
        Rectangle r2 = new Rectangle(new Point(1.5f,2), new Point(2,1.5f),Color.white);
        System.out.println(r1.isInside(r2));
        
        Rectangle r3 = new Rectangle(new Point(2.5f,1.5f), new Point(4,0.5f),Color.white);
        System.out.println(r1.isInterceptedBy(r3));
        
    }
    
}
