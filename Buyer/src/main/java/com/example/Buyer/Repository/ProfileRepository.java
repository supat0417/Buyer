package com.example.Buyer.Repository;

import com.example.Buyer.Entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntity,String> {
}
