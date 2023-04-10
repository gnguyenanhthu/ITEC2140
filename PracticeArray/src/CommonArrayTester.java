import java.util.Arrays;

/**Class: CommonArrayTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Nov 2, 2021
*
* This class – now describe what the class does
*/

/**
 * @author Admin
 *
 */
public class CommonArrayTester
{
	public static void main(String[] args)
	{
		CommonArray cam = new CommonArray();
		int[] myArrayOfInts = cam.generateArray(10);
		System.out.println(Arrays.toString(myArrayOfInts));
		int total = cam.findArrayTotal(myArrayOfInts);
		System.out.println("Total = " + total);
		/*int[] myArrayOfInts = new int [6];
		myArrayOfInts[0] = 1;
		myArrayOfInts[1] = 1;
		myArrayOfInts[2] = 1;
		myArrayOfInts[3] = 1;
		myArrayOfInts[4] = 1;
		myArrayOfInts[5] = 1;*/
	}
}
