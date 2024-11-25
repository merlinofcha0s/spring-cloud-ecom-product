package fr.plb.ecom_product.product.domain.aggregate;


import fr.plb.ecom_product.product.domain.vo.ProductSize;
import fr.plb.ecom_product.product.domain.vo.PublicId;
import org.jilt.Builder;

import java.util.List;

@Builder
public record FilterQuery(PublicId categoryId, List<ProductSize> sizes) {
}
