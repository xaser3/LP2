/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.figgeo;

/**
 *
 * @author migue
 */
public class Triangle {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public float perimeter(){
        return (float) (p1.dist(p2) + p2.dist(p3) + p3.dist(p1));
    }
    
    public float area(){
        return (float) ((p1.dist(p2)*p1.dist(p3))/2);
    }
    
    public boolean pointInside(Point p){
        //to do
        return false;
    }
    /**
     * @return the p1
     */
    public Point getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * @return the p2
     */
    public Point getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * @return the p3
     */
    public Point getP3() {
        return p3;
    }

    /**
     * @param p3 the p3 to set
     */
    public void setP3(Point p3) {
        this.p3 = p3;
    }
    
    
}
