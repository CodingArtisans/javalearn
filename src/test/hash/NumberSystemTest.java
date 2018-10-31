package test.hash; 

import hash.NumberSystem;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* NumberSystem Tester. 
* 
* @author <Authors name> 
* @since <pre>¾ÅÔÂ 18, 2018</pre> 
* @version 1.0 
*/ 
public class NumberSystemTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: Binary2Int(String binary) 
* 
*/ 
@Test
public void testBinary2Int() throws Exception { 
//TODO: Test goes here...
    String binary = "11000110011000010110100011101000";
    binary = "-1000110011000010110100011101000";
    NumberSystem ns = new NumberSystem();
    int number = ns.Binary2Int(binary);
    System.out.print(number);
} 

@Test
public void testInt2Binary()
{
    int  number = -1;
    NumberSystem ns = new NumberSystem();
    String binary = ns.Int2Binary(number);
    System.out.print(binary);
}

} 
