package com.morrisons.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Items {
	
	@Id
	private String itemId;
	@NotNull
	private int itemLineId;
	@NotNull
	private String itemBaseType;
	@NotNull
	private String itemDescription;
	@NotNull
	private String quantityType;
	@NotNull
	private int quantityOrdered;
	@NotNull
	private String priceOrderedCurrency;
	@NotNull
	private int priceOrderedAmount;
	@NotNull
	private int priceOrderedTaxRate;
	
	@ManyToOne
	@JoinColumn(name="orderId",referencedColumnName = "orderId")
	private Order order;
	
	@Embedded
	private ItemAlternateId itemAlternateId;
	
	public Items() {
		
	}
	
	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public int getPriceOrderedAmount() {
		return priceOrderedAmount;
	}

	public void setPriceOrderedAmount(int priceOrderedAmount) {
		this.priceOrderedAmount = priceOrderedAmount;
	}

	public int getPriceOrderedTaxRate() {
		return priceOrderedTaxRate;
	}

	public void setPriceOrderedTaxRate(int priceOrderedTaxRate) {
		this.priceOrderedTaxRate = priceOrderedTaxRate;
	}

	public ItemAlternateId getItemAlternateId() {
		return itemAlternateId;
	}

	public void setItemAlternateId(ItemAlternateId itemAlternateId) {
		this.itemAlternateId = itemAlternateId;
	}

	public int getItemLineId() {
		return itemLineId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getQuantityType() {
		return quantityType;
	}

	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}

	public String getPriceOrderedCurrency() {
		return priceOrderedCurrency;
	}

	public void setPriceOrderedCurrency(String priceOrderedCurrency) {
		this.priceOrderedCurrency = priceOrderedCurrency;
	}

	public void setItemLineId(int itemLineId) {
		this.itemLineId = itemLineId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemBaseType() {
		return itemBaseType;
	}

	public void setItemBaseType(String itemBaseType) {
		this.itemBaseType = itemBaseType;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemLineId=" + itemLineId + ", itemBaseType=" + itemBaseType
				+ ", itemDescription=" + itemDescription + ", quantityType=" + quantityType + ", quantityOrdered="
				+ quantityOrdered + ", priceOrderedCurrency=" + priceOrderedCurrency + ", priceOrderedAmount="
				+ priceOrderedAmount + ", priceOrderedTaxRate=" + priceOrderedTaxRate + ", order=" + order
				+ ", itemAlternateId=" + itemAlternateId + "]";
	}
}
