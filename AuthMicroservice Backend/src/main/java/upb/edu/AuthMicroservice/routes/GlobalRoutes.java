package upb.edu.AuthMicroservice.routes;

import static org.springframework.web.servlet.function.RouterFunctions.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class GlobalRoutes {

    @Autowired
    private RoleRoutes roleRoutes;

    @Bean
    public RouterFunction<ServerResponse> routerFunction() {
        return route()
                .path("api/roles", roleRoutes::roleRouter)
                .build();
    }

}
