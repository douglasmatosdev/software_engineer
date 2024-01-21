/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author denis
 */
@Configuration
@EnableWebSecurity
public class ConfigSeguranca extends WebSecurityConfigurerAdapter {
                             // implements WebMvcConfigurer{

//    @Override
//    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
////    @Autowired
////    public void configureGlobal(final AuthenticationManagerBuilder auth) throws Exception {
//
//        // authentication manager
//        auth.inMemoryAuthentication()
//                .withUser("usu1").password("1234").roles("USER")
//                .and()
//                .withUser("admin").password("admin").roles("ADMIN");
//    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user
                = User.builder()
                        .username("usu1")
                        .password(passwordEncoder().encode("1234"))
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        // http builder configurations for authorize requests and form login (see below)

        /*http.csrf().disable().authorizeRequests()
            .antMatchers("/produtos/**").hasRole("USER")
            .antMatchers("/login*").permitAll()
            .antMatchers("/index*").anonymous()
            .anyRequest().authenticated();
         */
        http.authorizeRequests()
                .antMatchers("/", "/index").permitAll()
                .antMatchers("/produtos/**").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .httpBasic();
        http.csrf().disable();

    }
    
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").allowedMethods("*");
//    }
}
