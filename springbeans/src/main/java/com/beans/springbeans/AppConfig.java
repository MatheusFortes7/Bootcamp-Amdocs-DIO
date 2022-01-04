package com.beans.springbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getlivro(){
        return new Livro();
    }
    // <bean id="livro" class="com.springbeans.Livro"/>

    @Bean
    public AutorLivro getautorLivro(){
        return new Autor();
    }
}
