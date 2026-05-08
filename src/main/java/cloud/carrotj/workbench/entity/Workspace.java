package cloud.carrotj.workbench.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;

@Getter
@Entity
@Table(name = "workspaces")
public class Workspace extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workspaces_id_gen")
    @SequenceGenerator(name = "workspaces_id_gen", sequenceName = "workspaces_id_seq", allocationSize = 1)
    @Column
    private Long id;

    @Column
    private String name;

    @Column(name = "deleted_at")
    private Instant deletedAt;
}