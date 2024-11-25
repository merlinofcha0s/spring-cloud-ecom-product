package fr.plb.ecom_product.product.domain.vo;

import fr.plb.ecom_product.shared.error.domain.Assert;

public record OrderQuantity(long value) {

  public OrderQuantity {
    Assert.field("value", value).positive();

  }
}
