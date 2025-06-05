package com.rizwan.banking.repositories;

import com.rizwan.banking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
