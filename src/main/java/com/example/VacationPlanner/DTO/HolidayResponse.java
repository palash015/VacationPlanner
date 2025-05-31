package com.example.VacationPlanner.DTO;

import lombok.Data;


import java.util.*;


public class HolidayResponse {

    private List<HolidayDTO> events;
    private Map<String, Integer> weekHolidayCounts;

    public HolidayResponse(List<HolidayDTO> events, Map<String, Integer> weekHolidayCounts) {
        this.events = events;
        this.weekHolidayCounts = weekHolidayCounts;
    }

    public List<HolidayDTO> getEvents() {
        return events;
    }

    public Map<String, Integer> getWeekHolidayCounts() {
        return weekHolidayCounts;
    }
}
