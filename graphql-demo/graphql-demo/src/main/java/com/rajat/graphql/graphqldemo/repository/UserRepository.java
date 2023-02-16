package com.rajat.graphql.graphqldemo.repository;

import com.rajat.graphql.graphqldemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
