package org.example;

import com.google.gson.annotations.SerializedName;

public class Movie {
    private int id;
    private String title;
    private String description;
    private String category;
    private String director;

    @SerializedName("release_year")
    private int releaseYear;
}
