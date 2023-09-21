/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Sep 20, 2023
 */
package model;

/**
 * 
 */
public class smallPizza 
{
	private int numPizzas;
	private int numSlices;

	public smallPizza() {
		super();
	}

	public smallPizza(int numPizzas) {
		this.numPizzas = numPizzas;
		numSlices = numPizzas * 4;
	}

	public void setNumPizzas(int numPizzas) {
		this.numPizzas = numPizzas;
	}

	public int getNumPizzas() {
		return numPizzas;
	}

	public void setNumSlices(int numSlices) {
		this.numSlices = numSlices;
	}

	public int getNumSlices()
	{
		return numSlices;
	}

	@Override
	public String toString() {
		return "Number of small pizzas: " + numPizzas + ". Number of slices: " + numSlices;
	}
}
