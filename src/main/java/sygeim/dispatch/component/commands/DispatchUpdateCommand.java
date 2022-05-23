package sygeim.dispatch.component.commands;

import io.micronaut.core.annotation.Introspected;

import java.util.Date;

@Introspected
public class DispatchUpdateCommand {

    private String capitanId;

    private String contactPhone;

    private String shipRegistration;

    private String destination;

    private String departurePort;

    private Date departureTime;

    private String tripReason;

    private Date arrivalTime;

    private Boolean deleted;

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

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
