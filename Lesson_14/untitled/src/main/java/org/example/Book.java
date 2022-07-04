package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    private int id;
    private String title;
    private String[] category;
    private String author;

    @SerializedName("page_number")
    private int pageNumber;

    @SerializedName("release_date")
    private Date releaseDate;

    @Override
    public String toString() {
        return id + " - " + title + " - " + Arrays.toString(category) +
                " - " + author + " - " + pageNumber + " - " + Util.formatDate(releaseDate);
    }
}
