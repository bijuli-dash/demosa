//package com.example.demos.config;
//
//import com.example.demos.functions.Services;
//import org.apache.catalina.servlets.WebdavServlet;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class userconfig{
//
//@Bean
//    public PasswordEncoder passwordencoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> requests
//                        .requestMatchers("/user", "/home","/registration","/Food","/consumption").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin((form) -> form
//                        .loginPage("/FT")
//                        .permitAll()
//                )
//                .logout(LogoutConfigurer::permitAll);
//
//
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userdetailsservice() {
//        UserDetails normaluser = User
//                        .withUsername("user")
//                        .password(passwordencoder().encode("password"))
//                        .roles("USER")
//                        .build();
//
//        UserDetails adminuser = User
//                .withUsername("Admin")
//                .password(passwordencoder().encode("admin"))
//                .roles("Admin")
//                .build();
//
//        return new InMemoryUserDetailsManager();
//    }
//}