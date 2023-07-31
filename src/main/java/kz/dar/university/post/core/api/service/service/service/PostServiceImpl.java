package kz.dar.university.post.core.api.service.service.service;

import kz.dar.university.post.core.api.model.PostModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Override
    public void createPost(PostModel postModel) {

    }

    @Override
    public List<PostModel> getAllPosts() {
        return null;
    }

    @Override
    public PostModel getPostById(String postId) {
        return null;
    }

    @Override
    public void updatePostById(PostModel postModel, String postId) {

    }

    @Override
    public void deletePostById(String postId) {

    }
}
