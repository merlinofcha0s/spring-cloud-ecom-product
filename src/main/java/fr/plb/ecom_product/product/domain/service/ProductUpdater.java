package fr.plb.ecom_product.product.domain.service;


import fr.plb.ecom_product.product.domain.repository.ProductRepository;
import fr.plb.ecom_product.product.domain.vo.OrderProductQuantity;

import java.util.List;

public class ProductUpdater {

  private final ProductRepository productRepository;

  public ProductUpdater(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public void updateProductQuantity(List<OrderProductQuantity> orderProductQuantities) {
    for (OrderProductQuantity orderProductQuantity : orderProductQuantities) {
      productRepository.updateQuantity(orderProductQuantity.productPublicId(),
        orderProductQuantity.quantity().value());
    }
  }
}
