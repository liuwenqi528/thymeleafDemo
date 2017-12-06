/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-02
 * Time: 13:59
 * Description:
 */
package com.example.thymeleaf.dao;

import com.example.thymeleaf.entity.Customer;
import com.example.thymeleaf.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
