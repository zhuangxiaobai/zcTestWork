//package com.zcwork.zfc.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.TestingAuthenticationToken;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
///**
// * @author Joe Grandja
// */
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    // @formatter:off
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
////
////                .authorizeRequests(authorize -> authorize
////                .antMatchers("/login").hasRole("dage")
////                .antMatchers("/index").hasRole("erge")
////
////
////                );
//
//
//                .authorizeRequests(authorize -> authorize
//                        .antMatchers("/css/**", "/index").permitAll()
//                        .antMatchers("/user/**").hasRole("USER")
//                )
//                .formLogin(formLogin -> formLogin
//                        .loginPage("/login")
//                        .failureUrl("/login-error")
//                );
//    }
//    // @formatter:on
//
//    @Override
//    @Bean
//    public UserDetailsService userDetailsService() {
////         SecurityContext context = SecurityContextHolder.createEmptyContext();
////         Authentication authentication =
////                 new TestingAuthenticationToken("username","password","role_user");
////         context.setAuthentication(authentication);
////         SecurityContextHolder.setContext(context);
//
//
//        UserDetails userDetails = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//        return new InMemoryUserDetailsManager(userDetails);
//
//    }
//
//
//
//
//
//}