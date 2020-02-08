package sample;

import static org.junit.Assert.*;
import org.junit.Test;

public class HomeTest {
	Home x=new Home();
	@Test
	public void testAppTest()
	{
	assertEquals(10,x.sum(5,5));
	}

}
