package realProject;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the size of int? ?", "A.4", "B.6", "C.7", "D.10", "A");
        questions[1] = new Question(2, "What is the size of doublet? ?", "A.2", "B.6", "C.8", "D.10", "C");
        questions[2] = new Question(3, "What is the size of char? ?", "A.2", "B.6", "C.7", "D.9", "A");
        questions[3] = new Question(4, "What is the size of long? ?", "A.2", "B.8", "C.5", "D.10", "B");
        questions[4] = new Question(5, "What is the size of boolean ?", "A.3", "B.2", "C.7", "D.1", "D");
    }

    public void playQuiz() {
        int i = 0;
        for (Question que : questions) {
            System.out.println("Question no. :" + que.getId());
            System.out.println(que.getQuestion());
            System.out.println(que.getOptions());
            System.out.println(que.getOptions1());
            System.out.println(que.getOptions2());
            System.out.println(que.getOptions3());
            Scanner scanner = new Scanner(System.in);
            selection[i] = scanner.nextLine();
            i++;

        }
        for (String select : selection) {
            System.out.println(select);
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {

                score++;
            }


        }
        System.out.println("Your scrore is :" + score);
    }
}
