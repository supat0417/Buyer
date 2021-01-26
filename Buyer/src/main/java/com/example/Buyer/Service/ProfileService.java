package com.example.Buyer.Service;

import com.example.Buyer.Entity.ProfileEntity;

import java.util.List;
import java.util.Optional;

public interface ProfileService {
    ProfileEntity GetProfileById(String id);

    ProfileEntity AddProfile(ProfileEntity profile);

    List<ProfileEntity> GetAllProfile();

    void DeleteProfileById(String id);


    ProfileEntity updateProfileById(String id, String pic, String fname, String lname, String email, Integer tel);
}
