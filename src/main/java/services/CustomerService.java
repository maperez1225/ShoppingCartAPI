package services;

import model.Customer;
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
            Customer customer = provider.getCustomer(Long.parseLong(id));
            return Response
                    .ok(customer)
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
                    .ok(customer)
                    .header("Content-Type","application/json")
                    .build();
        }catch (Exception exception){
            return Response
                    .status(500)
                    .entity(exception.getMessage())
                    .header("Content-Type","application/json")
                    .build();
        }
    }
}
