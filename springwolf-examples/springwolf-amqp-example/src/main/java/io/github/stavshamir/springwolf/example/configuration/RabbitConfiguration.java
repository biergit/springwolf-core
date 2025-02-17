package io.github.stavshamir.springwolf.example.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableRabbit
@Configuration
public class RabbitConfiguration {

    // Required so that the Rabbit Listeners will be able to receive json serialized messages
    @Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public Queue exampleQueue() {
        return new Queue("example-queue", false);
    }

    @Bean
    public Queue anotherQueue() {
        return new Queue("another-queue", false);
    }

}
