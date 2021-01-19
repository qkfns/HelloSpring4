package qkfns.sungjuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * 파일명 : SungJukV12Main
 * 작성일 : 2022.01.19
 *
 * 프로그램 설명 : 성적처리프로그램 v12
 * 스프링 기반 성적처리 프로그램 작성
 * 인터페이스를 기반으로 리디자인함
 * mybatis로 JDBC 처리코드를 간소화함
 *
 */
public class SungJukV12Main {
    public static void main(String[] args) {
        /*SungJukV11Service sjsrv = new SungJukV11ServiceImpl();*/

        ApplicationContext ctx = new ClassPathXmlApplicationContext("sungjuk12.xml");

        SungJukV11Service sjsrv = (SungJukV12ServiceImpl)ctx.getBean("sjsrv12");

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while(true) { // 메뉴 띄우고 작업번호 입력을 반복
            ((SungJukUI)sjsrv).displayMenu();
            menu = sc.nextLine();

            switch(menu) {
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.readSungJuk(); break;
                case "3": sjsrv.readOneSungJuk(); break;
                case "4": sjsrv.modifySungJuk(); break;
                case "5": sjsrv.removeSungJuk(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못입력!!");
            }
        }
    }
}
