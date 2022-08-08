package io.anmolbrains.springbootquickstart.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
                new Topic("Spring", "Spring Framework", "Spring FrameWork Description"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("JavaScript", "javaScript", "Java Script Description")
        );
    public List<Topic> getAllTopics(){
    return topics;
    }
    public Topic getTopic(String id){
       return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
    public void addTopic(Topic topic){
        topics.add(topic);
    }
    public void updateTopic(String id, Topic topic){
        for (int i = 0; i< topics.size();i++){
            Topic t = topics.get(i);
            if (t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }
    }
    public void deleteTopic(String id, Topic topic){
        topics.removeIf(t->t.getId().equals(id));
    }
}
