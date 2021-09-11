package uz.pdp.task.entitty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Input {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private Timestamp date;

    @ManyToOne
    private Warehouse warehouseId;

    @ManyToOne
    private Supplier supplierId;

    @ManyToOne
    private Currency currencyId;

    @Column(nullable = false)
    private String factureNumber;

    @Column(nullable = false)
    private String code;

}
