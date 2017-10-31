package com.bgtavares.landon.web.service;

import com.bgtavares.landon.business.domain.RoomReservation;
import com.bgtavares.landon.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ReservationServiceController {

    @Autowired
    private ReservationService reservationService;

    @RequestMapping(method= RequestMethod.GET, value="/reservation/{date}")
    public List<RoomReservation> getAllReservationsForDate(@PathVariable(value="date")String dateString) {
        return this.reservationService.getRoomReservationForDate(dateString);
    }
}
