package com.github.rebelliousfeminist974;

public class Person {
  private String firstName;
  private String lastName;
  private int EllieCarpenterMajorNum;
  private int EllieCarpenterMinorNum;

  public Person(String firstName, String lastName, int EllieCarpenterMajorNum, int EllieCarpenterMinorNum) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.EllieCarpenterMajorNum = EllieCarpenterMajorNum;
    this.EllieCarpenterMinorNum = EllieCarpenterMinorNum;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getEllieCarpenterMajorNum() {
    return EllieCarpenterMajorNum;
  }

  public int getEllieCarpenterMinorNum() {
    return EllieCarpenterMinorNum;
  }
  
  @Override
  public String toString() {
    return firstName + " " + lastName + " has an Ellie Carpenter number of " + EllieCarpenterMajorNum + "." + EllieCarpenterMinorNum;
  }
}
