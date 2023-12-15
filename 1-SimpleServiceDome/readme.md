### 单机服务
#### 第一步 引包
````xml
    <!--    第一步-->
<parent>
    <groupId>com.hlr.parent.msa.web</groupId>
    <artifactId>hlr-parent-msa-web</artifactId>
    <version>1.0.1-HLR</version>
</parent>
        <!--引入数据库连接-->
<dependencies>
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.49</version> <!-- 请检查是否有更新的版本 -->
</dependency>
</dependencies>

````
#### 第二步 编写启动类
````java
@SpringBootApplication
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class);
    }
    
}
````
#### 第三步 配置bootstrap.yaml
````yaml
server:
  port: 80
spring:
  application:
    name: testwebmsa
#    关闭nacos服务
  cloud:
    nacos:
      config:
        enabled: false
      discovery:
        enabled: false
        watch:
          enabled: false
# 关闭dubbo服务
dubbo:
  enabled: false

````
#### 配置数据库配置 db.prop 文件
````ini
[dbconfig]
watch=1
pool=druid

[config]
url=jdbc:mysql://m.local:3307/config?useUnicode=true&characterEncoding=UTF-8
username=root
password=123456qqq
maxconn=10
driver=org.gjt.mm.mysql.Driver
activetime=20000

````