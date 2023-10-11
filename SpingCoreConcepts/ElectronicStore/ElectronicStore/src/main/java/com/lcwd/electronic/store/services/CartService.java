package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.AddItemToCardRequest;
import com.lcwd.electronic.store.dtos.CartDto;

public interface CartService {

    //add item to cart
    //case1:
    //case2:


    CartDto addItemToCart(String userId, AddItemToCardRequest request);

    //remove item from cart:
    void removeItemFromCart(String userId,int cartItem);


    //remove all items from cart
    void clearCart(String userId);

    CartDto getCartByUser(String userId);

}
