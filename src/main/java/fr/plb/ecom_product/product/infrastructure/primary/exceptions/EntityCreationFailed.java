package fr.plb.ecom_product.product.infrastructure.primary.exceptions;

public class EntityCreationFailed extends RuntimeException {
  public EntityCreationFailed(String message) {
    super(message);
  }
}
