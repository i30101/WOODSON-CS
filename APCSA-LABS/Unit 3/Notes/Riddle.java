public class Riddle {
    private String question, answer;

    public Riddle(String initQuestion, String initAnswer) {
        question = initQuestion;
        answer = initAnswer;
    }

    public void printQuestion() {
        System.out.println(question);
    }

    public void printAnswer() {
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Riddle riddle1 = new Riddle("What occurs once in a minute, twice in a moment, and never in a thousand years?", "The letter \"m\".");
        Riddle riddle2 = new Riddle("I am an odd number, but take a letter away, and I become even. What am I?", "The number seven.");
        riddle1.printQuestion();
        riddle1.printAnswer();
        riddle2.printQuestion();
        riddle2.printAnswer();
        
    }
}
