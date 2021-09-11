package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Currency;
import uz.pdp.task.entitty.Input;
import uz.pdp.task.entitty.Supplier;
import uz.pdp.task.entitty.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouseId();

    Supplier getSupplierId();

    Currency getCurrencyId();

    String getFactureNumber();

    String getCode();
}
