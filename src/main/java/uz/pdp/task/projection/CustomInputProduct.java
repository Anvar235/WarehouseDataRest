package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Input;
import uz.pdp.task.entitty.InputProduct;
import uz.pdp.task.entitty.Product;

import java.sql.Timestamp;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Product getProductId();

    Double getAmount();

    Double getPrice();

    Timestamp getExpireDate();

    Input getInputId();
}
