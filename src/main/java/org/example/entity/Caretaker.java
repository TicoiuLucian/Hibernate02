package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Caretaker {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String caretakerName;

  private Integer age;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "caretaker")
  private List<Animal> animals = new ArrayList<>();

  public void addAnimal(Animal animal) {
    animal.setCaretaker(this);
    animals.add(animal);
  }
}
