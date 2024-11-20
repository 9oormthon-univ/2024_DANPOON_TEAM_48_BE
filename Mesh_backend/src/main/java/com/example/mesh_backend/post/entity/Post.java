package com.example.mesh_backend.post.entity;

import com.example.mesh_backend.login.entity.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "post")
@Data
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "project_title", nullable = false)
    private String projectTitle;

    @Column(name = "project_contents", nullable = false)
    private String projectContents;

    @Column(name = "project_file")
    private String projectFile;

    @Column(name = "views", columnDefinition = "BIGINT default 0")
    private Long views;

    @Column(name = "deadline", nullable = false)
    private LocalDate deadline;

    @Column(name = "create_at", updatable = false)
    private LocalDate createAt;

    @Column(name = "pm_best")
    private String pmBest;

    @Column(name = "design_best")
    private String designBest;

    @Column(name = "back_best")
    private String backBest;

    @Column(name = "front_best")
    private String frontBest;

    @Column(name = "pm_category")
    private String pmCategory;

    @Column(name = "design_category")
    private String designCategory;

    @Column(name = "back_category")
    private String backCategory;

    @Column(name = "front_category")
    private String frontCategory;

    @Column(name = "status")
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}