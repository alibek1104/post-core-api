package kz.dar.university.post.core.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostModel {
    private String postId;
    @NotNull(message = "Client ID can not be null")
    private String clientId;
    @NotNull(message = "Post Recipient ID can not be null")
    private String postRecipientId;
    @NotNull(message = "Post Item can not be null")
    private String postItem;
    private String status;
}
