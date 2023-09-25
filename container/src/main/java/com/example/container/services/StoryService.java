import com.example.myapp.models.Story;

import java.util.List;
import java.util.Optional;

public interface StoryService {
    List<Story> getAllStories();

    Story createStory(Story story);

    Optional<Story> getStoryById(Long id);

    Story updateStory(Long id, Story updatedStory);

    void deleteStory(Long id);
}