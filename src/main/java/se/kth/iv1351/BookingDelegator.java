package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.BookingMapper;
import se.kth.iv1351.openapi.BookingApiDelegate;
import se.kth.iv1351.openapi.model.Booking;

@AllArgsConstructor
@Service
public class BookingDelegator implements BookingApiDelegate {
    BookingMapper bookingMapper;

    @Override
    public ResponseEntity<Booking> bookingBookingidGet(Integer bookingid) {
        return BookingApiDelegate.super.bookingBookingidGet(bookingid);
    }
}
