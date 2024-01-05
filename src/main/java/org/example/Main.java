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
    Caretaker caretaker2 = new Caretaker();
    Caretaker caretaker3 = new Caretaker();

    caretaker.setAge(35);
    caretaker2.setAge(32);
    caretaker3.setAge(25);

    caretaker.setCaretakerName("Marcel");
    caretaker2.setCaretakerName("Ion");
    caretaker3.setCaretakerName("Vasi");


    caretaker.addAnimal(new Animal("Lion"));
    caretaker.addAnimal(new Animal("Tiger"));
    caretaker.addAnimal(new Animal("Bear"));
    caretaker.addAnimal(new Animal("Elephant"));
    caretaker.addAnimal(animal3);

    caretaker2.addAnimal(new Animal("Tiger2"));
    caretaker2.addAnimal(new Animal("Lion2"));
    caretaker2.addAnimal(new Animal("Bear2"));

    caretaker3.addAnimal(new Animal("Tiger3"));
    caretaker3.addAnimal(new Animal("Lion3"));
    caretaker3.addAnimal(new Animal("Bear3"));


    caretakerService.persist(caretaker);
    caretakerService.persist(caretaker2);
    caretakerService.persist(caretaker3);

  }
}