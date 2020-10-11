package Voprosi;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class QuestionReader {
   public Question Que = new Question();
    public static ArrayList<Question> getQuestions() {

        ArrayList<Question> quest = new ArrayList<>();
        try {
            FileReader fr = new FileReader("C:\\Users\\Ученик\\IdeaProjects\\Scene\\src\\Voprosi\\Questi.txt");
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                String Q1 = scan.nextLine();
                String[] result = Q1.split("\\|");
                Question Que = new Question();
                Que.Questions = result[0];
                Que.AnswerA = result[1];
                Que.AnswerB = result[2];
                Que.AnswerC = result[3];
                Que.AnswerD = result[4];
                Que.RightQuestion = result[5];

                quest.add(Que);
            }
        } catch (Exception e) {
            System.out.println();
        }
        return quest;

    }
}