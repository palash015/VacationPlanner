package com.example.VacationPlanner.Repository;

import com.example.VacationPlanner.Entity.Holiday;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HolidayRepository extends JpaRepository<Holiday, Long> {
    List<Holiday> findByCountryCodeAndDateBetween(String countryCode, LocalDate start, LocalDate end);
}

