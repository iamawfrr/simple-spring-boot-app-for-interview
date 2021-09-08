package com.ndev.springbootdemo.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "USERS")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "users.sequence", sequenceName = "SEQ_USERS", allocationSize = 1)
    private Long id;

    @Column (name = "FIRST_NAME")
    private String firstName;
    @Column (name = "LAST_NAME")
    private String lastName;


}
