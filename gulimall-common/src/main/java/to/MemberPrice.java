package to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author SHshuo
 * @data 2023/3/6--9:54
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}

