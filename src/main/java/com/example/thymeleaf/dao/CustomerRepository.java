/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-02
 * Time: 13:59
 * Description:
 */
package com.example.thymeleaf.dao;

import com.example.thymeleaf.entity.Comment;
import com.example.thymeleaf.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findById(Integer id);
}
