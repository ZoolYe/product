package zool.product.service;

import zool.product.common.DecreaseStockInput;
import zool.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架的商品列表
     * @return 返回在架的全部商品信息
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList 商品id
     * @return 通过商品id返回商品信息
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    List<ProductInfo> decreaseStockProcess(List<DecreaseStockInput> decreaseStockInputList);

}
