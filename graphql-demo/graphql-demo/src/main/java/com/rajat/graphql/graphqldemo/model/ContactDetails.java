package com.rajat.graphql.graphqldemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Contact_details")
public class ContactDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "cell_number")
    private String cellNumber;

    @Column(name = "addressLine1")
    private String addressLine1;

    @Column(name = "getAddressLine2")
    private String getAddressLine2;

    @Column(name = "pinCode")
    private String pinCode;

    @Column(name = "state")
    private String state;
}
