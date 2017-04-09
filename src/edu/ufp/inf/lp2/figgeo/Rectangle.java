package edu.ufp.inf.lp2.figgeo;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends FigGeo {

    public Rectangle(Point lup, Point rdp, Color c) {
        super.addPoint(lup);
        super.addPoint(rdp);
        super.setColor(c);
        
    }

    @Override
    public double area() {
        Point lup = this.getPoint(0);
        Point rdp = this.getPoint(1);
        return Math.abs(lup.distX(rdp)*lup.distY(rdp));
    }

    @Override
    public double perimeter() {
        Point lup = this.getPoint(0);
        Point rdp = this.getPoint(1);
        return (2*Math.abs(lup.distX(rdp)) + 2*Math.abs(lup.distY(rdp)));
    }

    @Override
    public boolean isInside(FigGeo f) {
        if(f instanceof Rectangle){
            Point lup = this.getPoint(0);
            Point rdp = this.getPoint(1);
            Point flup = f.getPoint(0);
            Point frdp = f.getPoint(1);
            if(flup.xBetweenPoints(lup, rdp) && flup.yBetweenPoints(lup, rdp) && frdp.xBetweenPoints(lup, rdp) && frdp.yBetweenPoints(lup, rdp)){
                return true;
            }
        }
        return false;
        
    }

    @Override
    public boolean isInterceptedBy(FigGeo f) {
        if(f instanceof Rectangle){
            Point lup = this.getPoint(0);
            Point rdp = this.getPoint(1);
            Point flup = f.getPoint(0);
            Point frdp = f.getPoint(1);
            //criar 2 pontos restantes e adicionar ao if
            if(flup.xBetweenPoints(lup, rdp) && flup.yBetweenPoints(lup, rdp) || frdp.xBetweenPoints(lup, rdp) && frdp.yBetweenPoints(lup, rdp)){
                return true;
            }
        }
        return false;
    }
    
    public void draw(Graphics g){
        Point lup = this.getPoint(0);
        Point rdp = this.getPoint(1);
        int x = (int) (lup.getX());
        int y = (int) (lup.getY());
        int w = (int) Math.abs(lup.distX(rdp));
        int h = (int) Math.abs(lup.distY(rdp));
        g.setColor(this.getColor());
        g.fillRect(x, y, w, h);
    }
    
}