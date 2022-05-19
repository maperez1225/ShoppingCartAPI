package services;
import entity.Item;
import entity.Order;
import provider.OrderProvider;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("order")
public class OrderService {
    @POST
    @Path("create")
    @Consumes("application/json")
    @Produces("application/json")
    public Response createOrder(Order order) {
        try {
            OrderProvider provider = new OrderProvider();
            provider.create(order);
            return Response
                    .status(200)
                    .entity(order)
                    .build();
        }catch(Exception e){
            return Response
                    .status(500)
                    .entity(e.getMessage())
                    .build();
        }
    }
    @POST
    @Path("update/{order}")
    @Produces("application/json")
    public Response setPaid(@PathParam("order") int id) {
        try {
            OrderProvider provider = new OrderProvider();
            provider.setPaid(id);
            return Response
                    .status(200)
                    .build();
        }catch(Exception e){
            return Response
                    .status(500)
                    .entity(e.getMessage())
                    .build();
        }
    }
    @GET
    @Path("get/{order}")
    @Produces("application/json")
    public Response getInfo(@PathParam("order") int id){
        try {
            OrderProvider provider = new OrderProvider();
            List<Item> items = provider.orderInfo(id);
            return Response
                    .status(200)
                    .entity(items)
                    .build();
        }catch(Exception e){
            return Response
                    .status(500)
                    .entity(e.getMessage())
                    .build();
        }
    }
}