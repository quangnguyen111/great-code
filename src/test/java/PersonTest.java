
import org.junit.Assert;
import org.junit.Test;

 class Person {
	private double height;
	private double weight;
	
	public Person() {
	}
	
	public Person(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public double getBMI() {
		return this.weight / (this.height * this.height);
	}

}

public class PersonTest {
	@Test
	public void testGetBMI() {
		Person sut = new Person(1.8, 72.0);
		Assert.assertEquals(22.22, sut.getBMI(), 0.1);
		
		Person quang = new Person(1.62, 62.0);
		Assert.assertEquals(23.62, quang.getBMI(), 0.01);
	}
}
