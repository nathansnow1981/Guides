package com.example.springsecurityexample.api.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue()
    @Column(name = "role_id", nullable = false)
    private Long roleId;

    @Column(name = "name")
    private String name;
}