/**Class: StudentTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Oct 1, 2021
*
* This class – This class will store student's information and test the Student class
*/

public class StudentTester
{

	public static void main(String[] args)
	{
		Student s0 = new Student();
		s0.setName("Mickey Mouse"); s0.setMajor("ITEC"); s0.setClassification("Senior");
		s0.setQuizAverage(50); s0.setTestAverage(70); s0.setHomeworkAverage(100);
		
		Student s1 = new Student(); //default
		
		Student s2 = new Student();
		s2.setName("Minnie Mouse"); s2.setMajor("Biology"); s2.setClassification("Junior");
		s2.setQuizAverage(87); s2.setTestAverage(77); s2.setHomeworkAverage(93);
		
		Student s3 = new Student("Pluto", "History", "Freshman");
		s3.setQuizAverage(64); s3.setTestAverage(78); s3.setHomeworkAverage(83);
		
		Student s4 = new Student ("Donald Duck", "Business", "Freshman");
		s4.setQuizAverage(76); s4.setTestAverage(85); s4.setHomeworkAverage(67);
		
		Student s5 = new Student ("Daisy Duck", "Chemistry", "Sophomore");
		s5.setQuizAverage(80); s5.setTestAverage(95); s5.setHomeworkAverage(70);

		Student s6 = new Student();
		s6.setName("Goofy"); s6.setMajor("Arts"); s6.setClassification("Senior");
		s6.setQuizAverage(90); s6.setTestAverage(93); s6.setHomeworkAverage(95);
		
		Student s7 = new Student();
		s7.setName("Pete"); s7.setMajor("Athlete"); s7.setClassification("Sophomore");
		s7.setQuizAverage(67); s7.setTestAverage(55); s7.setHomeworkAverage(70);
		
		System.out.println("Using toString method (print calls this)");
		System.out.println(s0); System.out.println(s1); System.out.println(s2);
		System.out.println(s3);	System.out.println(s4);	System.out.println(s5);
		System.out.println(s6); System.out.println(s7);

		System.out.println();

		//add four new Students with your 3 param constructor
		//after you create these new students
		//make sure you set the quiz, hw, and test avg the student earned
		//"Use the set methods to store values for each of the three averages"
	}
}
