package kz.dar.university.post.core.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {
    List<PostEntity> getPostEntityByPostItem(String postItem);

    PostEntity getPostEntityByPostId(String postId);

    List<PostEntity> getPostEntityBy();

    @Transactional
    void deletePostEntityByPostId(String postId);
}
