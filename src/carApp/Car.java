/**
 * 
 */
package carApp;

/**
 * @author natha
 *
 */
public class Car {
	private String brand;
	private String model;
	private String desc;
	
	/**
	 * Instantiates a new car object based on the following parameters.
	 * @param brand
	 * @param model
	 * @param description
	 * 
	 */
	public Car(String brand, String model, String desc) {
		this.brand = brand;
		this.model = model;
		this.desc = desc;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the description
	 */
	public String getDesc() {
		return desc;
	}
	
	
	
	
}
