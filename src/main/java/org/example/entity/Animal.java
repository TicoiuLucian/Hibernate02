package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Animal {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(unique = true, name = "animal_name")
  private String name;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "caretaker_id")
  private Caretaker caretaker;

  public Animal(String name) {
    this.name = name;
  }

}
