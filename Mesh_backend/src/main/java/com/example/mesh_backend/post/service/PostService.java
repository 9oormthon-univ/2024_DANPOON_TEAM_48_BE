package com.example.mesh_backend.post.service;

import com.example.mesh_backend.post.dto.PostRequestDTO;
import com.example.mesh_backend.post.dto.PostResponseDTO;
import com.example.mesh_backend.post.entity.Post;
import com.example.mesh_backend.post.repository.PostRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public interface PostService {
    String createPost(  MultipartFile projectFile,
                        MultipartFile projectImage,
                        PostRequestDTO postRequestDTO,
                        Long userId) throws IOException;
    List<PostResponseDTO> getTop5Projects();
}
