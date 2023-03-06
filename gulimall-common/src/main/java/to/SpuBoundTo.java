package to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author SHshuo
 * @data 2023/3/6--9:53
 */
@Data
public class SpuBoundTo {

    private Long spuId;

    private BigDecimal buyBounds;

    private BigDecimal growBounds;

}