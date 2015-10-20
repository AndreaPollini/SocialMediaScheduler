/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmediascheduler.post;

/**
 *
 * @author 15367519
 */
public abstract class PostComponent {
    public abstract String content();
    
    public void add(PostComponent comp) {}
    public void remove(PostComponent comp) {}
}
