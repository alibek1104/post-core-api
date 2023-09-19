package kz.dar.university.post.core.api.service.deprecated;

import kz.dar.university.post.core.api.model.PostModel;
import java.util.List;

@Deprecated
public interface PostService {

    void createPost(PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPostById(String postId);
    void updatePostById(PostModel postModel);
    void deletePostById(String postId);


}
