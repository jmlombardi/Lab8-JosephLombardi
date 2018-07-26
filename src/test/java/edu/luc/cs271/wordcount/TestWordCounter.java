package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  WordCounter fixture;
  @Before
  public void setUp() {
    // TODO create the SUT instance
    Map<String, Integer> testMap = new HashMap<>();
    fixture = new WordCounter(testMap);
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertTrue(fixture.getCounts().isEmpty());
  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    List<String> list = new ArrayList<>();
    list.add("Data");
    list.add("Data");
    list.add("Are");
    list.add("Fun");

    Iterator<String> iterator = list.iterator();

    fixture.countWords(iterator);
    Integer DataCount = 2;

    //assertEquals(fixture.getCount("Data"), DataCount);
    //assertEquals(fixture.getCount("Data"), 2);
    //assertEquals(fixture.getCount("Are"), 1);
    //assertEquals(fixture.getCount("Fun"), 1);
    assertEquals(fixture.getCount("eggs"), -1);
    assertEquals(fixture.getCount("bacon"), -1);
  }
}
