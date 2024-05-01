package ru.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.webapp.model.Owner;
import ru.webapp.model.Pet;
import ru.webapp.service.OwnerService;
import ru.webapp.service.PetService;

@SpringBootApplication
public class MyApp {

    private final OwnerService ownerService;
    private final PetService petService;

    @Autowired
    public MyApp(OwnerService ownerService, PetService petService) {
        this.ownerService = ownerService;
        this.petService = petService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }

//    @Bean
//    public CommandLineRunner demo() {
//        return args -> {
//        // Здесь можно добавить код для тестирования вашего приложения
//        // Например, вызвать методы вашего сервиса для создания, чтения,
//        // обновления и удаления данных и выводить результаты на консоль
//
//        // Пример:
//            Owner owner = new Owner();
//            owner.setName("John");
//            owner.setEmail("john@example.com");
//            owner.setPhone("123456789");
//            ownerService.createOwner(owner);
//
//            Pet pet = new Pet();
//            pet.setOwner(owner);
//            pet.setName("Fido");
//            pet.setAnimalType("Dog");
//            pet.setBreed("Golden Retriever");
//            pet.setAge(3);
//            pet.setVaccinations("All");
//            petService.createPet(pet);
//
//            Owner savedOwner = ownerService.getOwnerById(owner.getId());
//            System.out.println("Saved Owner: " + savedOwner);
//
//            Pet savedPet = petService.getPetById(pet.getId());
//            System.out.println("Saved Pet: " + savedPet);
//        };
//    }
}
