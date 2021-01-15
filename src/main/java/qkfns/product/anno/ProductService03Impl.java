package qkfns.product.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qkfns.product.ProductDAO03;
import qkfns.product.ProductService03;
import qkfns.product.ProductVO;

@Component("ps03")
public class ProductService03Impl implements ProductService03 {

    @Autowired
    private ProductDAO03 pdao;
    // 이전 예제에서는 setter 메서드를 통해 DI 되었음
    // 지금은 어노테이션을 선언해서 setter 메서드 정의없이
    // DI 받음

    /*public void setPdao(ProductDAO03 pdao) {
        this.pdao = pdao;
    }
*/
    // 상품등록 기능을 수행하는 메서드
    public void newProduct() {
        System.out.println("새로운 상품을 등록합니다!");

        ProductVO pvo = new ProductVO();
        pvo.setPname("수지로션");
        pvo.setPrice(35000);

        // 입력받은 상품 정보에 영속성을 부여하기 위해 DAO호출
        // 마찬가지로 new 연산자로 해당 객체를 생성하고
        // insertProduct 메서드 호출함
        //ProductDAO02 pdao = new ProductDAO02Impl();

        pdao.insertProduct(pvo);

        System.out.println("새로운 상품이 등록되었습니다!");

    }
}
