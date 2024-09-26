import java.util.Scanner;
public class RectInOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        int CooX = in.nextInt();
        int CooY = in.nextInt();
        
        if(100 <= CooX && CooX <= 200 && 100 <= CooY && CooY <= 200) {
            System.out.printf("(%d,%d)는 사각형 안에 있습니다.", CooX, CooY);
        } else {
            System.out.printf("(%d,%d)는 사각형 밖에 있습니다.", CooX, CooY);
        }
    }
}
