package edu.ufp.inf.lp2.intro;

public class Person {

  private String idNumber;
  private String name;
  private String address;
  private Date birthDate;

    public Person(String idNumber, String name, String address, Date birthDate) {
        this.idNumber = idNumber;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }

  public int age() {
    Date today = new Date();
    int idade = today.getYear() - this.birthDate.getYear();
    if(today.getMonth() < this.birthDate.getMonth()){
        return idade-1;
    }else if(today.getMonth() == this.birthDate.getMonth()){
        if(today.getDay() < this.birthDate.getDay()){
            return idade-1;
        }
    }
    return idade;
  }

  public boolean olderThan(Person p) {
    if(this.age() > p.age()){
        return true;
    }
    return false;
  }

    /**
     * @return the idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}