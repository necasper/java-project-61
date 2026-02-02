package code.app.games;

import code.app.Game;

public class CalcGame extends Game {

    private Exercise exercise;

    private Exercise createExercise() {
        int a = createNumber();
        int b = createNumber();
        int operation = getOperation();
        Exercise newExercise = new Exercise();
        switch (operation) {
            case 0:
                newExercise.setResult(a + b);
                newExercise.setExerciseText(a + " + " + b);
                break;
            case 1:
                newExercise.setResult(a - b);
                newExercise.setExerciseText(a + " - " + b);
                break;
            case 2:
                newExercise.setResult(a * b);
                newExercise.setExerciseText(a + " * " + b);
                break;
            default:
                throw new IllegalStateException("Unknown operation: " + operation);
        }
        return newExercise;
    }

    private static class Exercise {
        private String exerciseText;
        private int result;

        public String getExerciseText() {
            return exerciseText;
        }

        public void setExerciseText(String exerciseText) {
            this.exerciseText = exerciseText;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }
    }

    private int createNumber() {
        return createNumber(100);
    }

    private int getOperation() {
        return createNumber(2);
    }

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String getQuestion() {
        exercise = createExercise();
        return exercise.getExerciseText();
    }

    @Override
    public String getResult() {
        return String.valueOf(exercise.result);
    }
}
