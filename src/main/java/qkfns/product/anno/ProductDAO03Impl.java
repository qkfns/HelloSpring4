package qkfns.product.anno;

import org.springframework.stereotype.Component;
import qkfns.product.ProductDAO03;
import qkfns.product.ProductVO;

@Component("pdao")
public class ProductDAO03Impl implements ProductDAO03 {
    public void insertProduct(ProductVO pvo) {
        System.out.printf("입력하신 %s이/가 성공적으로 저장되었어요\n",pvo.getPname());

    }
}
