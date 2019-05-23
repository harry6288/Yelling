import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YellingTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//r1
	@Test
	public void testOnePersonYelling() {
		Yelling r = new Yelling();
		String result = r.scream("Peter");
		assertEquals("Peter is yelling",result);
	}
	@Test
	public void testNoOneYelling() {
		Yelling r = new Yelling();
		String result = r.scream("");
		assertEquals("Nobody is yelling",result);
	}
	@Test
	public void testUpeerCaseYelling() {
		Yelling r = new Yelling();
		String result = r.scream("PETER");
		assertEquals("PETER IS YELLING",result);


}
	@Test
	public void twoPeopleYelling() {
		Yelling r = new Yelling();
		String result = r.scream("Peter, Kadeem");
		System.out.println(result);
		assertEquals("Peter and Kadeem are yelling.",result);


}
}