package qkfns.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qkfns.product.ProductService03;
import qkfns.product.ProductService03Impl;

public class HelloSpring4App10 {
    // 상품 등록 프로그램
    // HelloSpring4App08 -> ProductService01

    // Main클래스에서 상품등록기능을 실행하기 위해
    // 스프링 컨테이너가 만들어준 객체를 이용함
    // 이때 setter 메서드를 이용해서 객체를 주입받음
    // bean 설정파일에는 property라는 태그에 정의해 둠

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("product.xml");

        ProductService03 ps = (ProductService03Impl) ctx.getBean("ps03");
        ps.newProduct();
    }
}
