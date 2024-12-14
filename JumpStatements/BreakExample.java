package JumpStatements;

public class BreakExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 7) {
                break;  
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Loop ended.");
    }
}



