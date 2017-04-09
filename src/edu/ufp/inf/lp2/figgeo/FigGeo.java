package edu.ufp.inf.lp2.figgeo;

import java.awt.Color;
import java.util.Vector;

public abstract class FigGeo implements FigGeoDimsI, FigGeoRelsI, FigGeoDrawI {

    private Color color;
    private final Vector<Point> points = new Vector<Point>();

    public FigGeo(Color c) {
        color = c;
    }

  public void addPoint(Point p) {
      this.points.addElement(p);
  }

  public Point getPoint(int index) {
      return(index<this.points.size()?this.points.elementAt(index):null);
  }

    public Color getColor() {
        return color;
    }

    public void setColor(Color c) {
        this.color = color;
    }

}