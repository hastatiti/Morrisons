package com.morrisons.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="order")
public class Order {

	@Id
	@Column(name ="orderId")
	private String orderId;
	private String orderReferenceCode;
	private String messageId;
	@NotNull
	private String messageType;
	@NotNull
	private java.util.Date messageCreatedAt;
	@NotNull
	private String shipToLocationId;
	@NotNull
	private String shipToAddressName;
	@NotNull
	private String shipToAddressLine1;
	private String shipToAddressLine2;
	@NotNull
	private String shipToAddressCity;
	@NotNull
	private String shipToAddressState;
	@NotNull
	private String shipToAddressPostCode;
	@NotNull
	private String shipToAddressCountryCode;
	@NotNull
	private Date shipToDeliverAt;
	@NotNull
	private Date shipToDeliverLatestAt;
	
//	@OneToMany(mappedBy = "order", targetEntity = Items.class,
//			fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@OneToMany(targetEntity = Items.class,
	fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "orderId")
	@NotNull
	private Set<Items> items;
	
	public Order() {
		
	}
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderReferenceCode() {
		return orderReferenceCode;
	}

	public void setOrderReferenceCode(String orderReferenceCode) {
		this.orderReferenceCode = orderReferenceCode;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public java.util.Date getMessageCreatedAt() {
		return messageCreatedAt;
	}

	public void setMessageCreatedAt(java.util.Date messageCreatedAt) {
		this.messageCreatedAt = messageCreatedAt;
	}

	public String getShipToLocationId() {
		return shipToLocationId;
	}

	public void setShipToLocationId(String shipToLocationId) {
		this.shipToLocationId = shipToLocationId;
	}

	public String getShipToAddressName() {
		return shipToAddressName;
	}

	public void setShipToAddressName(String shipToAddressName) {
		this.shipToAddressName = shipToAddressName;
	}

	public String getShipToAddressLine1() {
		return shipToAddressLine1;
	}

	public void setShipToAddressLine1(String shipToAddressLine1) {
		this.shipToAddressLine1 = shipToAddressLine1;
	}

	public String getShipToAddressLine2() {
		return shipToAddressLine2;
	}

	public void setShipToAddressLine2(String shipToAddressLine2) {
		this.shipToAddressLine2 = shipToAddressLine2;
	}

	public String getShipToAddressCity() {
		return shipToAddressCity;
	}

	public void setShipToAddressCity(String shipToAddressCity) {
		this.shipToAddressCity = shipToAddressCity;
	}

	public String getShipToAddressState() {
		return shipToAddressState;
	}

	public void setShipToAddressState(String shipToAddressState) {
		this.shipToAddressState = shipToAddressState;
	}

	public String getShipToAddressPostCode() {
		return shipToAddressPostCode;
	}

	public void setShipToAddressPostCode(String shipToAddressPostCode) {
		this.shipToAddressPostCode = shipToAddressPostCode;
	}

	public String getShipToAddressCountryCode() {
		return shipToAddressCountryCode;
	}

	public void setShipToAddressCountryCode(String shipToAddressCountryCode) {
		this.shipToAddressCountryCode = shipToAddressCountryCode;
	}

	public Date getShipToDeliverAt() {
		return shipToDeliverAt;
	}

	public void setShipToDeliverAt(Date shipToDeliverAt) {
		this.shipToDeliverAt = shipToDeliverAt;
	}

	public Date getShipToDeliverLatestAt() {
		return shipToDeliverLatestAt;
	}

	public void setShipToDeliverLatestAt(Date shipToDeliverLatestAt) {
		this.shipToDeliverLatestAt = shipToDeliverLatestAt;
	}

	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderReferenceCode=" + orderReferenceCode + ", messageId=" + messageId
				+ ", messageType=" + messageType + ", messageCreatedAt=" + messageCreatedAt + ", shipToLocationId="
				+ shipToLocationId + ", shipToAddressName=" + shipToAddressName + ", shipToAddressLine1="
				+ shipToAddressLine1 + ", shipToAddressLine2=" + shipToAddressLine2 + ", shipToAddressCity="
				+ shipToAddressCity + ", shipToAddressState=" + shipToAddressState + ", shipToAddressPostCode="
				+ shipToAddressPostCode + ", shipToAddressCountryCode=" + shipToAddressCountryCode
				+ ", shipToDeliverAt=" + shipToDeliverAt + ", shipToDeliverLatestAt=" + shipToDeliverLatestAt
				+ ", items=" + items + "]";
	}
	public Order(String orderId, String orderReferenceCode, String messageId, @NotNull String messageType,
			java.util.Date messageCreatedAt, @NotNull String shipToLocationId, @NotNull String shipToAddressName,
			@NotNull String shipToAddressLine1, String shipToAddressLine2, @NotNull String shipToAddressCity,
			@NotNull String shipToAddressState, @NotNull String shipToAddressPostCode,
			@NotNull String shipToAddressCountryCode, @NotNull Date shipToDeliverAt, @NotNull Date shipToDeliverLatestAt,
			@NotNull Set<Items> items) {
		super();
		this.orderId = orderId;
		this.orderReferenceCode = orderReferenceCode;
		this.messageId = messageId;
		this.messageType = messageType;
		this.messageCreatedAt = messageCreatedAt;
		this.shipToLocationId = shipToLocationId;
		this.shipToAddressName = shipToAddressName;
		this.shipToAddressLine1 = shipToAddressLine1;
		this.shipToAddressLine2 = shipToAddressLine2;
		this.shipToAddressCity = shipToAddressCity;
		this.shipToAddressState = shipToAddressState;
		this.shipToAddressPostCode = shipToAddressPostCode;
		this.shipToAddressCountryCode = shipToAddressCountryCode;
		this.shipToDeliverAt = shipToDeliverAt;
		this.shipToDeliverLatestAt = shipToDeliverLatestAt;
		this.items = items;
	}
}