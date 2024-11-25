package fr.plb.ecom_product.product.domain.vo;


import fr.plb.ecom_product.shared.error.domain.Assert;

public record ProductBrand(String value) {

  public ProductBrand {
    Assert.field("value", value).notNull().minLength(3);
  }
}
