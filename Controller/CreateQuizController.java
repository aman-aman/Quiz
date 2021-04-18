

@Controller
@RequestMapping("/createquiz")
public class CreateQuizController {

	@RequestMapping("/getallquestion")
	public void getAllQuestion()
	{
		//fetching all question from database and displaying to user
		ArrayList<Question> questions;
	}
	
	@RequestMapping("/selectquizquestion")
	public void createQuiz()
	{
		//user selects the questions and submit it to create the quiz
		ArrayList<Question> selectedQuestion;
		
		createQuiz(selectedQuestion);
	}
	
	public void createQuiz(ArrayList<Question> questions)
	{
		
	}
}
