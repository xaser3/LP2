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
public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public float perimeter(){
        return (float) (2 * Math.PI * radius);
    }
    
    public float area(){
        return (float) (Math.PI * Math.pow(radius, 2));
    }
    
    public boolean pointInside(Point p){
        if(center.dist(p)<radius){
            return true;
        }
        return false;
    }
    
    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
}
