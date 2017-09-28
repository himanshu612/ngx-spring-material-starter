package com.ngxspring.starter.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
@AllArgsConstructor
public class User {

    @Id
    private UUID id;

    private String name;

    private String email;

    private String userName;

    private String password;

}
