package codingchallanges;

public class Question1 {
	public void checkAge(int age) throws MyException {
		if (age < 15) {

			throw new MyException("not valid");
		} else {
			System.out.println("valid");
		}

	}

	public static void main(String[] args) throws MyException {
		Question1 question1 = new Question1();
		question1.checkAge(22);

	}

}
