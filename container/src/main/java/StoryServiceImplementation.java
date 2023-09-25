import com.example.myapp.models.Story;
import com.example.myapp.repositories.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoryServiceImpl implements StoryService {

    @Autowired
    private StoryRepository storyRepository;

    @Override
    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }

    @Override
    public Story createStory(Story story) {
        return storyRepository.save(story);
    }

    @Override
    public Optional<Story> getStoryById(Long id) {
        return storyRepository.findById(id);
    }

    @Override
    public Story updateStory(Long id, Story updatedStory) {
        Optional<Story> existingStoryOptional = storyRepository.findById(id);

        if (existingStoryOptional.isPresent()) {
            Story existingStory = existingStoryOptional.get();
            existingStory.setTitle(updatedStory.getTitle());
            existingStory.setContent(updatedStory.getContent());
            return storyRepository.save(existingStory);
        } else {
            return null;
        }
    }

    @Override
    public void deleteStory(Long id) {
        storyRepository.deleteById(id);
    }
}