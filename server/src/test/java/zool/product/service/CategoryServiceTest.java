package zool.product.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zool.product.ProductApplicationTests;
import zool.product.dataobject.ProductCategory;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {

        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        assertTrue(list.size() > 0);
    }
}