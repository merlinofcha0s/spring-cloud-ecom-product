package fr.plb.ecom_product.product.infrastructure.secondary.repository;

import fr.plb.ecom_product.product.domain.aggregate.Category;
import fr.plb.ecom_product.product.domain.repository.CategoryRepository;
import fr.plb.ecom_product.product.domain.vo.PublicId;
import fr.plb.ecom_product.product.infrastructure.secondary.entity.CategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDataCategoryRepository implements CategoryRepository {

  private final JpaCategoryRepository jpaCategoryRepository;

  public SpringDataCategoryRepository(JpaCategoryRepository jpaCategoryRepository) {
    this.jpaCategoryRepository = jpaCategoryRepository;
  }

  @Override
  public Page<Category> findAll(Pageable pageable) {
    return jpaCategoryRepository.findAll(pageable).map(CategoryEntity::to);
  }

  @Override
  public int delete(PublicId publicId) {
    return jpaCategoryRepository.deleteByPublicId(publicId.value());
  }

  @Override
  public Category save(Category categoryToCreate) {
    CategoryEntity categoryToSave = CategoryEntity.from(categoryToCreate);
    CategoryEntity categorySaved = jpaCategoryRepository.save(categoryToSave);
    return CategoryEntity.to(categorySaved);
  }
}
