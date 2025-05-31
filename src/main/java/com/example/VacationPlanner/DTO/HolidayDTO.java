package com.example.VacationPlanner.DTO;


import java.time.LocalDate;


public class HolidayDTO {

    private String title;
    private String start; // FullCalendar expects this format

    public HolidayDTO(String title, LocalDate date) {
        this.title = title;
        this.start = date.toString();
    }

    public String getTitle() {
        return title;
    }

    public String getStart() {
        return start;
    }
}