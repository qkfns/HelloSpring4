package qkfns.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qkfns.product.ProductService03;
import qkfns.product.anno.ProductService03Impl;


public class HelloSpring4App12 {
    // 상품 등록 프로그램 v4
    // HelloSpring4App10 -> ProductService02 -> ProductDAO02

    // Main클래스에서 상품등록기능을 실행하기 위해
    // 스프링 컨테이너가 만들어준 객체를 이용함
    // 빈 설정 대신 간단하게 어노테이션으로 DI를 함

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("product12.xml");

        ProductService03 ps = (ProductService03Impl) ctx.getBean("ps03");
        ps.newProduct();
    }
}
