package edu.temple.audiobookplayer.network;

import edu.temple.audiobookplayer.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BookService {

    @GET("cis3515/search.php")
    Call<List<Book>> searchBooks(@Query("term") String term);

}
