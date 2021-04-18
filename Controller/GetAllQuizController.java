import java.util.ArrayList;

@Controller
@RequestMapping("/getallquiz")
public class getAllQuiz {

	
	public void getAllquizindatabase()
	{
		ArrayList<Quizz> quizList=getQuizfromDatabase();
	}

	private ArrayList<Quizz> getQuizfromDatabase() {
		// TODO Auto-generated method stub
		return null;
	}
}
