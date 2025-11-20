package com.example.Trufbooking.entity;

import java.util.List;
import java.util.Map;

public class AdminControlDTO {
    private List<Booking> bookingList;
    private List<Map<String,Object>> slotTimings;

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public List<Map<String,Object>> getSlotTimings() {
        return slotTimings;
    }

    public void setSlotTimings(List<Map<String,Object>> slotTimings) {
        this.slotTimings = slotTimings;
    }
}
