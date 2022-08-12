package kg.megacom.sqltest.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)

@Entity
@Table(name="printer")

public class Printer {
    @Id
    Integer code;
    @Column(length = 50)
    String type;
    char color;


    double price;
    @ManyToOne
            @JoinColumn(name="model")
    Product product;
}
