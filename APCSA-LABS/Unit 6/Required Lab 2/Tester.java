/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Tester {
    private static void gradeResult(Gradeable g, int type) {
        int runs = 0;
        if(type == 0) {
            runs = (int) (Math.random() * 20) + 1;
        }else if(type == 1) {
            runs = (int) (Math.random() * 65) + 15;
        }else {
            runs = (int) (Math.random() * 13);
        }
        for(int n = 0; n < runs; n++) {
            g.updateGrade();
        }
    }

    private static String passString(Gradeable g) {
        if(g.isPassing()) {
            return "has passed";
        }
        return "has not passed";
    }

    public static void main(String[] args) {
        String[] names = {"Al", "Bob", "Carl", "Dan", "Ed", "Fred", "Gary"};
        for(int i = 0; i < 20; i++) {
            String name = names[(int) (Math.random() * names.length)];
            double choice = Math.random();
            if(choice < 0.33) {
                HighSchoolStudent h = new HighSchoolStudent();
                gradeResult(h, 0);
                System.out.println(name + " is a high school student and had a semester average of " + h.getScore() + " and " + passString(h) + ".");
            }else if(choice < 0.66) {
                APExamTaker a = new APExamTaker();
                gradeResult(a, 1);
                System.out.println(name + " is an AP student and has an AP score of " + a.getScore() + " and " + passString(a) + ".");
            }else {
                DriversPermitStudent d = new DriversPermitStudent();
                gradeResult(d, 2);
                System.out.println(name + " is a learner's permit tester and had a score of " + d.getScore() + " and " + passString(d) + ".");
            }
        }
    }
}
