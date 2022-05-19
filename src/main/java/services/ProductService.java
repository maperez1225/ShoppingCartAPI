package services;
import entity.Product;
import provider.ProductProvider;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
@Path("product")
public class ProductService {
    @POST
    @Path("create")
    @Consumes("application/json")
    @Produces("application/json")
    public Response createProduct(Product product) {
        try {
            ProductProvider provider = new ProductProvider();
            provider.create(product);
            return Response
                    .status(200)
                    .entity(product)
                    .build();
        }catch (Exception e){
            return Response
                    .status(500)
                    .entity(e.getMessage())
                    .build();
        }
    }
}