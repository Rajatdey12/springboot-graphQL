package com.rajat.graphql.graphqldemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Transient
    private Integer age;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dob;

    @Column(name = "address")
    @OneToMany(fetch = FetchType.LAZY)
    private List<ContactDetails> contactDetails;
}
