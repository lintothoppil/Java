import java.util.Scanner;

// Class for academic details
class Student {
    int academicScore;

    void getAcademicScore(Scanner sc) {
        System.out.print("Enter academic score: ");
        academicScore = sc.nextInt();
    }

    void showAcademicScore() {
        System.out.println("Academic Score: " + academicScore);
    }
}

// Interface for sports score
interface Sports {
    void getSportsScore(Scanner sc);
    void showSportsScore();
}

// Result class inherits Student and implements Sports
class Result extends Student implements Sports {
    int sportsScore;

    public void getSportsScore(Scanner sc) {
        System.out.print("Enter sports score: ");
        sportsScore = sc.nextInt();
    }

    public void showSportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }
}

// Main class
public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();
        r.getAcademicScore(sc);
        r.getSportsScore(sc);

        System.out.println("\n--- Student Result ---");
        r.showAcademicScore();
        r.showSportsScore();

        sc.close();
    }
}

