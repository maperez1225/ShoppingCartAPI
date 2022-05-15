package config;
import services.CustomerService;
import services.OrderService;
import services.ProductService;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;
@ApplicationPath("api")
public class ApplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> res = new HashSet<>();
        res.add(CustomerService.class);
        res.add(ProductService.class);
        res.add(OrderService.class);
        return res;
    }
}