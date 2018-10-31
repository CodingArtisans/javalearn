package test.propertities; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import propertities.PerpropertityLoader;

/** 
* PerpropertityLoader Tester. 
* 
* @author <Authors name> 
* @since <pre>¾ÅÔÂ 20, 2018</pre> 
* @version 1.0 
*/ 
public class PerpropertityLoaderTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getPropertity(String key) 
* 
*/ 
@Test
public void testGetPropertity() throws Exception { 
//TODO: Test goes here...
    PerpropertityLoader loader = new PerpropertityLoader();
    String name =  loader.getPropertity("name");
    Assert.assertEquals("houyingshi", name);
} 


} 
