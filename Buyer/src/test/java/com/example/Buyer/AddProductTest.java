package com.example.Buyer;

import com.example.Buyer.Entity.ProductEntity;
import com.example.Buyer.Repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

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
        user.setProduct_name("Iphone5");
        user.setProduct_picture("phone.png");
        user.setProduct_price(8000);
        user.setProduct_unit(20);
        user.setProduct_status("Stock");

        ProductEntity savedUser = repo.save(user);
        ProductEntity existUser = entityManager.find(ProductEntity.class,user.getProduct_id());

        assertThat(existUser.getProduct_name()).isEqualTo(user.getProduct_name());
    }

}
