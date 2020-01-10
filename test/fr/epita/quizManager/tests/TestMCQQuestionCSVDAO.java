package fr.epita.quizManager.tests;

import java.io.IOException;
import java.util.List;

import fr.epita.quizManager.datamodel.MCQQuestion;
import fr.epita.quizManager.datamodel.MCQQuestionCSVDAO;

public class TestMCQQuestionCSVDAO {

	public static void main(String[] args) throws IOException {
		MCQQuestionCSVDAO dao = new MCQQuestionCSVDAO();

		MCQQuestion mcqQuestion = new MCQQuestion();
		mcqQuestion.setDifficulty(3);
		mcqQuestion.setQuestion("What can we do with JDK?");
		mcqQuestion.setTopics(new String[] { "java", "compilation", "environments" });
		mcqQuestion.setId(1l);

		dao.create(mcqQuestion);

		List<MCQQuestion> allQuestions = dao.readAll();
	}

}