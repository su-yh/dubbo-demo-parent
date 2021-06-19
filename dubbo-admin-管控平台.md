dubbo 管控平台

## 下载

> 链接:  https://github.com/apache/incubator-dubbo-ops
>
> 自动给我跳转到了：https://github.com/apache/dubbo-admin
>
> 直接下载压缩包
>
> 我这里已经下载好了，`dubbo-admin-develop.zip`

## 编译-打包

> 解压`dubbo-admin-develop.zip`
>
> 我主机存放的位置在`D:\dubbo\dubbo-admin-develop`
>
> 进入到主目录(`D:\dubbo\dubbo-admin-develop`)，执行命令
>
> ```cmd
> mvn clean package -DskipTests
> ```
>
> 打包出来的包在`D:\dubbo\dubbo-admin-develop\dubbo-admin-distribution\target\dubbo-admin-0.3.0-SNAPSHOT.jar`
>
> 通过以下命令指定zookeeper 启动
>
> 并且指定默认用户名和密码: root/root
>
> ```cmd
> java -Dadmin.registry.address=zookeeper://zkOS:2181 -Dadmin.config-center=zookeeper://zkOS:2181 -Dadmin.metadata-report.address=zookeeper://zkOS:2181 -Dadmin.root.user.name=root -Dadmin.root.user.password=root -jar dubbo-admin-0.3.0-SNAPSHOT.jar
> ```
>
> 记得提前启动好zookeeper.

## 访问

> `localhost:8080`