package services;
import entity.Item;
import provider.ItemProvider;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
@Path("item")
public class ItemService {
    @POST
    @Path("create")
    @Consumes("application/json")
    @Produces("application/json")
    public Response createItem(Item item){
        try {
            ItemProvider provider = new ItemProvider();
            provider.createItem(item);
            return Response
                    .status(200)
                    .entity(item)
                    .build();
        }catch(Exception e){
            return Response
                    .status(500)
                    .entity(e.getMessage())
                    .build();
        }
    }
    @DELETE
    @Path("{order}/{product}/{amount}")
    @Produces("application/json")
    public Response deleteProduct(@PathParam("product") int productID, @PathParam("amount") int amount, @PathParam("order") int orderID){
        try {
            ItemProvider provider = new ItemProvider();
            Item item = provider.deleteProduct(productID,amount,orderID);
            return Response
                    .status(200)
                    .entity(item)
                    .build();
        }catch(Exception e){
            return Response
                    .status(500)
                    .entity(e.getMessage())
                    .build();
        }
    }
}