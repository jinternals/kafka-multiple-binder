package com.jinternals.kafka.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.context.annotation.Primary;
import org.springframework.messaging.SubscribableChannel;

@Primary
public interface AccountStreams {

    public static String INPUT = "account";

    @Input(INPUT)
    public SubscribableChannel subscribableChannel();

}
