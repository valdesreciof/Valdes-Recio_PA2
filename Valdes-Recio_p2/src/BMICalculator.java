import java.util.Scanner;

public class BMICalculator {
	
	double weight, height, bmi;
	String bmiCategory;
	
	public void readUserData() {
		readMeasurementData(readUnitType());
	}
	
	private int readUnitType() {
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to BMI Calculator! \nEnter 1 for imperial or 2 for metric units: ");
		input = scan.nextInt();
		while(input>2||input<1) {
			System.out.println("Enter 1 for imperial or 2 for metric units: ");
			input = scan.nextInt();
		}
		return input;
	}
	
	private void readMeasurementData(int type) {
		if(type == 1) {
			readImperialData();
		}
		else {
			readMetricData();
		}
	}
	private void readMetricData() {
		double height, weight;
		
		System.out.println("Please eneter your height in meters: ");
		Scanner scan3 = new Scanner(System.in);
		height = scan3.nextDouble();		
		if(height<0) {
			System.exit(0);
		}
		setHeight(height);
		
		System.out.println("Please eneter your weight in kilograms");
		weight = scan3.nextDouble();		
		if(weight<0) {
			System.exit(0);
		}
		setWeight(weight);
	}
	
	private void readImperialData() {
		double height, weight;
		
		System.out.println("Please eneter your height in inches: ");
		Scanner scan2 = new Scanner(System.in);
		height = scan2.nextDouble();		
		if(height<0) {
			System.exit(0);
		}
		setHeight(height);
		
		System.out.println("Please eneter your weight in pounds");
		weight = scan2.nextDouble()*703;	
		if(weight<0) {
			System.exit(0);
		}
		setWeight(weight);
	}
	
	private void calculateBmiCategory(double bmi) {
		if(getBMI()<18.5) {
			this.bmiCategory = "Underweight";
		}
		else if(getBMI()>=18.5 && getBMI()<25) {
			this.bmiCategory = "Normal Weight";
		}
		else if(getBMI()>=25 && getBMI()<30) {
			this.bmiCategory = "Over Weight";
		}
		else {
			this.bmiCategory = "Obesity";
		}
	}
	
	public void calculateBmi() {
		this.bmi = (getWeight()/(getHeight()*getHeight()));
		calculateBmiCategory(getBMI());	
	}
	
	public void displayBmi() {
		System.out.println("Your BMI is: " + getBMI() +" and your BMI category is: " + getBmiCategory());
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	private void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	private void setHeight(double height) {
		this.height = height;
	}
	
	public double getBMI() {
		return this.bmi;
	}
	
	public String getBmiCategory() {
		return this.bmiCategory;
	}

	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}

}
