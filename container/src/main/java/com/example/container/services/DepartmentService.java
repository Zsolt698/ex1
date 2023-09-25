import com.example.myapp.models.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<Department> getAllDepartments();

    Department createDepartment(Department department);

    Optional<Department> getDepartmentById(Long id);

    Department updateDepartment(Long id, Department updatedDepartment);

    void deleteDepartment(Long id);
}