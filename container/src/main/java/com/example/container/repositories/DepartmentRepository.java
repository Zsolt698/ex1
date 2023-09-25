import com.example.myapp.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Custom query method to find a department by its name
    Department findByName(String name);

    // Custom query method to find departments by their descriptions containing a specific keyword
    List<Department> findByDescriptionContaining(String keyword);

    // You can add more custom query methods based on your requirements
}