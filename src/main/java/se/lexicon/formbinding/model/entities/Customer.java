package se.lexicon.formbinding.model.entities;
import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import java.time.LocalDate;

@Entity
public class Customer {

    @Id
    @GenericGenerator(name = "uuidGenerator", strategy = "uuid")
    @GeneratedValue(generator = "uuidGenerator")
    private String customerID;
    private String email;
    private LocalDate regDate;
    private boolean active = true;
    @OneToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    private CustomerDetails details;

}
