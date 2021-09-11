package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Integer getId();

    String getName();

    boolean getActive();
}
