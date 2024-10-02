import java.util.Scanner;

public class SungJuck2{
//	x축은 학생의 이름이 y축은 학생의 과목이 들어간다.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int studentCount;

        System.out.print("학생 수를 입력하세요: ");
        studentCount = in.nextInt();

        String[] names = new String[studentCount];
        int[][] scores = new int[studentCount][3];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("학생의 이름: ");
            names[i] = in.next();

            System.out.print(names[i] + "의 Java 성적: ");
            scores[i][0] = in.nextInt();

            System.out.print(names[i] + "의 CS 성적: ");
            scores[i][1] = in.nextInt();

            System.out.print(names[i] + "의 Web 성적: ");
            scores[i][2] = in.nextInt();
        }

        System.out.println("             ===== 성적표 =====");
        System.out.println("----------------------------------------------");
        System.out.printf("%-10s %-5s %-5s %-5s %-5s %-5s %s%n", "이름", "Java", "C", "Web", "총점", "평균", "학점");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < studentCount; i++) {
            int javaScore = scores[i][0];
            int csScore = scores[i][1];
            int webScore = scores[i][2];

            int total = javaScore + csScore + webScore;
            double average = total / 3.0;
            String grade = getGrade(average);

            System.out.printf("%-10s %-5d %-5d %-5d %-5d %-7.2f %s%n", names[i], javaScore, csScore, webScore, total, average, grade);
        }

        in.close();
    }

    public static String getGrade(double average) {
        if (average >= 95) {
            return "A+";
        } else if (average >= 90) {
            return "A0";
        } else if (average >= 85) {
            return "B+";
        } else if (average >= 80) {
            return "B0";
        } else if (average >= 75) {
            return "C+";
        } else if (average >= 70) {
            return "C0";
        } else if (average >= 65) {
            return "D+";
        } else if (average >= 60) {
            return "D0";
        } else {
            return "F0";
        }
    }
}
