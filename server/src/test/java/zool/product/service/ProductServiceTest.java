package zool.product.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zool.product.ProductApplicationTests;
import zool.product.common.DecreaseStockInput;
import zool.product.dataobject.ProductInfo;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {

        List<ProductInfo> list = productService.findUpAll();

        assertTrue(list.size() > 0);

    }

    @Test
    public void findList(){
        List<ProductInfo> list = productService.findList
                (Arrays.asList("157875196366160022", "157875227953464068"));
        assertTrue(list.size() == 2);
    }

    @Test
    public void decreaseStock(){
        DecreaseStockInput decreaseStockInput = DecreaseStockInput.builder()
                .productId("157875196366160022")
                .productQuantity(2).build();
        productService.decreaseStockProcess(Arrays.asList(decreaseStockInput));
    }

}