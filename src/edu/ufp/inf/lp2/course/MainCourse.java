/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.course;

import edu.ufp.inf.lp2.intro.Date;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class MainCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Discipline d1 = new Discipline("LP2",7,2,2);
        Grade g1 = new Grade(11.2f,new Date());
        Grade g2 = new Grade(12.3f,new Date());
        Grade g3 = new Grade(15.7f,new Date());
        d1.associateGrade(g1);
        d1.associateGrade(g2);
        d1.associateGrade(g3);
        ArrayList <Grade> result;
        result = d1.getRangeGrades(11, 14);
        for(Grade g:result){
            System.out.println(g.getGrade());
        }
        
        Student s = new Student(1,new Date(),"email","password","1","João","Rua X",new Date(1,1,1990));
        s.addGrade(g1);
        s.addGrade(g2);
        s.addGrade(g3);
        System.out.println(s.averageGrades());
        
        
    }
    
}
