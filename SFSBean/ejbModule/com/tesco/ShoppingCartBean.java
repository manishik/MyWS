package com.tesco;

import java.io.Serializable;
import java.util.HashMap;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.Remote;

@Stateful
@Remote(ShoppingCart.class)
public class ShoppingCartBean implements ShoppingCart, Serializable
{
   private HashMap<String, Integer> cart = new HashMap<String, Integer>();

   public void buy(String product, int quantity)
   {
      if (cart.containsKey(product))
      {
         int currq = cart.get(product);
         currq += quantity;
         cart.put(product, currq);
      }
      else
      {
         cart.put(product, quantity);
      }
   }

   public HashMap<String, Integer> getCartContents()
   {
      return cart;
   }

   @Remove
   public void checkout()
   {
      System.out.println("To be implemented");
   }

}
