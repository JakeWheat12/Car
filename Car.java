//Jake Wheat
//9-24-19
//405 - Object Oriented Programming
/**
 * Each Car instance maintains information about a Car
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Car {
	public static int RED = rgb(255, 0, 0);
	public static int GREEN = rgb(0, 255, 0);
	public static int BLUE = rgb(0, 0, 255);
	protected String plateNumber;
	protected int exteriorColor;

	/** constructor:
	 *			 Constructor for a Car Object.
	 * @param plateNumber
	 *            the plate number of the {@code Car}.
	 * @param exteriorColor
	 *            the exterior color of the {@code Car}.
	 */
	public Car(String plateNumber, int exteriorColor) {
		// Problem 1
		this.plateNumber = plateNumber;
		this.exteriorColor = exteriorColor;
	}

	//toString method is overridden to print the corret member variables
	public String toString() {
		return "(plate number: " + plateNumber + ", exterior color: " + exteriorColor + ")";
	}

	/**
	 *      setPlateNumber method
	 * @param plateNumber
	 *            the new plate number of this {@code Car}.
	 */
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	/**
	 * Returns the plate number of this {@code Car}.
	 * 
	 * @return the plate number of this {@code Car}.
	 */
	public String getPlateNumber() {
		return this.plateNumber;
	}

	/**
	 * Returns an {@code int} value that corresponds to the specified color.
	 * 
	 * @param r
	 *            the red component.
	 * @param g
	 *            the green component.
	 * @param b
	 *            the blue component.
	 * @return an {@code int} value that corresponds to the specified color.
	 */
	public static int rgb(int r, int g, int b) {
		return (0xFF << 24) | ((r & 0xFF) << 16) | ((g & 0xFF) << 8) | ((b & 0xFF) << 0);
	}

	/**Added equals method to compare an incoming car object to the current car object.
	*
	* @param car x
	*		reads a car object labeled 'x'
	* @return an {@code} boolean value, (t/f)
	*/
	public boolean equals(Car x) {
		if (this.plateNumber == x.plateNumber) {
			//This says if the platenumber
			if (this.exteriorColor == x.exteriorColor) {
				//& the color is the same, then return true;
				return true;
			}
		}
		//else return false
		return false;
	}

	/**
	 * The main method.
	 * @param args
	 *            the program arguments.
	 */
	public static void main(String []args) {
		// Problems 1 and 2
		Car red = new Car("1", Car.RED);
		System.out.println(red);

		// Problem 3
		red.setPlateNumber("2");
		System.out.println(red);

		// Problem 4
		System.out.println(red.getPlateNumber());

		// Problem 5
		System.out.println(red.equals(new Car("1", Car.RED)));
		System.out.println(red.equals(new Car("2", Car.RED)));
		System.out.println(red.equals(new Car("1", Car.GREEN)));
		System.out.println(red.equals("1"));
	}

}