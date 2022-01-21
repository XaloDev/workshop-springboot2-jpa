package com.xalodev.course.repositories;

import com.xalodev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
