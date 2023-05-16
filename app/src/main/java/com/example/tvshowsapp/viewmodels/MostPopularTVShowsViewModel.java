package com.example.tvshowsapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tvshowsapp.repositories.MostPopularTVShowsRepository;
import com.example.tvshowsapp.responses.TVShowsResponse;

public class MostPopularTVShowsViewModel extends ViewModel {

    private final MostPopularTVShowsRepository mostPopularTVShowsRepository;

    public MostPopularTVShowsViewModel(){
        mostPopularTVShowsRepository = new MostPopularTVShowsRepository();
    }

    public LiveData<TVShowsResponse> getMostPopularTVShows(int page){
        return mostPopularTVShowsRepository.getMostPopularTVShows(page);
    }
}
