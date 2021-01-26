package com.example.Buyer.Service;


import com.example.Buyer.Entity.ProfileEntity;
import com.example.Buyer.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService{
    @Autowired
    public ProfileRepository profileRepository;

    @Override
    public ProfileEntity GetProfileById(String id) {
        //check if id null or emtpy (length<0)
        if(id == null || id.isEmpty())
        {
            //throw new IllegalStateException("Id Is Empty");
            return null;
        }
        // check if id is exists?
        Optional<ProfileEntity> profile = profileRepository.findById(id);
        if(profile.isEmpty())
        {
            // throw new IllegalStateException("Id Does Not Exists");
            return null;
        }
        return profile.get();
    }

    @Override
    public ProfileEntity AddProfile (ProfileEntity profile) {
        //maybe check if email already exists
        return profileRepository.save(profile);
    }

    @Override
    public List<ProfileEntity> GetAllProfile() {
        return profileRepository.findAll();
    }

    @Override
    public void DeleteProfileById(String id) {
        profileRepository.deleteById(id);
    }

    @Override
    @Transactional
    public ProfileEntity updateProfileById(String id, String pic, String fname, String lname, String email, Integer tel) {
        ProfileEntity profile;
        try{
            profile = profileRepository.findById(id).get();
        }
        catch(Exception ex)
        {
            //throw ex;
            return null;
        }
        if(pic !=null && !pic.isEmpty())
        {
            profile.setProfile_picture(pic);
        }
        if(fname !=null && !fname.isEmpty())
        {
            profile.setFirstname(fname);
        }
        if(lname !=null && !lname.isEmpty())
        {
            profile.setLastname(lname);
        }
        if(email !=null && !email.isEmpty())
        {
            profile.setEmail(email);
        }
        if(tel != null)
        {
            profile.setTel(tel);
        }
        return profile;
    }

}

