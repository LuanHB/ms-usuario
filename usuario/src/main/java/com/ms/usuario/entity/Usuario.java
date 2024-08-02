package com.ms.usuario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usr_usuario")
public class Usuario {

    @Id
    private String id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @PrePersist
    private void generatedId() {
        if (getId() == null) {
            setId(UUID.randomUUID().toString());
        }
    }

}

