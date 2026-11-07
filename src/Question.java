import java.util.Random;
/**
 * <p>Title: The Question class</p>
 *
 * <p>Description: The Question class is able to generate a random addition or subtraction problem and
 * determine the answer. A Question is randomly either assigned to be an addition or subtraction 
 * problem. Questions are generated with operands between 0 and 12.  Subtraction problems have 
 * a first operand in the range 6-12 and the second less than or equal to the first, to ensure 
 * no negative answers.</p>
 *
 * @author 
 */


public class Question {

	private int operand1;
	private int operand2;
	private char operator;
	
	/**
	 * default Card constructor
	 * gets called when an object of the Question class is instantiated 
	 */
	public Question()
	{
		Random rand = new Random();
		int randomNum = rand.nextInt(2);
		
		// addition problems
		if(randomNum == 0)
		{
			operator = '+';
			operand1 = rand.nextInt(13);
			operand2 = rand.nextInt(13);
		}
		// subtraction problems
		else
		{
			operator = '-';			
          	operand1 = rand.nextInt(7) + 6;
			operand2 = rand.nextInt(operand1 + 1);	
                   
		}
		
	}
	/**
	 * toString method - this method returns the state of the Question object
	 * @return a reference to a String object that contains operand1 operator operand2
	 */
	public String toString()
	{
		return operand1 + " " + operator + " " + operand2 + " = ";
	}
	/**
	 * determineAnswer method - returns the result of operand1 operator operand2
	 * @return the answer to the question
	 */
	public int determineAnswer()
	{
		if(operator == '+')
			return operand1 + operand2;
		else
			return operand1 - operand2;
	}
	/**
	 * getOperand1 method - returns what's stored in the instance variable operand1
	 * @return the state of the instance variable operand1
	 */
	public int getOperand1()
	{
		return operand1;
	}
	/**
	 * getOperand2 method - returns what's stored in the instance variable operand1
	 * @return the state of the instance variable operand2
	 */
	public int getOperand2()
	{
		return operand2;

	}
	/**
	 * getOperator method - returns what's stored in the instance variable operator
	 * @return the state of the instance variable operator
	 */	
	public char getOperator()
	{
		return operator;
	}
}
