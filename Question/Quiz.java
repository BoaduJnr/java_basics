package Question;

import java.util.List;

public class Quiz {

    public List<Question> questions;
    int questionNumber = 0;
    Question question;

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public Question nextQuestions() {
        if (questionNumber < questions.size()) {
            question = questions.get(questionNumber);
            questionNumber++;
        }
        return question;
    }

}
