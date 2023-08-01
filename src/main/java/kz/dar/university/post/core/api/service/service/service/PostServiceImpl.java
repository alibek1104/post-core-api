package kz.dar.university.post.core.api.service.service.service;

import kz.dar.university.post.core.api.model.PostModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {

    HashMap<String, PostModel> postModelHashMap = new HashMap<>();
    @Override
    public void createPost(PostModel postModel) {
        postModel.setPostId(UUID.randomUUID().toString());
        postModelHashMap.put(postModel.getPostId(), postModel);
    }
    @Override
    public List<PostModel> getAllPosts() {

        return new ArrayList<>(postModelHashMap.values());
    }

    @Override
    public PostModel getPostById(String postId) {

        return postModelHashMap.get(postId);
    }

    @Override
    public void updatePostById(String postId, PostModel postModel) {
        postId = postModel.getPostId();
        if (postModelHashMap.containsKey(postId)) {
            postModelHashMap.put(postModel.getPostItem(), postModel);
        }
    }

    @Override
    public void deletePostById(String postId) {
        postModelHashMap.remove(postId);
    }
}
