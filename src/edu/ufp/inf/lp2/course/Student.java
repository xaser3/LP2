package edu.ufp.inf.lp2.course;

import edu.ufp.inf.lp2.intro.Date;
import edu.ufp.inf.lp2.intro.Person;
import java.util.ArrayList;

public class Student extends Person {

  private int number;
  private Date registration;
  private String email;
  private String password;
  private CourseClass course;
  private ArrayList <Grade> grades = new ArrayList<>();

    public Student(String idNumber, String name, String address, Date birthDate) {
        super(idNumber, name, address, birthDate);
    }

    public Student(int number, Date registration, String email, String password, String idNumber, String name, String address, Date birthDate) {
        super(idNumber, name, address, birthDate);
        this.number = number;
        this.registration = registration;
        this.email = email;
        this.password = password;
    }
  
  public void addGrade(Grade g) {
      this.grades.add(g);
      g.associateStudent(this);
  }

  public Grade removeGrade(float g, String nd, Date d) {
  return null;
  }

  public Grade changeGrade(float ng, float g, String nd, Date d) {
  return null;
  }

  public Grade searchGrade(float g, String nd, Date d) {
  return null;
  }

  public float averageGrades() {
      float sum = 0.0f;
      for(Grade g:this.grades){
          sum+=g.getGrade();
      }
      return sum/this.grades.size();
  }

  public Grade maxGrade() {
  return null;
  }

  public Grade minGrade() {
  return null;
  }

  public void registerInCourseClass(CourseClass cc) {
  }

  public CourseClass unregisterFromCourseClass() {
  return null;
  }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the registration
     */
    public Date getRegistration() {
        return registration;
    }

    /**
     * @param registration the registration to set
     */
    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the course
     */
    public CourseClass getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(CourseClass course) {
        this.course = course;
    }

}