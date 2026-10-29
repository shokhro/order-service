package uz.shokhro.orderservice;

public record Order (
        String orderId,
        String product,
        Integer quantity
){
}
