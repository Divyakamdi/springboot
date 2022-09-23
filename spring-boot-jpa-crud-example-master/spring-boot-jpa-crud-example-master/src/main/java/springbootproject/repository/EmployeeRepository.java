package springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
