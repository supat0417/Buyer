package com.example.Buyer;

import com.example.Buyer.Entity.ProductEntity;
import com.example.Buyer.Repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class AddProductTest {
    @Autowired
    private ProductRepository repo;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateProduct(){
        ProductEntity user = new ProductEntity();
        user.setProduct_name("Iphone3");
        user.setProduct_picture("3.png");
        user.setProduct_price(3000);
        user.setProduct_unit(10);
        user.setProduct_status("Stock");

        ProductEntity savedUser = repo.save(user);
        ProductEntity existUser = entityManager.find(ProductEntity.class,user.getProduct_id());

        assertThat(existUser.getProduct_name()).isEqualTo(user.getProduct_name());
    }


//
//    @Test
//    public void testGetProductListSuccess() throws URISyntaxException
//    {
//        RestTemplate restTemplate = new RestTemplate();
//
//        final String baseUrl = "http://localhost:8080"+"/buyer/product";
//        URI uri = new URI(baseUrl);
//
//        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
//
//        //Verify request succeed
//        //Assert.assertEquals(200, result.getStatusCodeValue());
//        //Assert.assertEquals(true, result.getBody().contains("employeeList"));
//
//        assertThat(200).isEqualTo(result.getStatusCodeValue());
//        assertThat(true).isEqualTo(result.getBody().contains("product"));
//
//    }

}
