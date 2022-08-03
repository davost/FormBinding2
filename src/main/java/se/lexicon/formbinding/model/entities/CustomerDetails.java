package se.lexicon.formbinding.model.entities;
import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@Entity
public class CustomerDetails {
    @Id
    //@GeneratedValue(strategy = )
    @GenericGenerator(name = "uuidGenerator", strategy = "uuid")
    @GeneratedValue(generator = "uuidGenerator")
    private String detailsID;

    private  String street, zipCode, city, homePhone, cellPhone;

}
