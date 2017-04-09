package edu.ufp.inf.lp2.course;

import java.util.ArrayList;

public class Discipline {

  private String name;
  private int ects;
  private int courseSemester;
  private int courseYear;
  public ArrayList <Grade> grades = new ArrayList<>();

    public Discipline(String name, int ects, int courseSemester, int courseYear) {
        this.name = name;
        this.ects = ects;
        this.courseSemester = courseSemester;
        this.courseYear = courseYear;
    }
  
  public void associateGrade(Grade g) {
      this.grades.add(g);
      g.associateDiscipline(this);
  }

  public ArrayList<Grade> getRangeGrades(float min, float max) {
      ArrayList <Grade> resultGrades = new ArrayList<>();
      for(Grade g:this.grades){
          if(g.getGrade()>=min && g.getGrade()<=max){
              resultGrades.add(g);
          }
      }
      return resultGrades;
  }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ects
     */
    public int getEcts() {
        return ects;
    }

    /**
     * @param ects the ects to set
     */
    public void setEcts(int ects) {
        this.ects = ects;
    }

    /**
     * @return the courseSemester
     */
    public int getCourseSemester() {
        return courseSemester;
    }

    /**
     * @param courseSemester the courseSemester to set
     */
    public void setCourseSemester(int courseSemester) {
        this.courseSemester = courseSemester;
    }

    /**
     * @return the courseYear
     */
    public int getCourseYear() {
        return courseYear;
    }

    /**
     * @param courseYear the courseYear to set
     */
    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

}