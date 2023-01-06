//package org.doorb02;
//
//import yahoofinance.Stock;
//import yahoofinance.YahooFinance;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.io.IOException;
//
//@Path("/stocks")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//public class StockResource {
//
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return "Hello RESTEasy";
//    }
//
//
//    @Path("/{symbol}/latestPrice")
//    @GET
//    public Response stock(@PathParam("symbol") String symbol) throws IOException {
//        Stock stock = YahooFinance.get(symbol);
//
//        Response response = null;
//        if (stock == null) {
//            response = Response.status(Response.Status.NOT_FOUND).build();
//        } else {
//            StockLatestPriceResponse stockResponse = new StockLatestPriceResponse(stock.getSymbol(), stock.getQuote().getPrice());
//            response = Response.ok(stockResponse).build();
//        }
//        return response;
//    }
//}
