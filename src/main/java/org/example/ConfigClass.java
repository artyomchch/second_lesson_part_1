package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("org.example")
@PropertySource("figure.properties")
public class ConfigClass {
}
