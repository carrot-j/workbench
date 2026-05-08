package cloud.carrotj.workbench.repository;

import cloud.carrotj.workbench.entity.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
}