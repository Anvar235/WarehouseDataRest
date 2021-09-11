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
public class InputProduct {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Product productId;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Timestamp expireDate;

    @ManyToOne
    private Input inputId;
}
