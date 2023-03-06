package to.mq;

import lombok.Data;

/**
 * @author SHshuo
 * @data 2023/3/6--9:56
 *
 * 发送到消息队列的to
 */
@Data
public class StockLockedTo {

    /**
     * 库存工作单的id
     **/
    private Long id;


    /**
     *  工作单详情的所有信息
     **/
    private StockDetailTo detailTo;
}