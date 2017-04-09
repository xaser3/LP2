package edu.ufp.inf.lp2.course;

import java.util.ArrayList;
import java.util.Vector;

public class CourseClass {

  public String name;

    /**
   * 
   * @element-type Student
   */
  public Vector  students;
    /**
   * 
   * @element-type Discipline
   */
  public Vector  disciplines;

  public ArrayList<Student> searchStudent(String name) {
  return null;
  }

  public Student searchStudent(int number) {
  return null;
  }

  public void registerStudent(Student s) {
  }

  public Student unregisterStudent(String name) {
  return null;
  }

  public void associateDiscipline(Discipline d) {
  }

  public void desassociateDiscipline(String dname) {
  }

  public void launchGrade(String disciplineName, int studentNumber, float grade) {
  }

  public void associateGrade2Discipline(String disciplineName, long studentNumber, float grade) {
  }

}