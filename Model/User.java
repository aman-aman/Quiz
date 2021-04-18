import java.util.ArrayList;

enum Gender
{
	MALE,FEMALE,OTHER;
}
public class User {
	String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public ArrayList<Quizz> getQuizGiven() {
		return quizGiven;
	}
	public void setQuizGiven(ArrayList<Quizz> quizGiven) {
		this.quizGiven = quizGiven;
	}
	String name;
	int Age;
	Gender gender;
	ArrayList<Quizz> quizGiven;
}
