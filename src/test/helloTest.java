package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 


/** 
* hello Tester. 
* 
* @author <Authors name> 
* @since <pre>¾ÅÔÂ 17, 2018</pre> 
* @version 1.0 
*/ 
public class helloTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: hash(String routing) 
* 
*/ 
@Test
public void testHash() throws Exception { 
//TODO: Test goes here...
    hash.hello   h = new  hash.hello();
    int hashCode =  h.hash("houyingshi");
    System.out.print(hashCode);
} 


/** 
* 
* Method: murmurhash3_x86_32(byte[] data, int offset, int len, int seed) 
* 
*/ 
@Test
public void testMurmurhash3_x86_32() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = hello.getClass().getMethod("murmurhash3_x86_32", byte[].class, int.class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
