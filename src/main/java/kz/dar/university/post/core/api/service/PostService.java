package kz.dar.university.post.core.api.service;

import kz.dar.university.post.core.api.model.PostRequest;
import kz.dar.university.post.core.api.model.PostResponse;

import java.util.List;

public interface PostService {
    PostResponse createPost(PostRequest PostRequest);
    PostResponse updatePostById(PostRequest PostRequest);
    PostResponse getPostById(String postId);
    List<PostResponse> getAllPosts();
    void deletePostById(String postId);
}
