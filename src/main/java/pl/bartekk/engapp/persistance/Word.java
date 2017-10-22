package pl.bartekk.engapp.persistance;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "WORD")
public class Word {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "POLISH")
    private String polish;

    @Column(name = "ENGLISH")
    private String english;

    @Column(name = "LEVEL")
    private Level level;

    @OneToOne(targetEntity = Category.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "CATEGORY_ID")
    private Category category;

    @Column(name = "DATE_ADDED")
    private Date dateAdded;

    @Column(name = "SOUND_URL")
    private String soundUrl;

    public Word() {
    }

    public Word(String polish, String english, Level level, Category category, Date dateAdded, String soundUrl) {
        this.polish = polish;
        this.english = english;
        this.level = level;
        this.category = category;
        this.dateAdded = dateAdded;
        this.soundUrl = soundUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolish() {
        return polish;
    }

    public void setPolish(String polish) {
        this.polish = polish;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getSoundUrl() {
        return soundUrl;
    }

    public void setSoundUrl(String soundUrl) {
        this.soundUrl = soundUrl;
    }
}
