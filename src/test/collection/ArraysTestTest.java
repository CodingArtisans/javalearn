package test.collection; 

import collection.ArraysTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ArraysTest Tester. 
* 
* @author houyingshi@163.com
* @since <pre>Ê®ÔÂ 31, 2018</pre> 
* @version 1.0 
*/ 
public class ArraysTestTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: asList(String... items) 
* 
*/ 
@Test
public void testAsList() throws Exception {
    ArraysTest test = new ArraysTest();
    var list = test.asList("h", "help");
    Assert.assertEquals(2, list.size());
    Assert.assertArrayEquals(new String[]{"h", "help"}, list.toArray());
} 


} 
