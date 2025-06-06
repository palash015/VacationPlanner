package com.example.VacationPlanner.Service;


import com.example.VacationPlanner.DTO.HolidayDTO;
import com.example.VacationPlanner.DTO.HolidayResponse;
import com.example.VacationPlanner.Entity.Holiday;
import com.example.VacationPlanner.Repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class HolidayService {

    @Autowired
    private HolidayRepository repository;

    public HolidayResponse getHolidays(String country, LocalDate start, LocalDate end) {
        List<Holiday> holidays = repository.findByCountryCodeAndDateBetween(country, start, end);

        List<HolidayDTO> events = holidays.stream()
                .map(h -> new HolidayDTO(h.getTitle(), h.getDate()))
                .toList();

        Map<String, Integer> weekHolidayCounts = new HashMap<>();
        WeekFields weekFields =  WeekFields.of(DayOfWeek.SUNDAY, 1);

        for (Holiday h : holidays) {
            int week = h.getDate().get(weekFields.weekOfWeekBasedYear());
            weekHolidayCounts.put(String.valueOf(week),
                    weekHolidayCounts.getOrDefault(String.valueOf(week), 0) + 1);
        }

        return new HolidayResponse(events, weekHolidayCounts);
    }
}

