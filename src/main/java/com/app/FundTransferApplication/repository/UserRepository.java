package com.app.FundTransferApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.FundTransferApplication.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
