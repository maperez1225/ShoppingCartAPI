package services;
import entity.Customer;
import entity.CustomerData;
import provider.CustomerProvider;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
@Path("customer")
public class CustomerService {
    @GET
    @Path("get")
    @Produces("application/json")
    public Response getCustomer(@QueryParam("id") String id){
        try {
            CustomerProvider provider = new CustomerProvider();
            CustomerData data = provider.getData(Long.parseLong(id));
            return Response
                    .ok(data)
                    .header("Content-Type","application/json")
                    .build();
        } catch (Exception e) {
            return Response
                    .status(500)
                    .entity(e.getMessage())
                    .header("Content-Type","application/json")
                    .build();
        }
    }
    @POST
    @Path("create")
    @Produces("application/json")
    @Consumes("application/json")
    public Response createCustomer(Customer customer){
        try {
            CustomerProvider provider = new CustomerProvider();
            provider.create(customer);
            return Response
                    .status(200)
                    .entity(customer)
                    .build();
        }catch (Exception exception){
            return Response
                    .status(500)
                    .entity(exception.getMessage())
                    .build();
        }
    }
}