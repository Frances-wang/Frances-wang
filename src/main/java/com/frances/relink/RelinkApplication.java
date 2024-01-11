package com.frances.relink;

import com.frances.relink.controllers.UrlController;
import com.frances.relink.models.Url;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RelinkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RelinkApplication.class, args);
        UrlController UrlController = context.getBean(UrlController.class);
        Url test_url = new Url("testtest");
        System.out.println(UrlController.getUrl(UrlController.saveUrl(test_url).getShortUrl()).getLongUrl());
        System.out.println(UrlController.saveUrl(test_url));
        Url test_duplicate = new Url("duplicate!");
        System.out.println(UrlController.saveUrl(test_duplicate, "5a671c6"));
    }

}
