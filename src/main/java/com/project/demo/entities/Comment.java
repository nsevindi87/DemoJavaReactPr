package com.project.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="comment")
@Data
public class Comment {
    @Id
    Long id;
    Long postId;
    Long UserId;

    @Lob
    @Column(columnDefinition="text")
    String text;
}
