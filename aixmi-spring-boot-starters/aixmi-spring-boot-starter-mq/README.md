## comsumer 配置
```properties
spring.application.name=rocketmq-consume-demo

rocketmq.name-server=localhost:9876
rocketmq.consumer.group=my-group1
rocketmq.consumer.topic=test
# properties used in application code
demo.rocketmq.topic=string-topic
demo.rocketmq.bytesRequestTopic=bytesRequestTopic
demo.rocketmq.stringRequestTopic=stringRequestTopic
demo.rocketmq.objectRequestTopic=objectRequestTopic
demo.rocketmq.genericRequestTopic=genericRequestTopic
demo.rocketmq.bytesRequestConsumer=bytesRequestConsumer
demo.rocketmq.stringRequestConsumer=stringRequestConsumer
demo.rocketmq.objectRequestConsumer=objectRequestConsumer
demo.rocketmq.genericRequestConsumer=genericRequestConsumer
demo.rocketmq.orderTopic=order-paid-topic
demo.rocketmq.msgExtTopic=message-ext-topic
demo.rocketmq.transTopic=spring-transaction-topic
demo.rocketmq.topic.user=user-topic
demo.rocketmq.tag=tagA

# another nameserver different global
demo.rocketmq.myNameServer=127.0.0.1:9876
```

## comsumer [示例](https://github.com/apache/rocketmq-spring/blob/master/rocketmq-spring-boot-samples/rocketmq-consume-demo/src/main/java/org/apache/rocketmq/samples/springboot/consumer/OrderPaidEventConsumer.java)
## producer 配置
```properties
rocketmq.name-server=Endpoint_of_Aliware_MQ
rocketmq.producer.group=my-group1
rocketmq.producer.access-key=AK
rocketmq.producer.secret-key=SK

demo.rocketmq.topic=normal_topic_define_in_Aliware_MQ
demo.rocketmq.transTopic=transaction_topic_define_in_Aliware_MQ
```
## producer [示例](https://github.com/apache/rocketmq-spring/blob/master/rocketmq-spring-boot-samples/rocketmq-produce-acl-demo/src/main/java/org/apache/rocketmq/samples/springboot/ProducerACLApplication.java)

## 快速开始 todo: