import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	   private Triangle t;
	   
		@Before
		public void setup() {
			t = new Triangle();
		}
		
		@Test
		public void test() {
			assertEquals(t.Tritype(0, 0, 0), 3);
		}

}
