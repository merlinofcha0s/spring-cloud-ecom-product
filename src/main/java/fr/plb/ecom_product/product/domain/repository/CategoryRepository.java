package fr.plb.ecom_product.product.domain.repository;

import fr.plb.ecom_product.product.domain.aggregate.Category;
import fr.plb.ecom_product.product.domain.vo.PublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryRepository {

  Page<Category> findAll(Pageable pageable);

  int delete(PublicId publicId);

  Category save(Category categoryToCreate);

}
