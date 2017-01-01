
public class Person {
	private String name;
	private double height;
	private double weight;
	
	public Person() {
	}

	public Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double getBMI() {
		return this.weight / (this.height * this.height);
	}

	public String getBodyStatus() {
		if(this.getBMI() >= 22) {
			return "Overweight";
		}
		return "Normal";
	}
}
