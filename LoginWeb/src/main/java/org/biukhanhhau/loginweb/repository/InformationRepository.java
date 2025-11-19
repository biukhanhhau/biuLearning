package org.biukhanhhau.loginweb.repository;

import org.biukhanhhau.loginweb.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends JpaRepository<Information, Integer> {
    Information findByUsername(String username);
    Information findByEmail(String email);
}
