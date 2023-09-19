package kz.dar.university.post.core.api.controller;

import kz.dar.university.post.core.api.model.PostModel;
import kz.dar.university.post.core.api.service.deprecated.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    @GetMapping("/check")
    public String check() {
        return "post-core-api is working";
    }
    @PostMapping
    public void createPost(@RequestBody @Valid PostModel postModel) {
        postService.createPost(postModel);
    }
    @GetMapping("/all")
    public List<PostModel> getAllPosts() {
        return postService.getAllPosts();
    }
    @GetMapping("/{postId}")
    public PostModel getPostById(@PathVariable String postId) {
        return postService.getPostById(postId);
    }
    @PutMapping("/{postId}")
    public void updatePostById(@RequestBody PostModel postModel) {
        postService.updatePostById(postModel);
    }
    @DeleteMapping("/{postId}")
    public void deletePostById(@PathVariable String postId) {
        postService.deletePostById(postId);
    }

}
