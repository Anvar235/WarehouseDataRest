package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

    Integer getId();

    String getName();

    boolean getActive();
}
