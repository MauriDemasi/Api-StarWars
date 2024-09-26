package com.mauridemasi.starwars.modelos;

public class Films {
    private String title;
    private int episode_id;
    private String director;
    private String producer;
    private String release_date;


    public Films(String title, int episode_id){
        this.title = title;
        this.episode_id = episode_id;

    }

    public Films(FilmsRecord filmsRecord) {
            this.title = filmsRecord.title();
            this.episode_id = filmsRecord.episode_id();
            this.director = filmsRecord.director();
            this.producer = filmsRecord.producer();
            this.release_date = filmsRecord.release_date();
        }

    @Override
    public String toString() {
        return "Films{" +
                "title='" + title + '\'' +
                ", episode_id=" + episode_id +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", release_date='" + release_date + '\'' +
                '}';
    }
}
