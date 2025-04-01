package com.Hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Hotel {
    @Id
    private String id;
    private String name;
    private String location;
    private String about;
}
