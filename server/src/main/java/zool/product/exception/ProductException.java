package zool.product.exception;

import zool.product.enums.ResultEnum;

/**
 * @author：zoolye
 * @date：2018-12-01：23:28
 * @description：商品服务异常
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
