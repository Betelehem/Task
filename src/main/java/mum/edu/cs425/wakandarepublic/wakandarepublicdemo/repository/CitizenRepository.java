package mum.edu.cs425.wakandarepublic.wakandarepublicdemo.repository;

import mum.edu.cs425.wakandarepublic.wakandarepublicdemo.domin.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen,Long> {
    @Query(value="SELECT * FROM patient p ORDER BY p.last_name ", nativeQuery = true)
    public List<Citizen> orderbyAsc();
}
