package edu.wctc.firstprogram.test;

import org.junit.*;
import edu.wctc.firstprogram.Cat;

import static junit.framework.TestCase.assertEquals;


public class CatTest {

@Test
    public void testMousesKilled() {

    Cat a = new Cat(5,"HellCat");

    assertEquals("Number of mice killed should be greater than zero.", 5, ((Cat) a).getMousesKilled());
}


}
