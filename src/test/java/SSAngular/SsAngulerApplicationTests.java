package SSAngular;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SsAngulerApplication.class)
@WebAppConfiguration
public class SsAngulerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testHome() {
		SsAngulerApplication testInstance = new SsAngulerApplication();
		Map<String, Object> result = testInstance.home();
		assertNotNull(result);
		assertTrue(result.size() == 2);
		String idString = (String) result.get("id");
		assertNotNull(idString);
		assertTrue(idString.matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[34][0-9a-fA-F]{3}-[89ab][0-9a-fA-F]{3}-[0-9a-fA-F]{12}$"));
		String contentString = (String) result.get("content");
		assertEquals("Hello World", contentString);
	}
}
