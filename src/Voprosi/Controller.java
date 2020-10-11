package Voprosi;

import javafx.beans.NamedArg;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller {
    boolean daikinet;
    private int VibraniiOtvet;
    public Label Question;
    public Button buttonA;
    public Button buttonB;
    public Button buttonC;
    public Button buttonD;
    public Button rightQuestion;

    ArrayList<Question> entities;
    Question q;

    public Controller() {
        entities = QuestionReader.getQuestions();

        Question = (Label) Main.parent.getChildrenUnmodifiable().get(0);
//        Question.setText(entities.get(0).Questions);
//        buttonA.setText(entities.get(0).AnswerA);
//        buttonB.setText(entities.get(0).AnswerB);
//        buttonC.setText(entities.get(0).AnswerC);
//        buttonD.setText(entities.get(0).AnswerD);
//        rightQuestion.setText(entities.get(0).RightQuestion);
    }

    public void OtvetAClicked(ActionEvent actionEvent) {
        VibraniiOtvet= 1;
    }
    public void OtvetBClicked(ActionEvent actionEvent) {
        VibraniiOtvet= 2;
    }
    public void OtvetCClicked(ActionEvent actionEvent) {
        VibraniiOtvet=3;
    }
    public void OtvetDClicked(ActionEvent actionEvent) {
        VibraniiOtvet= 4;
    }
    public void rightQuestionClicked(ActionEvent actionEvent) {
        if(VibraniiOtvet== Integer.parseInt(entities.get(0).RightQuestion)){
            daikinet=true;
            System.out.println(daikinet);
        }else {
            daikinet= false;
            System.out.println(daikinet);
        }
    }
}
