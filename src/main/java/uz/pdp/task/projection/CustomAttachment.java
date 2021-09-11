package uz.pdp.task.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task.entitty.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {

    Integer getId();

    String getName();

    String getSize();

    String getContentType();

}
