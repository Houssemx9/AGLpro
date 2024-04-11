
package com.mycompany.mavenproject1;
import java.util.List;

/**
 *
 * @author HOUSSEMX9
 */
public class Stock {
    private List<Article> articles;

    public Stock(List<Article> articles) {
        this.articles = articles;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    
    
    
}
