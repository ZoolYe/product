package zool.product.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author：zoolye
 * @date：2018-12-02：15:06
 * @description：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

}
