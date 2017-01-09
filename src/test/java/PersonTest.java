
import org.junit.Assert;
import org.junit.Test;

class Person {

	private String name;
	private double height;
	private double weight;
	
	public Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public double getBMI() {
		return this.weight/(this.height*this.height);
	}

	public String getBodyStatus() {
		if(this.getBMI() < 18.5) {
			return "Underweight";
		} else if(this.getBMI() < 24.9) {
			return "Normal";
		} else if(this.getBMI() < 30) {
			return "Overweight";
		}
		return "Obese";
	}
	
}



public class PersonTest {
	Person quang = new Person("Quang", 1.7, 50.0);
	Person yoko = new Person("Yoko", 1.97, 80.0);
	Person tokyo = new Person("Tokyo", 1.62, 70);
	Person osaka = new Person("Osaka", 1.5, 70);

	@Test
	public void testGetBMI() {
		
		Assert.assertEquals(17.3, quang.getBMI(), 0.1);
		Assert.assertEquals(20.6, yoko.getBMI(), 0.1);
	}
	
	
	@Test
	public void testGetBodyStatus() {
		Assert.assertEquals("Underweight", quang.getBodyStatus());
		Assert.assertEquals("Normal", yoko.getBodyStatus());
		Assert.assertEquals("Overweight", tokyo.getBodyStatus());
		Assert.assertEquals("Obese", osaka.getBodyStatus());
	}
	
	

}
