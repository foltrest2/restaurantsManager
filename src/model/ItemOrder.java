package model;

import java.io.Serializable;
import model.Product;
import model.Order;

public class ItemOrder implements Serializable{

	private static final long serialVersionUID = 1;
	private Product product;
	private Order order;

	/**
	 * This is the constructor of ItemOrder
	 * @param p Is the product
	 * @param o Is the order
	 * 
	 * <br>Precondition:</br> Product and order are not null
	 * <br>Postcondition:</br> ItemOrder created
	 */
	public ItemOrder(Product p, Order o) {
		product = p;
		order = o;
	}

	/**
	 * This method returns the product
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * This method returns the product
	 * @return the product
	 */
	public Order getOrder() {
		return order;
	}

}
