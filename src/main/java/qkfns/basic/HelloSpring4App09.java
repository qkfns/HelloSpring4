package qkfns.basic;

import qkfns.product.ProductService01;
import qkfns.product.ProductService02;
import qkfns.product.ProductService02Impl;

public class HelloSpring4App09 {
    // 상품 등록 프로그램
    // HelloSpring4App08 -> ProductService01
    // Main클래스에서 상품등록기능을 실행하기 위해
    // new 연산자를 이용해서 ProductService01의 객체를 만들고
    // 그 객체를 통해 newProduct()를 호출함


    public static void main(String[] args) {
        ProductService02 ps = new ProductService02Impl();
        ps.newProduct();


    }
}
