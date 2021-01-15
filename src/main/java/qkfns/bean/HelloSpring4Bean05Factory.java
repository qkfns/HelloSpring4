package qkfns.bean;

public class HelloSpring4Bean05Factory {

    // 인삿말을 출력하는 객체를 생성하는 create 메서드 정의의
   public static HelloSpring4Bean04 create(String type) {
        HelloSpring4Bean04 bean = null;

        if (type.equalsIgnoreCase("kor"))
            bean = new HelloSpring4Bean04Kor();
        else if (type.equalsIgnoreCase("eng"))
            bean = new HelloSpring4Bean04Eng();
        else if (type.equalsIgnoreCase("jpn"))
            bean = new HelloSpring4Bean04Jpn();

        return bean;
    }

}
