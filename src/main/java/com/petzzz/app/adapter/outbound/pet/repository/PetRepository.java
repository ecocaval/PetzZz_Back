package com.petzzz.app.adapter.outbound.pet.repository;

import com.petzzz.app.adapter.outbound.pet.model.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PetRepository extends JpaRepository<PetModel, UUID> {
}
