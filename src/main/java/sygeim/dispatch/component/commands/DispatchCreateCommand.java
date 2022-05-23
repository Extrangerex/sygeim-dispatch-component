package sygeim.dispatch.component.commands;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Introspected
public class DispatchCreateCommand {
    @NotNull
    private String capitanId;

    private String contactPhone;

    @NotNull
    private String shipRegistration;

    @NotNull
    private String destination;

    @NotNull
    private String departurePort;

    @NotNull
    private Date departureTime;

    @NotNull
    private String tripReason;

    @NotNull
    private Date arrivalTime;

    public String getCapitanId() {
        return capitanId;
    }

    public void setCapitanId(String capitanId) {
        this.capitanId = capitanId;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getShipRegistration() {
        return shipRegistration;
    }

    public void setShipRegistration(String shipRegistration) {
        this.shipRegistration = shipRegistration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getTripReason() {
        return tripReason;
    }

    public void setTripReason(String tripReason) {
        this.tripReason = tripReason;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
