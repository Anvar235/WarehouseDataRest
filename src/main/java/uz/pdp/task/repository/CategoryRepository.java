package uz.pdp.task.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task.projection.CustomCategory;

@RepositoryRestResource(path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepository {
}
