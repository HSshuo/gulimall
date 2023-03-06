# gulimall

# 介绍
- 本项目直接从谷粒商城高级篇入手

<br>
<br>

# ElasticSearch
# 介绍
- [官网](https://www.elastic.co/guide/en/elasticsearch/reference/7.4/term-level-queries.html)
- [安装可视化工具 Kibana](http://47.95.211.172:5601/app/kibana#/dev_tools/console?_g=())
- [IK 分词器替换原有分词器 standard](https://github.com/medcl/elasticsearch-analysis-ik)

<br>

#### 配置自定义分词器
- 修改 /usr/share/elasticsearch/plugins/ik/config/中的 IKAnalyzer.cfg.xml，将对应位置添加拓展字典地址
![alt](https://uploadfiles.nowcoder.com/images/20230303/630417200_1677809025766/D2B5CA33BD970F64A6301FA75AE2EB22)
- 字典可以通过 Nginx 挂在，参考[Docker 安装常用软件](https://blog.nowcoder.net/n/79e00de8ff334d448de4f63445e9a2ac)


<br>

#### 整合 SpringBoot
- 2022年结果这两个命运相反了,rest api要废弃了
- [参考](https://blog.csdn.net/qq_44306975/article/details/121432004)


<br>
<br>


# 参考
- [尚硅谷文档](https://www.aliyundrive.com/s/gf2feMq9K4i)





