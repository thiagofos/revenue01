package thiago;

public class Cauculate {

	public final double INCOMEUSC1 = 12012, INCOMEUSC2 = 3458.90, INCOMEUSC3 = 0;
	public String name;
	public double income;
	public double taxcredt;
	public double taxdeducted;
	public double usc;

	public double adjustments() {
		return taxcredt + taxdeducted;
	}
	public double taxDue() {
		return (income > 35300) ? income * 0.4 : income * 0.2;
	}
	public double payeResulted() {
		return (taxcredt + taxdeducted) - ((income > 35300) ? income * 0.4 : income * 0.2);
	}
	public double totalResulted() {
		return (INCOMEUSC1 * 0.005) + (INCOMEUSC2 * 0.02) + (INCOMEUSC3 * 0.0475);
	}
	public double uscResulted() {
		return (INCOMEUSC1 * 0.005) + (INCOMEUSC2 * 0.02) + (INCOMEUSC3 * 0.0475) - usc;
	}
	public double gross() {
		return INCOMEUSC1 + INCOMEUSC2 + INCOMEUSC3;
	}
	public double totalOfResult() {
	    	return ((taxcredt + taxdeducted) - ((income > 35300)? income * 0.4 : income * 0.2)) - ((INCOMEUSC1 * 0.005) + (INCOMEUSC2 * 0.02) + (INCOMEUSC3 * 0.0475) - usc);

	    }
	
}
