package ecomdashboard.in.ecomdashboard.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecomdashboard.in.ecomdashboard.entity.ProductCategory;


/**
 * Created by Ramjeet on 01/04/19.
 */
@Repository
@Qualifier(value = "productCategoryRepository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

    List<ProductCategory> findByBestCategory(boolean bestCategory);
}