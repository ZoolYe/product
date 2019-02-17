package zool.product.enums;

import lombok.Getter;

/**
 * @author：zoolye
 * @date：2018-12-01：23:32
 * @description：
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_ERROR(2,"库存不足"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
