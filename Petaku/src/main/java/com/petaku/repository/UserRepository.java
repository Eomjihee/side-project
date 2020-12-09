package com.petaku.repository;

import org.springframework.data.repository.CrudRepository;

import com.petaku.vo.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
