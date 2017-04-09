/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.intro;

/**
 *
 * @author miguel
 */
public class MainIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date(1,12,2015,20,15);
        Date d2 = new Date(31,12,2017,14,17);
        //System.out.println(d1.differenceMonths(d2));
        System.out.println(d1.toString());
        Date today = new Date();
        System.out.println(today.toString());
        System.out.println(d1.compareTo(d2));
    /*    
        Date birth = new Date(1,5,1985);
        Date birth2 = new Date(9,3,1980);
        Person p1 = new Person("1","Miguel","Rua X",birth);
        Person p2 = new Person("2","José","Rua direita",birth2);
        //Person p1 = new Person("1","Miguel","Rua X",new Date(1,5,1985));
        System.out.println(p1.age());
        
        System.out.println(d1.beforeDate(d2));
        System.out.println(p1.olderThan(p2));
        
        System.out.println(Date.isLeapYear(2016));
        System.out.println(Date.daysMonth(2, 2016));
        
        d1.incrementDate();
        System.out.println(d1.toString());
        d2.incrementDate();
        System.out.println(d2.toString());
    */
    }
    
}
