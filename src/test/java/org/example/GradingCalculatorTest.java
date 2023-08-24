package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {


    @Test
    public void getGradeNoteA() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        gradingCalculator.setScore(91);
        gradingCalculator.setAttendancePercentage(71);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('A', result);
    }

    @Test
    public void getGradeNoteB() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        gradingCalculator.setScore(81);
        gradingCalculator.setAttendancePercentage(61);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('B', result);
    }

    @Test
    public void getGradeNoteC() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        gradingCalculator.setScore(61);
        gradingCalculator.setAttendancePercentage(61);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('C', result);
    }

    @Test
    public void getGradeNoteF() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        gradingCalculator.setScore(59);
        gradingCalculator.setAttendancePercentage(59);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F', result);
    }

}
