package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Attachment;
import uz.pdp.task.entitty.Category;
import uz.pdp.task.entitty.Measurement;
import uz.pdp.task.entitty.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    Category getCategoryId();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurementId();

    boolean getActive();
}
