//package top.luchchuan.health.config;
//
//import com.itheima.health.userdetailservice.JWTAuthenticationFilter;
//import com.itheima.health.userdetailservice.JWTAuthorizationFilter;
//import com.itheima.health.userdetailservice.JwtProperties;
//import com.itheima.health.userdetailservice.MyUserDetailServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)//  开启spring  security 权限注解
//@EnableConfigurationProperties(JwtProperties.class)
//public class MySecurityConfigurationAdpater  extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private MyUserDetailServiceImpl myUserDetailService;
//
//    @Autowired
//    private JwtProperties jwtProperties;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //  数据库 认证和授权
//        auth.userDetailsService(myUserDetailService).passwordEncoder(createPasswordEncoder());
//
//    }
//
//    //   创建 密码加密器对象
//    @Bean
//    public PasswordEncoder  createPasswordEncoder(){
//        return  new BCryptPasswordEncoder();
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().
//                disable().
//                addFilter(new JWTAuthenticationFilter(super.authenticationManager(),jwtProperties))
//                .addFilter(new JWTAuthorizationFilter(super.authenticationManager(),jwtProperties))
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS); // 禁用session
//    }
//
//}
