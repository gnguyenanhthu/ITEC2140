/**Class: Number.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Oct 1, 2021
*
* This class – this class describe 2 numbers and methods such as
* finding sum, diff, product, average, absolute, min, max, 
*/

public class Number
{
	private double firstNumb;
	private double secondNumb;
	
	public Number(double newFirstNumb, double newSecondNumb)
	{
		firstNumb = newFirstNumb;
		secondNumb = newSecondNumb;
	}
	
	public double findSum()
	{
		return firstNumb + secondNumb;
	}
	
	public double findDifference()
	{
		return Math.abs(firstNumb - secondNumb);
	}
	
	public double findProduct()
	{
		return firstNumb * secondNumb;
	}
	
	public double findAverage()
	{
		return (firstNumb + secondNumb) / 2;
	}
	
	public int absolutes()
	{
		return (int) (Math.abs(firstNumb) + Math.abs(secondNumb));
	}
	
	public double findMax()
	{
		return Math.max(firstNumb, secondNumb);
	}
	
	public double findMin()
	{
		return Math.min(firstNumb, secondNumb);
	}
	
	public String toString()
	{
		return "\nFirst number: " + firstNumb + ", second number: " + secondNumb + "\nSum: " + findSum() + ", difference: " + findDifference() + 
				"\nProduct: " + findProduct() + ", average: " + findAverage() + "\nTotal of the absolute values: " + absolutes() + 
				"\nMax: " + findMax() + ", min: " + findMin();
	}
}
	
