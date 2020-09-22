package com.allarchi.allarchiproject.model.entities;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@NoArgsConstructor()
@EqualsAndHashCode(of = "id")
@ToString(of="id")
@SuppressWarnings("serial")
public class AbstractEntities implements Serializable {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
