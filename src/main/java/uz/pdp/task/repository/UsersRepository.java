package uz.pdp.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task.entitty.Users;
import uz.pdp.task.projection.CustomUsers;

@RepositoryRestResource(path = "user", excerptProjection = CustomUsers.class)
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
