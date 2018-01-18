public class TestScores
{
	private double score1;
	private double score2;
	private double score3;
	
	//The constructor initiaizes the object with 3 test scores.
	public TestScores(double s1, double s2, double s3)
	{
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}
	
	//Three setScore mutators
	public void setScore1(double s1)
	{
		score1 = s1;
	}
	
	public void setScore2(double s2)
	{
		score1 = s2;
	}
	
	public void setScore3(double s3)
	{
		score1 = s3;
	}
	
	//3 getScore Accessors return test scores
	
	public double getScore1()
	{
		return score1;
	}

	public double getScore2()
	{
		return score2;
	}
	public double getScore3()
	{
		return score3;
	}
	
	//getAverageScore method returns the average of the test scores
	public double getAverageScore()
	{
		return (score1 + score2 + score3)/3.0;
	}
}