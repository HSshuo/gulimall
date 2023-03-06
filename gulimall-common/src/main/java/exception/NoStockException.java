package exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author SHshuo
 * @data 2023/3/6--9:50
 *
 * 无库存抛出异常
 */
public class NoStockException extends RuntimeException {

    @Getter
    @Setter
    private Long skuId;

    public NoStockException(Long skuId) {
        super("商品id："+ skuId + "库存不足！");
    }

    public NoStockException(String msg) {
        super(msg);
    }


}

