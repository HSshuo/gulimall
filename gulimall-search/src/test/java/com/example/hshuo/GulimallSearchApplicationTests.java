package com.example.hshuo;

import com.alibaba.fastjson.JSON;
import com.example.hshuo.config.GulimallElasticSearchConfig;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @author SHshuo
 * @data 2023/3/4--10:09
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallSearchApplicationTests {

    @Data
    @AllArgsConstructor
    class User{
        private String userName;
        private String gender;
        private Integer age;
    }

    @Autowired
    private RestHighLevelClient client;

    @Test
    public void contextLoads() {
        System.out.println(client);
    }

    /**
     * 测试存储数据到es中
     */
    @Test
    public void indexData() throws IOException {
//        创建存储对象
        IndexRequest indexRequest = new IndexRequest("users").id("1").source(
                JSON.toJSONString(new User("hshuo", "man",18)), XContentType.JSON
        );
//        发送保存
        IndexResponse index = client.index(indexRequest, GulimallElasticSearchConfig.COMMON_OPTIONS);
//        打印响应信息
        System.out.println(index);
    }
}
