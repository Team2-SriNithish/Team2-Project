package com.team2.surplusfood.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "team2food") // Replace with your existing table name
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Replace with your column name if different
    private Long id;

    @Column(name = "category") // Replace with your column name if different
    private String category;

    @Column(name = "Description") // Replace with your column name if different
    private String Description;

    @Column(name = "quantity") // Replace with your column name if different
    private int quantity;

    @Column(name = "Post_Date") // Replace with your column name if different
    private LocalDate Post_date;

    @Column(name = "Expiry_Date") // Replace with your column name if different
    private LocalDate Expiry_date;

    @Column(name = "Quality") // Replace with your column name if different
    private String Quality;

    @Column(name = "Status") // Replace with your column name if different
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Getters and Setters
}

