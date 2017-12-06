/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-02
 * Time: 13:59
 * Description:
 */
package com.example.thymeleaf.dao;

import com.example.thymeleaf.entity.Comment;
import com.example.thymeleaf.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
