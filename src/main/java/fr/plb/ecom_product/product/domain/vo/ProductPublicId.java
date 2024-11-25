package fr.plb.ecom_product.product.domain.vo;

import fr.plb.ecom_product.shared.error.domain.Assert;

import java.util.UUID;

public record ProductPublicId(UUID value) {

  public ProductPublicId {
    Assert.notNull("value", value);
  }
}
