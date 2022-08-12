package kg.megacom.sqltest.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "Pc")
public class Pc {
    @Id
    Integer code;
    Integer speed;
    Integer ram;
    Double hd;
    @Column(length = 10)
    String cd;
    Double price;
    @ManyToOne
    @JoinColumn(name = "model")
    Product product;


}
