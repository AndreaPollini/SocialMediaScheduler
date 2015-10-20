/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmediascheduler.post;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author 15367519
 */
public class Post extends PostComponent {
    private final LinkedList<PostComponent> components = new LinkedList<PostComponent>();
    private LocalDateTime createDate;
    
    

    
    public void Post(){
        this.createDate = LocalDateTime.now();
    }
    
    
    @Override
    public void add(PostComponent comp) {
        components.add(comp);
    }

    @Override
    public void remove(PostComponent comp) {
        components.remove(comp); 
    }
    
    
    
    @Override
    public String content() {
       String content = "";
       content = components.stream().map((component) -> component.content()).reduce(content, String::concat);
       return content;
    }
    
}
