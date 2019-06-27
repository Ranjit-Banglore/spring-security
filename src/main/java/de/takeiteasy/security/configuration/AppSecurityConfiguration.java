package de.takeiteasy.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class AppSecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Autowired
    private UserDetailsService myUserDetailsService;

    @Bean
    public AuthenticationProvider authProvider(){
        DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
        provider.setUserDetailsService(myUserDetailsService);
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        provider.setHideUserNotFoundExceptions(false);
        return provider;
    }
    /*
    @BeanuserDetailsService
    @Override
    protected UserDetailsService userDetailsService() {
        List<UserDetails> users=new ArrayList<>();
        users.add(User.passwordEncoder().username("navin").password("1234").roles("USER")
                .build());
        return new InMemoryUserDetailsManager(users);
    }

    @userDetailsService
    public PasswordEncoder getPasswordEncoder(BCrypt bCrypt){
        return new BCryptPasswordEncoder(bCrypt);
    }*/


}
