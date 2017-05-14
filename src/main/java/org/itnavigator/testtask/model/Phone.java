package org.itnavigator.testtask.model;

import org.hibernate.validator.constraints.NotBlank;
import sun.text.normalizer.UTF16;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="phones",uniqueConstraints ={@UniqueConstraint(columnNames={"client_id", "number"},
       name = "phones_unique_client_number_idx")})

@NamedQueries({@NamedQuery(name = Phone.ALL_SORTED, query = "SELECT p FROM Phone p  JOIN FETCH p.client ORDER BY p.client.lastName"),
@NamedQuery(name = Phone.UPDATE, query = "UPDATE Phone p SET p.number=?1,p.description=?2,p.comments=?3 WHERE p.id=?4")
})
public class Phone extends BaseEntity{
    public static final String UPDATE="Phone.update";
    public static final String ALL_SORTED = "Phone.getAll";

    @Column(name="number", nullable = false)
    @NotBlank
//    But doesn't work yet
    @Pattern(regexp="\\d-(\\d{3})-(\\d{3})-(\\d{4})")
    private String number;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="comments")
    @NotNull
    private String comments;

    @OneToOne
    //    Eager by default
    @JoinColumn(name="client_id")
    private Client client;

    public Phone() {}

    public Phone(int id, String number, String description, String comments) {
        super(id);
        this.number = number;
        this.description = description;
        this.comments = comments;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
                return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String commetnts) {
        this.comments = commetnts;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", description='" + description + '\'' +
                ", comments='" + comments + '\'' +
                ", client=" + client +
                '}';
    }
}