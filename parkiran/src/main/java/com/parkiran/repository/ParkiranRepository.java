package com.parkiran.repository;

import com.parkiran.model.ModelParkiran;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hadin
 */

@Repository
public interface ParkiranRepository extends JpaRepository<ModelParkiran, Long> {
    Optional<ModelParkiran> findByPlatNomor(String platNomor);
}
