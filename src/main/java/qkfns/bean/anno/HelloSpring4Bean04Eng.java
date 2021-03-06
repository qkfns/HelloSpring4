package qkfns.bean.anno;

import org.springframework.stereotype.Component;
import qkfns.bean.HelloSpring4Bean04;

@Component("eng")
public class HelloSpring4Bean04Eng implements HelloSpring4Bean04 {

    // 다양한 언어로 인삿말을 출력하는 메서드

    @Override
    public void sayHello(String msg) {
        System.out.println("Hello, " + msg);
    }
}
