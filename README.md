# Java中使用protobuf

## 参考文章

[Java 中使用 protobuf ：入门基础篇，看这篇就够了！](https://blog.csdn.net/wxw1997a/article/details/116755542)

[Java 中使用 protobuf ：复杂深入篇，看这篇就够了！](https://blog.csdn.net/wxw1997a/article/details/116758401)

## 环境配置

### protobuf编译器版本

我的protobuf编译器版本`3.20.3`


### 工具类

```java
package com.fire.protobuf.utils;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

/**
 * <ul> 注意：
 *  <li>该实现无法处理含有Any类型字段的Message</li>
 *  <li>enum类型数据会转化为enum的字符串名</li>
 *  <li>bytes会转化为utf8编码的字符串</li>
 * </ul> 以上这段暂未进行测试
 *
 * @author wuxiongwei
 * @date 2021/5/13 16:04
 * @Description proto 与 Json 转换工具类
 */
public class ProtoJsonUtil {
    /**
     * proto 对象转 JSON
     * 使用方法： //反序列化之后
     *             UserProto.User user1 = UserProto.User.parseFrom(user);
     *             //转 json
     *             String jsonObject = ProtoJsonUtil.toJson(user1);
     * @param sourceMessage proto 对象
     * @return 返回 JSON 数据
     * @throws InvalidProtocolBufferException
     */
    public static String toJson(Message sourceMessage) throws InvalidProtocolBufferException {
        if (sourceMessage != null) {
            String json = JsonFormat.printer().print(sourceMessage);
            return json;
        }
        return null;
    }

    /**
     * JSON 转 proto 对象
     * 使用方法：Message message = ProtoJsonUtil.toObject(UserProto.User.newBuilder(), jsonObject);
     * @param targetBuilder proto 对象 bulider
     * @param json          json 数据
     * @return 返回转换后的 proto 对象
     * @throws InvalidProtocolBufferException
     */
    public static Message toObject(Message.Builder targetBuilder, String json) throws InvalidProtocolBufferException {
        if (json != null) {
            //ignoringUnknownFields 如果 json 串中存在的属性 proto 对象中不存在，则进行忽略，否则会抛出异常
            JsonFormat.parser().ignoringUnknownFields().merge(json, targetBuilder);
            return targetBuilder.build();
        }
        return null;
    }
}



```



### maven配置

```xml
 <!--  protobuf 支持 Java 核心包-->
        <dependency>
            <groupId>com.google.protobuf</groupId>
            <artifactId>protobuf-java</artifactId>
            <!--            <version>3.15.3</version>-->
            <version>4.27.2</version>
        </dependency>


        <!--  proto 与 Json 互转会用到-->
        <dependency>
            <groupId>com.google.protobuf</groupId>
            <artifactId>protobuf-java-util</artifactId>
            <!--            <version>3.15.3</version>-->
            <version>4.27.2</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.30</version>
            <scope>provided</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.10.1</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.3.0</version> <!-- 请根据项目需要的版本调整 -->
        </dependency>

```

