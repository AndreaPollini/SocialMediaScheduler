/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmediascheduler.post;

import socialmediascheduler.post.PostComponent;

/**
 *
 * @author 15367519
 */
public class TextComponent extends  PostComponent{
    private String text;

    
    
    public void TextComponent(String text) {
        this.text = text;
    }
    
    @Override
    public String content() {
         return text;  
    }
    
}
