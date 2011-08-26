/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in LineItem.java
* 
* It has been machine generated from fixtures and your changes will be
* lost if anything new needs to be added to the API. 
**/
// Last Generated: 2011-08-25T23:29:48-04:00
package com.shopify.api.resources;

import org.codehaus.jackson.annotate.JsonProperty;

/**
* This code has been machine generated by processing the single entry
* fixtures found from the Shopify API Documentation
*/
  
public class MGLineItem extends ShopifyResource {

	@JsonProperty("price")
	private String _price;
	public String getPrice(){ return _price;}
	public void setPrice(String _price){_price = this._price;}

	@JsonProperty("name")
	private String _name;
	public String getName(){ return _name;}
	public void setName(String _name){_name = this._name;}

	@JsonProperty("title")
	private String _title;
	public String getTitle(){ return _title;}
	public void setTitle(String _title){_title = this._title;}

	@JsonProperty("requires_shipping")
	private boolean _requires_shipping;
	public boolean getRequiresShipping(){ return _requires_shipping;}
	public void setRequiresShipping(boolean _requires_shipping){_requires_shipping = this._requires_shipping;}

	@JsonProperty("quantity")
	private int _quantity;
	public int getQuantity(){ return _quantity;}
	public void setQuantity(int _quantity){_quantity = this._quantity;}

	@JsonProperty("product_id")
	private int _product_id;
	public int getProductId(){ return _product_id;}
	public void setProductId(int _product_id){_product_id = this._product_id;}

	@JsonProperty("grams")
	private int _grams;
	public int getGrams(){ return _grams;}
	public void setGrams(int _grams){_grams = this._grams;}

	@JsonProperty("sku")
	private String _sku;
	public String getSku(){ return _sku;}
	public void setSku(String _sku){_sku = this._sku;}

	@JsonProperty("vendor")
	private String _vendor;
	public String getVendor(){ return _vendor;}
	public void setVendor(String _vendor){_vendor = this._vendor;}

	@JsonProperty("variant_title")
	private String _variant_title;
	public String getVariantTitle(){ return _variant_title;}
	public void setVariantTitle(String _variant_title){_variant_title = this._variant_title;}

	@JsonProperty("fulfillment_status")
	private String _fulfillment_status;
	public String getFulfillmentStatus(){ return _fulfillment_status;}
	public void setFulfillmentStatus(String _fulfillment_status){_fulfillment_status = this._fulfillment_status;}

	@JsonProperty("fulfillment_service")
	private String _fulfillment_service;
	public String getFulfillmentService(){ return _fulfillment_service;}
	public void setFulfillmentService(String _fulfillment_service){_fulfillment_service = this._fulfillment_service;}

	@JsonProperty("variant_id")
	private int _variant_id;
	public int getVariantId(){ return _variant_id;}
	public void setVariantId(int _variant_id){_variant_id = this._variant_id;}

}