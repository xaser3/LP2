/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.figgeo;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author miguel
 */
class BagFigGeo {
    
    private ArrayList<FigGeoDrawI> figs = new ArrayList<>();
    
    public BagFigGeo(){
        
    }
    
    public void add(FigGeoDrawI f){
        this.figs.add(f);
    }
    
    public void draw(Graphics g){
        for(FigGeoDrawI d : figs){
            d.draw(g);
        }
    }
}
