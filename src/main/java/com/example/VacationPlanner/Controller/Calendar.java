package com.example.VacationPlanner.Controller;

import com.example.VacationPlanner.Service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calendar")
public class Calendar {

    @Autowired
    HolidayService holidayService;

    @GetMapping("/")
    public String getCalendar() {



        return "calendar";
    }


}