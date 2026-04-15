package com.inventory.intentory_service.entities;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inventory {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false, unique = true)
  private String productId;

  @Column(nullable = false)
  private Integer available;

  @Column(nullable = false)
  private Integer reserved;

  @Version private Long version;
}
