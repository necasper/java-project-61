package hexlet.code.games;

import hexlet.code.Game;

public final class CalcGame extends Game {

    private static final int OPERAND_UPPER_BOUND_EXCLUSIVE = 100;
    private static final int OPERATION_UPPER_BOUND_EXCLUSIVE = 2;

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

        public void setExerciseText(String text) {
            this.exerciseText = text;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int value) {
            this.result = value;
        }
    }

    private int createNumber() {
        return createNumber(OPERAND_UPPER_BOUND_EXCLUSIVE);
    }

    private int getOperation() {
        return createNumber(OPERATION_UPPER_BOUND_EXCLUSIVE);
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
        return String.valueOf(exercise.getResult());
    }
}
