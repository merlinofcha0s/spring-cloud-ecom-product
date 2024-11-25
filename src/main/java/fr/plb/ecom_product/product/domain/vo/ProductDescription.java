package fr.plb.ecom_product.product.domain.vo;

import fr.plb.ecom_product.shared.error.domain.Assert;

public record ProductDescription(String value) {

  public ProductDescription {
    Assert.field("value", value).notNull().minLength(10);
  }
}
