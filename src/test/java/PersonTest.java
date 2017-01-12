
import org.junit.Assert;
import org.junit.Test;

 class Person {
	private double height;
	public void setHeight(double height) {
		this.height = height;
	}

}


public class PersonTest {
	@Test
	public void testGetBMI() {
		Person sut = new Person();
		sut.setHeight(180.3); 
		sut.setWeight(72.0);
	}
}
