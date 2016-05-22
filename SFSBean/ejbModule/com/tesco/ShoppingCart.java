package com.tesco;

import java.util.HashMap;
import javax.ejb.Remove;

public interface ShoppingCart
{
   void buy(String product, int quantity);

   HashMap<String, Integer> getCartContents();

   @Remove void checkout();
}
