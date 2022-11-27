package org.example;

import org.config.AppConfig;
import org.publisher.Colors;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Colors colors = context.getBean("colors", Colors.class);
        colors.streamShaktiman("Ep-08");
        colors.comedyShow("Ep-04");
    }
}
