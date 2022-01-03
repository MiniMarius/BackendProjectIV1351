package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.BookingData;
import se.kth.iv1351.openapi.model.Booking;

@Mapper
public interface BookingMapper {
    BookingData selectBooking(Integer bookingid);
    void insertBooking(Booking booking);
    void deleteBooking(Integer bookingid);
}
