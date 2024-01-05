package org.example;

import org.example.entity.Animal;
import org.example.entity.Caretaker;
import org.example.service.AnimalService;
import org.example.service.CaretakerService;
import org.example.service.Service;

public class Main {
  public static void main(String[] args) {

    Service<Caretaker> caretakerService = new CaretakerService();
    Service<Animal> animalService = new AnimalService();

    Animal animal3 = animalService.persist(new Animal("Pantera"));

    Caretaker caretaker = new Caretaker();
    caretaker.setAge(35);
    caretaker.setCaretakerName("Marcel");
    caretaker.addAnimal(new Animal("Lion"));
    caretaker.addAnimal(new Animal("Tiger"));
    caretaker.addAnimal(animal3);

    caretakerService.persist(caretaker);

  }
}