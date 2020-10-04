package Voprosi;

import java.io.FileReader;
import java.util.ArrayList;

public class QuestionReader {
    try

    {
        ArrayList<Question> quest = new ArrayList<>();


    }
    public ArrayList<Question> getQuestions() {
        try {
            FileReader fr = new FileReader("C:\\Users\\Ученик\\IdeaProjects\\Scene\\src\\Voprosi\\Questi.txt" );
        }catch (Exception e){
            System.out.println();
        }
        return null;
    }
}