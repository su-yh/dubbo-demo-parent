qos-server

> ```txt
> [INFO ]  [DUBBO] qos-server bind localhost:22222, dubbo version: 2.7.0, current host: 192.168.1.2
> ```
>
> 
>
> 

可以通过添加配置文件`dubbo.properties`来指定属性端口

> ```properties
> dubbo.application.qos.port=33333
> ```

也可以在`spring-provider.xml`配置文件中添加配置

> ```xml
>     <dubbo:application name="02-consumer-zk">
>         <dubbo:parameter key="qos.port" value="33333"/>
>     </dubbo:application>
> 
> ```



