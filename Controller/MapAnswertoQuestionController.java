import java.util.HashMap;

@Controller
@RequestMapping("/mapanswertoquestion")
public class MapAnswertoQuestionController {

	@RequestMapping("/submitquestion/{questionId}/{answerId}")
	public void PopulateQuestion(@Pathvariable String questionId,@Pathvariable String answerId )
	{
		HashMap<Question,Answer > questionAnswer;
		Question question=getQuestion(questionId);
		Answer answer =getAnswer(answerId);
		questionAnswer.put(question, answer);
	}

	private Answer getAnswer(String answerId) {
		// TODO Auto-generated method stub
		return null;
	}

	private Question getQuestion(String questionId) {
		// TODO Auto-generated method stub
		return null;
	}
}


1842021629