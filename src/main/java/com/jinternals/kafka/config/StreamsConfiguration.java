package com.jinternals.kafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({ AccountStreams.class, OrderStreams.class })
public class StreamsConfiguration {

}