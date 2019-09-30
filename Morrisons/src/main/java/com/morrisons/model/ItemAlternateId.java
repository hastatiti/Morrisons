package com.morrisons.model;

import javax.persistence.Embeddable;

@Embeddable
public class ItemAlternateId {
	private String skuMin;
	private String skuPin;
	private String skuLegacy;
	private String barcodeAsin;
	private String barcodeEan;
	
	public ItemAlternateId() {
		
	}
	public String getSkuMin() {
		return skuMin;
	}
	public void setSkuMin(String skuMin) {
		this.skuMin = skuMin;
	}
	public String getSkuPin() {
		return skuPin;
	}
	public void setSkuPin(String skuPin) {
		this.skuPin = skuPin;
	}
	public String getSkuLegacy() {
		return skuLegacy;
	}
	public void setSkuLegacy(String skuLegacy) {
		this.skuLegacy = skuLegacy;
	}
	public String getBarcodeAsin() {
		return barcodeAsin;
	}
	public void setBarcodeAsin(String barcodeAsin) {
		this.barcodeAsin = barcodeAsin;
	}
	public String getBarcodeEan() {
		return barcodeEan;
	}
	public void setBarcodeEan(String barcodeEan) {
		this.barcodeEan = barcodeEan;
	}
	@Override
	public String toString() {
		return "ItemAlternateId [skuMin=" + skuMin + ", skuPin=" + skuPin + ", skuLegacy=" + skuLegacy
				+ ", barcodeAsin=" + barcodeAsin + ", barcodeEan=" + barcodeEan + "]";
	}
}
