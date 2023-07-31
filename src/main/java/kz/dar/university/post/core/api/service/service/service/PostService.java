package kz.dar.university.post.core.api.service.service.service;

import kz.dar.university.post.core.api.model.PostModel;
import java.util.List;

public interface PostService {

    void createPost(PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPostById(String postId);
    void updatePostById(PostModel postModel, String postId);
    void deletePostById(String postId);


}
