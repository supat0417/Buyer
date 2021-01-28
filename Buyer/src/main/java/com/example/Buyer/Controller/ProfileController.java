package com.example.Buyer.Controller;

import com.example.Buyer.Entity.ProfileEntity;
import com.example.Buyer.Model.PaymentResponse;
import com.example.Buyer.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping(path = "/payment/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PaymentResponse> GetPaymentFromSeller(@PathVariable String id)
    {
        PaymentResponse response = profileService.GetPaymentFromSeller(id);
        if(response == null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            return ResponseEntity.ok(response);
        }
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProfileEntity> GetProfileById(@PathVariable String id)
    {
        ProfileEntity response = profileService.GetProfileById(id);

        if(response == null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            return ResponseEntity.ok(response);
        }
    }

    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProfileEntity>> GetAllProfile()
    {
        List<ProfileEntity> response = profileService.GetAllProfile();
        if(response == null)
        {
            return ResponseEntity.notFound().build();

        }
        else
        {
            return ResponseEntity.ok(response);
        }
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProfileEntity> AddProfile(@RequestBody ProfileEntity profileRequest)
    {
        ProfileEntity response = profileService.AddProfile(profileRequest);
        if(response == null)
        {
            return ResponseEntity.notFound().build();

        }
        else
        {
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> DeleteProfileById(@PathVariable String id){
        profileService.DeleteProfileById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ProfileEntity> updateProfileById(@PathVariable String id,
                                                           @RequestParam(name="profile_picture", required = false)String pic,
                                                           @RequestParam(name="firstname", required = false)String fname,
                                                           @RequestParam(name="lastname", required = false)String lname,
                                                           @RequestParam(name="email", required = false)String email,
                                                           @RequestParam(name="tel", required = false)Integer tel)
    {

        ProfileEntity response = profileService.updateProfileById(id,pic,fname,lname,email,tel);
        if(response == null)
        {
            return ResponseEntity.notFound().build();

        }
        else
        {
            return ResponseEntity.ok(response);
        }
    }


}