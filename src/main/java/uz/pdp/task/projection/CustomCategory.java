package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    Category getParentCategoryId();

    boolean getActive();
}
