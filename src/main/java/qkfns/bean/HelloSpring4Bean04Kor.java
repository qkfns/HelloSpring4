package qkfns.bean;

public class HelloSpring4Bean04Kor implements HelloSpring4Bean04{

    // 다양한 언어로 인삿말을 출력하는 메서드
    @Override
    public void sayHello(String msg) {
        System.out.println("안녕하세요, " + msg);

    }
}
