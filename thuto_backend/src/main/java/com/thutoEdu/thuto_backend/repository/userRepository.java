package com.thutoEdu.thuto_backend.repository;

import com.thutoEdu.thuto_backend.entity.user;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<user, Long> {
}
