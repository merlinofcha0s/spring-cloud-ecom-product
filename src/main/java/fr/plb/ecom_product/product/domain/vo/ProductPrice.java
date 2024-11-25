package fr.plb.ecom_product.product.domain.vo;

import fr.plb.ecom_product.shared.error.domain.Assert;

public record ProductPrice(double value) {

  public ProductPrice {
    Assert.field("value", value).min(0.1);
  }
}
