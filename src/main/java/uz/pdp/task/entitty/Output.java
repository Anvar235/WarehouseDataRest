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
public class Output {

    @Id
    @GeneratedValue
    private Integer id;

    private Timestamp date;

    @ManyToOne
    private Warehouse warehouseId;

    @ManyToOne
    private Currency currencyId;

    private String factureNumber;

    private String code;

    @OneToOne
    private Client clientId;
}
