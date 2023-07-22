package com.geekster.HotelManagementgeekster.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Room")
public class HotelRoom {

    @Id
    private Long roomId;

    @Column(unique = true)
    private Integer roomNumber;

    private Type roomType;

    private double roomPrice;

    @Column(name = "status")
    private Boolean roomStatus;
}
