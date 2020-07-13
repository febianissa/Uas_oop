package phb2.repo;

import phb2.entity.DataMhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}
