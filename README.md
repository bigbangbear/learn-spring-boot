# learn-spring-boot
> 学习链接：http://www.ityouknow.com/springboot/2016/01/06/spring-boot-quick-start.html

### 1. 初始化项目

* [链接](http://www.ityouknow.com/springboot/2016/01/06/spring-boot-quick-start.html)
1. 添加依赖
```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-devtools</artifactId>
   <optional>true</optional>
</dependency>
<plugin>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-maven-plugin</artifactId>
   <configuration>
      <fork>true</fork> <!-- 如果没有该配置，devtools不会生效 -->
   </configuration>
</plugin>
```
2. 打开自动构建
File-Settings-Compiler-Build project automatically
3. ctrl + shift + alt + /,选择Registry,勾上 Compiler autoMake allow when app running
