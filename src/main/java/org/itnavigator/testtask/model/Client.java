package org.itnavigator.testtask.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
/**
 * Created by bender on 24.04.2017.
 */
@Entity
@Table(name="clients")
//@NamedQueries(
//@NamedQuery(name = Client.ALL_SORTED, query = "SELECT c FROM Client c LEFT JOIN  ORDER BY c.lastName DESC")
//)
public class Client extends BaseEntity{
//    public static final String ALL_SORTED = "Client.getAll";

    @Column(name="first_name",nullable=false)
    @NotBlank
    private String firstName;

    @Column(name="middle_name",nullable=false)
    @NotBlank
    private String middleName;

    @Column(name="last_name",nullable=false)
    @NotBlank
    private String lastName;

    @OneToOne
    @JoinColumn(name="id")
    private Phone phone;
    public Client() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
