package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Integer getId();

    String getName();

    boolean getActive();
}
