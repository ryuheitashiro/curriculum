package check;

import constants.Constants;

public class Check {

	private static String firstName = "田代";
	private static String lastName = "龍平";


	public static void main(String[] args) {

		System.out.println("printNameメソッド → " + printName(firstName, lastName));

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rp.introduce();
	}

	private static String printName(String firstName, String lastName) {
		return firstName + lastName;
	}

}
