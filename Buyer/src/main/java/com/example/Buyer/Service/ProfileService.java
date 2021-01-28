package com.example.Buyer.Service;

import com.example.Buyer.Entity.ProfileEntity;
import com.example.Buyer.Model.PaymentResponse;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.List;

public interface ProfileService {
    ProfileEntity GetProfileById(String id);

    ProfileEntity AddProfile(ProfileEntity profile);

    List<ProfileEntity> GetAllProfile();

    void DeleteProfileById(String id);


    ProfileEntity updateProfileById(String id, String pic, String fname, String lname, String email, Integer tel);

    PaymentResponse GetPaymentFromSeller(String id);
}
