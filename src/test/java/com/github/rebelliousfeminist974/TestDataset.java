package com.github.rebelliousfeminist974;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class TestDataset {
  private ArrayList<Person> testDataset;
  
  void createDataset() {
    testDataset = new ArrayList<Person>();
  }
  
  void addToDataset() {
    testDataset = new ArrayList<Person>();
    Person person1 = new Person("Ellie", "Carpenter", 0, 0);
    testDataset.add(person1);
    assertEquals(testDataset.size(), 1);
  }
  
  void getFirstName() {
    testDataset = new ArrayList<Person>();
    Person person1 = new Person("Ellie", "Carpenter", 0, 0);
    testDataset.add(person1);
    assertEquals(testDataset.get(0).getFirstName(), "Ellie");
  }
  
  void getLastName() {
    testDataset = new ArrayList<Person>();
    Person person1 = new Person("Ellie", "Carpenter", 0, 0);
    testDataset.add(person1);
    assertEquals(testDataset.get(0).getLastName(), "Carpenter");
  }
  
  void getEllieCarpenterMajorNum() {
    testDataset = new ArrayList<Person>();
    Person person1 = new Person("Ellie", "Carpenter", 0, 0);
    testDataset.add(person1);
    assertEquals(testDataset.get(0).getEllieCarpenterMajorNum(), 0);
  }
  
  void getEllieCarpenterMinorNum() {
    testDataset = new ArrayList<Person>();
    Person person1 = new Person("Ellie", "Carpenter", 0, 0);
    testDataset.add(person1);
    assertEquals(testDataset.get(0).getEllieCarpenterMinorNum(), 0);
  }
  
  @Test
  void outputPersonAsString() {
    testDataset = new ArrayList<Person>();
    Person person1 = new Person("Ellie", "Carpenter", 0, 0);
    testDataset.add(person1);
    assertEquals(testDataset.get(0).toString(), "Ellie Carpenter has an Ellie Carpenter number of 0.0");
  }
}
