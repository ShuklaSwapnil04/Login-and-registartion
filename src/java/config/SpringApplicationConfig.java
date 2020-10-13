package com.webapp.config;



import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.webapp")
public class SpringApplicationConfig implements WebMvcConfigurer{
	
	/*
	 * @Bean public InternalResourceViewResolver viewResolver() {
	 * InternalResourceViewResolver vc=new InternalResourceViewResolver();
	 * vc.setPrefix("/WEB-INF/jsp/"); vc.setSuffix(".jsp"); return vc; }
	 */
	 
public void configureViewResolvers(ViewResolverRegistry registry) {
	// TODO Auto-generated method stub
	registry.jsp("/WEB-INF/jsp/", ".jsp");
}

public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// TODO Auto-generated method stub
	registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics");
}


  @Bean DriverManagerDataSource getDataSource() { DriverManagerDataSource
  ds=new DriverManagerDataSource();
  ds.setDriverClassName("com.mysql.jdbc.Driver");
  ds.setUrl("jdbc:mysql://localhost:3306/wordcount"); 
  ds.setUsername("root");
  ds.setPassword("Root@123"); return ds; }
  
  @Bean public JdbcTemplate jdbcTemplate() { return new
  JdbcTemplate((javax.sql.DataSource) getDataSource()); }


}
	

