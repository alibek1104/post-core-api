package kz.dar.university.post.core.api.service.deprecated;

import kz.dar.university.post.core.api.model.PostModel;
import kz.dar.university.post.core.api.service.deprecated.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Deprecated
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
    public void updatePostById(PostModel postModel) {
        if (postModelHashMap.containsKey(postModel.getPostId())) {
            createPost(postModel);
        }
    }

    @Override
    public void deletePostById(String postId) {
        postModelHashMap.remove(postId);
    }
}
