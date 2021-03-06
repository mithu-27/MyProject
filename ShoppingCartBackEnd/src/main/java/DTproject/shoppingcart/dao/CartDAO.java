package DTproject.shoppingcart.dao;

import java.util.List;

import DTproject.shoppingcart.domain.Cart;

public interface CartDAO {
	
	//add a product to cart
	
	public boolean save(Cart cart);
	
	public boolean update(Cart cart);
	
	public boolean update(List<Cart> carts, char status);
	
	public boolean delete(int id);
	
	
	
	
	
	//get my products which added to mycart
	//select * from Cart where emailID = ?
	public  List<Cart>  list(String emailID);
	
	//get cart by cart id;
	
	public Cart    get(int id);
	
	//get cart by email ID
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	


