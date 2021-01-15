package qkfns.bean.anno;

import org.springframework.stereotype.Component;
import qkfns.bean.HelloSpring4Bean04;

@Component("jpn")
public class HelloSpring4Bean04Jpn implements HelloSpring4Bean04 {
    // 다양한 언어로 인삿말을 출력하는 메서드
    @Override
    public void sayHello(String msg) {
        System.out.println("こんにちは, " + msg);
    }
}
