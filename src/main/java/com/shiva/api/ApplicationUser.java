package com.shiva.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//if you want  change the path @RepositoryRestResource(collectionResourceRel = "users",path = "users") in repository interface
// else it will take class name with lower case
public class ApplicationUser {
    @Id
    private int id;
    private String name;
    private String email;
}
