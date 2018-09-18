package ProjectSpring.Repository;

import ProjectSpring.model.Projectmodel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "projectModel", path = "Project")
public interface ProjectRepository extends PagingAndSortingRepository<Projectmodel, Long> {

    List<Projectmodel> findByLastName(@Param("name") String name);
}
