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
public class Point {
    private float x;
    private float y;

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    
    public Point(){
        this.x=0.0f;
        this.y=0.0f;
    }
    
    public double distX(Point p) {
        return this.x-p.x;
    }

    public double distY(Point p) {
        return this.y-p.y;
    }
    
    public double dist(Point p){
        return Math.sqrt(this.distX(p)*(this.distX(p))+(this.distY(p)*this.distY(p)));
    }
    
    public void moveX(float delta){
        this.x = this.x+delta;
    }
    
    public void moveY(float delta){
        this.y = this.y+delta;
    }
    
    public void move(float dx, float dy){
        this.x = this.x + dx;
        this.y = this.y + dx;
    }
    
    public boolean xBetweenPoints(Point leftPt, Point rightPt){
        return (x>leftPt.getX() && x<rightPt.getX());
    }
    
    public boolean yBetweenPoints(Point upperPt, Point lowerPt){
        return (y<upperPt.getY() && y>lowerPt.getY());
    }
    
    @Override
    public String toString(){
        return "Point{" + this.x + "," + this.y + "}";
    }
    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }
    
    
}
