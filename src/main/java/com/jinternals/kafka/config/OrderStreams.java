package com.jinternals.kafka.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.context.annotation.Primary;
import org.springframework.messaging.SubscribableChannel;

@Primary
public interface OrderStreams {

    public static String INPUT = "order";

    @Input(INPUT)
    public SubscribableChannel subscribableChannel();

}
