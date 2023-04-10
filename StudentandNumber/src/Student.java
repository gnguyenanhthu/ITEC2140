/**Class: Student.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Oct 1, 2021
*
* This class – This class contains student's attribs such as
* name, major, classification
* average grade of quiz, test, homework
* compute an over all grade
*/

public class Student
{
	//add three attribs/vars
	//you have three already
	private String name;
	private String major;
	private String classification;
	private double quizAverage;
	private double testAverage;
	private double homeworkAverage;

	//set defaults for those three attribs you added
	public Student()
	{
		this.name = "TBD";
		this.major = "undeclared";
		this.classification = "freshman";
		this.quizAverage = 100;
		this.testAverage = 100;
		this.homeworkAverage = 100;
	}
	//Build a new constructor with params of name, major, classification
	//do not forget to default values of your other instance vars
	public Student(String newName, String newMajor, String newClassification)
	{
		this.name = newName;
		this.major = newMajor;
		this.classification = newClassification;
		this.quizAverage = 100;
		this.testAverage = 100;
		this.homeworkAverage = 100;
	}
	
	//getters and setters
	public String getName()
	{
		return this.name;
	}

	public void setName(String newName)
	{
		this.name = newName;
	}

	public String getMajor()
	{
		return this.major;
	}

	public void setMajor(String newMajor)
	{
		this.major = newMajor;
	}
	
	//New getters & setters
	public String getClassification()
	{
		return this.classification;
	}

	public void setClassification(String newClassification)
	{
		this.classification = newClassification;
	}

	public double getQuizAverage()
	{
		return this.quizAverage;
	}
	
	public void setQuizAverage(double changedQuizAverage)
	{
		this.quizAverage = changedQuizAverage;
	}
	
	public double getTestAverage()
	{
		return this.testAverage;
	}
	
	public void setTestAverage(double changedTestAverage)
	{
		this.testAverage = changedTestAverage;
	}
	
	public double getHomeworkAverage()
	{
		return this.homeworkAverage;
	}
	
	public void setHomeworkAverage(double changedHomeworkAverage)
	{
		this.homeworkAverage = changedHomeworkAverage;
	}
	
	//Custom method - MUST use this signature
	public double computeOverallGrade()
	{ 
		return quizAverage * 0.25 + testAverage * 0.5 +  homeworkAverage * 0.25;
	}

	@Override
	public String toString()
	{
		return "\nName: " + name + ", major: " + major + ", classification: " + classification + "\nQuiz average: " + quizAverage
				+ ", test average: " + testAverage + ", homework average: " + homeworkAverage + "\nOverall grade: " + computeOverallGrade();
	}

}

