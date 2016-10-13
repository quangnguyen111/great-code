
import org.junit.Assert;
import org.junit.Test;


public class PersonTest {

	@Test
	public void testGetBMI() {
		Person nam = new Person("Nam", 1.62, 62);
		Person trinh = new Person("Ngoc Trinh", 1.7, 49);

		Assert.assertEquals(nam.getBMI(), 20, 0.1);
		Assert.assertEquals(trinh.getBMI(), 16.9, 0.1);


	}

}
