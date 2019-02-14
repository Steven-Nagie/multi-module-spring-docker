package com.steven.nagie.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    ApiConfiguration.class
})
public class ITConfig {
}
