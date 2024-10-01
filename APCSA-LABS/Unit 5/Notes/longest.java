public class longest {
    public static String longesString(String[][] arr) {
        String l = arr[0][0];
        for(String[] r : arr) {
            for(String c : r) {
                if(c.length() > l.length()) {
                    l = c;
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        String[][] strings = {
            {"hello", "test", "this"},
            {"why", "robot", "hexagon"}, 
            {"alphabet", "confuse", "destroy"}
        };
        System.out.println(longesString(strings));
    }
}
