package fr.plb.ecom_product.product.infrastructure.secondary.repository;

import fr.plb.ecom_product.product.infrastructure.secondary.entity.PictureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductPictureRepository extends JpaRepository<PictureEntity, Long> {
}
