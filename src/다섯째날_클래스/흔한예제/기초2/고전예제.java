package 다섯째날_클래스.흔한예제.기초2;

public class 고전예제 {
    public static void main(String[] args) {
        짐승 윗집형 = new 짐승();
        윗집형.먹는다();
        윗집형.소리친다();
        윗집형.반응한다();

        사람 나님 = new 사람();

        나님.소리 = "그러시면 안됩니다.";
        나님.먹이 = "캐비어와 브루고뉴 와인";

        나님.소리친다();
        나님.먹는다();

        // 짐승처럼말고 사람처럼 반응해라!! <- 선조의 기능보다 니 기능으로 반응해라.
        나님.반응한다();

        // 새롭게 추가 
        나님.저녁먹다();
        나님.점심먹다();

    }
}
// 미션 1:
/*
        사람 클래스에서...

    @Override
    public void 반응한다() {
        String s = 따라해봐();
        System.out.println("당신은 \'" + s + "\'라고 말했습니다.");
    }

    를 @Override 삭제하고

    public void 방응한다() {
        String s = 따라해봐();
        System.out.println("당신은 \'" + s + "\'라고 말했습니다.");
    }

    로 바꾼 후, 실행해본다.
*/
