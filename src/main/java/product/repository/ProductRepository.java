package product.repository;

import member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import product.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
