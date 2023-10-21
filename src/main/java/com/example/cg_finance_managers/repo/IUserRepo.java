package com.example.cg_finance_managers.repo;

import com.example.cg_finance_managers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUserRepo extends JpaRepository<User,Long> {
}
