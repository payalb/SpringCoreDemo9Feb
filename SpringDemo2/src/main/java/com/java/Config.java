package com.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.java") //which package to look for classes annotated with stereotype annotation
public class Config {

}
