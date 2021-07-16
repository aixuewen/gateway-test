#!/bin/bash

# 只输出错误信息到日志文件
# nohup java -Dloader.path=.,lib -jar gateway-0.0.1-SNAPSHOT.jar  com.springcloud.GatewayApplication  >/dev/null 2>ratel-boot-test-error.log &

#nohup java -Dloader.path=.,lib -jar ../gateway-0.0.1-SNAPSHOT.jar com.springcloud.GatewayApplication >/dev/null 2>&1 &

#nohup java -Dloader.path=.,lib -jar ../gateway.jar com.springcloud.GatewayApplication  >/dev/null 2>ratel-boot-test-error.log &
nohup java -Dloader.path=.,lib -jar ../gateway-test.jar com.bonc.ProductApplication  > gateway_test.log &
