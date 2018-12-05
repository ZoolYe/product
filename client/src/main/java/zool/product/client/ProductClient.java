package zool.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import zool.product.common.DecreaseStockInput;
import zool.product.common.ProductInfoOutput;

import java.util.List;

/**
 * @author：zoolye
 * @date：2018-12-02：14:58
 * @description：产品服务对外接口暴露
 */
@FeignClient(name = "product")
public interface ProductClient {

    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);

}
