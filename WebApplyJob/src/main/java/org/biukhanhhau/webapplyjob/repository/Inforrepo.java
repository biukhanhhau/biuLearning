package org.biukhanhhau.webapplyjob.repository;

import org.biukhanhhau.webapplyjob.Information;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Inforrepo extends JpaRepository<Information, Integer> {

}

