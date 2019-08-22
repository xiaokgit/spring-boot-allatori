# spring-boot-allatori 混淆加密
### 添加个lib文件夹，添加allatori相关jar和配置文件.

#####allowtorr.xml文件中：
#####
    <!-- in指定混淆加密之前的jar,out指定加密后的jar -->
    <jar in="../target/demo-0.0.1-SNAPSHOT.jar" out="../target/demo-0.0.1-SNAPSHOT-obfuscated.jar"/>

#####
    <!-- 控制代码失效时间 -->
    <expiry date="2019/08/25" string="EXPIRED!"/>
    
    
    
######注意：目前测试了不支持SpringBoot 2.1.4以上的版本；1.5.9版本的支持