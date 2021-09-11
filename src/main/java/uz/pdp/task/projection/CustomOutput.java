package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Client;
import uz.pdp.task.entitty.Currency;
import uz.pdp.task.entitty.Output;
import uz.pdp.task.entitty.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouseId();

    Currency getCurrencyId();

    String getFactureNumber();

    String getCode();

    Client getClientId();
}
