package se.lexicon.workshop_spring_boot.entity_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.lexicon.workshop_spring_boot.entity.AppUser;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class AppUserTest {

//    @Autowired // field dependency injection
//    AppUser testObject;
//
//
//    @BeforeEach
//    public void setup() {
//
//
//    }

    @Test
    @DisplayName("Test1 : Getters And Setters")
    public void test1() {

        AppUser appUser = new AppUser();

        appUser.setFirstName("Ola");
        appUser.setLastName("Ulvås");
        appUser.setEmail("ola@home.se");

        String expectedEmail = "ola@home.se";
        String actualEmail = appUser.getEmail();
        Assertions.assertEquals(expectedEmail, actualEmail);

        String expectedFirstName = "Ola";
        String actualFirstName = appUser.getFirstName();
        Assertions.assertEquals(expectedEmail, actualEmail);

        String expectedLastName = "Ulvås";
        String actualLastName = appUser.getLastName();
        Assertions.assertEquals(expectedEmail, actualEmail);
    }
}