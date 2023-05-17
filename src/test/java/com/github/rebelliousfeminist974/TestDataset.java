package com.github.rebelliousfeminist974;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class TestDataset {
  private ArrayList<Person> testDataset;
  
  @Test
  void createDataset() {
    testDataset = new ArrayList<Person>();
  }
}
