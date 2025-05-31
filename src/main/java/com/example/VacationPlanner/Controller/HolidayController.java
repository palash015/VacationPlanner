package com.example.VacationPlanner.Controller;

import com.example.VacationPlanner.DTO.HolidayResponse;
import com.example.VacationPlanner.Service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;



@RestController
@RequestMapping("/holiday")
public class HolidayController {

    @Autowired
    HolidayService holidayService;

    @GetMapping("/")
    @ResponseBody
    public HolidayResponse getHolidays(
            @RequestParam(defaultValue = "INDIA") String country,
            @RequestParam String start,
            @RequestParam String end
    ) {
        LocalDate startDate = LocalDate.parse(start);
        LocalDate endDate = LocalDate.parse(end);

        return holidayService.getHolidays(country, startDate, endDate);
    }
}
