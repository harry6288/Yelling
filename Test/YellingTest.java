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

	@Test
	public void testOnePersonYelling() {
		Yelling r = new Yelling();
		String result = r.scream("Peter");
		assertEquals("Peter is yelling",result);
	}

}
