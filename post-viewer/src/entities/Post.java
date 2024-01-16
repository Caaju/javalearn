package entities;

import java.util.ArrayList;
import java.util.List;

public class Post {
    String title;
    String content;
    int likes;
    
    public int getLikes() {
        return likes;
    }
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.likes=0;
    }

    List<Comment> comments=new ArrayList<>();

    public List<Comment> getComments() {
        return comments;
    }
    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void addLike(){
        likes+=1;
    }
}
