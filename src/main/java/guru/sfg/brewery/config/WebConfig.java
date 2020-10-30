package guru.sfg.brewery.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").allowedMethods("GET", "POST", "PUT");
//    }

    //The above can simply be replaced at controller level with one annotation at class level or one or more annotations
    //at method level.  The annotation @CrossOrigin can stand on its own and allow everything or take in parameters for
    //more granular control (or filtering).  Refer to BeerRestController for example.

}
