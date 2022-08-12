package kg.megacom.sqltest.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)

@Entity
@Table(name="laptop")
public class Laptop {
    @Id
    Integer code;
    Integer  speed;
    Integer ram;
    Double hd;
    Double price;
    Integer screen;
    @ManyToOne
           @JoinColumn(name="model")
    Product product;

}
