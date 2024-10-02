import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJuk1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nextStudent;

        List<String> names = new ArrayList<>();
        List<Integer> javaLang = new ArrayList<>();
        List<Integer> cLang = new ArrayList<>();
        List<Integer> webLang = new ArrayList<>();

        do {
            System.out.print("학생의 이름: ");
            String name = in.next();
            names.add(name);

            System.out.print(name + "의 Java 성적: ");
            int javaScore = in.nextInt();
            javaLang.add(javaScore);

            System.out.print(name + "의 CS 성적: ");
            int csScore = in.nextInt();
            cLang.add(csScore);

            System.out.print(name + "의 Web 성적: ");
            int webScore = in.nextInt();
            webLang.add(webScore);

            System.out.print("다음 학생을 입력하시겠습니까? (Y/N): ");
            nextStudent = in.next();
            
        } while (nextStudent.equalsIgnoreCase("Y"));
        
        System.out.println("             ===== 성적표 =====");
        System.out.println("----------------------------------------------");
        System.out.printf("%-8s %-5s %-5s %-5s %-5s %-5s %s%n", "이름", "Java", "C", "Web", "총점", "평균", "학점");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            int javaScore = javaLang.get(i);
            int csScore = cLang.get(i);
            int webScore = webLang.get(i);

            int total = javaScore + csScore + webScore;
            double average = total / 3.0;

            String grade = getGrade(average);

            System.out.printf("%-9s %-5d %-5d %-5d %-5d %-7.2f %s%n", name, javaScore, csScore, webScore, total, average, grade);
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
