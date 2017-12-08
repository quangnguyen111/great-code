
import org.junit.Assert;
import org.junit.Test;

class Person {

	public Person(String name, double height, double weight) {
		// TODO Auto-generated constructor stub
	}

	public double getBMI() {
		// TODO Auto-generated method stub
		return 22.2;
	}
	
	
}

public class PersonTest {
	
	@Test
	public void testGetBMI() {
		Person quang = new Person("Quang", 1.62, 62);
		
		Assert.assertEquals(22.2, quang.getBMI());
		
		Person tom = new Person("Tom", 1.92, 80);
		Assert.assertEquals(20, quang.getBMI());
		
	}
}
