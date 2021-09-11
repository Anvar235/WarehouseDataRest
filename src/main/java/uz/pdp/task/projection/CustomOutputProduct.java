package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Output;
import uz.pdp.task.entitty.OutputProduct;
import uz.pdp.task.entitty.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Product getProductId();

    Double getAmount();

    Double getPrice();

    Output getOutputId();
}
