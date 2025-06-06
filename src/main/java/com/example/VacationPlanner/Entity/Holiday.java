package com.example.VacationPlanner.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.time.LocalDate;


@Entity
public class Holiday {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate date;
    private String countryCode;

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Long getId() {
        return id;
    }
}