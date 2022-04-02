package CodingPractice;

public class practice0402 {

    public static void main(String[] args) {
        // 피라미드 별 모양 출력하기
        int level = 5; // 층수를 나타내는 level 변수 선언

        for (int i = 0; i < level; i++) { // 전체 반복문
            for (int j = 0; j < level - i; j++) { // 공백 반복문
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i) + 1; j++) { // * 반복문
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
