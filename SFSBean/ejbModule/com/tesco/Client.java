package com.tesco;

import java.util.HashMap;
import javax.naming.InitialContext;
import com.tesco.ShoppingCart;

public class Client
{
   public static void main(String[] args) throws Exception
   {
	  System.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
	  System.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
	  System.setProperty("java.naming.provider.url", "jnp://localhost:1099");
	  
      InitialContext ctx = new InitialContext();
      ShoppingCart cart = (ShoppingCart) ctx.lookup("ShoppingCartBean/remote");

      System.out.println("Buying 1 memory stick");
      cart.buy("Memory stick", 1);
      System.out.println("Buying another memory stick");
      cart.buy("Memory stick", 1);

      System.out.println("Buying a laptop");
      cart.buy("Laptop", 1);
	   
	   System.out.println("Buying other laptop");
      cart.buy("Laptop", 1);

	  System.out.println("Buying one more laptop");
      cart.buy("Laptop", 1);

      System.out.println("Print cart:");
      HashMap<String, Integer> fullCart = cart.getCartContents();
      for (String product : fullCart.keySet())
      {
         System.out.println(fullCart.get(product) + "     " + product);
      }

      System.out.println("Checkout");
      cart.checkout();

      System.out.println("Should throw an object not found exception by invoking on cart after @Remove method");
      try
      {
         cart.getCartContents();
      }
      /*catch (javax.ejb.EJBNoSuchObjectException e)
      {
         System.out.println("Successfully caught no such object exception.");
      }*/
      catch (Exception e)
      {
         System.out.println("Successfully caught no such object exception.");
      }

   }
}
