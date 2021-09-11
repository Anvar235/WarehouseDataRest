package uz.pdp.task.entitty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Category categoryId;

    @OneToOne
    private Attachment photo;

    @Column(nullable = false)
    private String code;

    @ManyToOne
    private Measurement measurementId;

    @Column(nullable = false)
    private boolean active;
}
