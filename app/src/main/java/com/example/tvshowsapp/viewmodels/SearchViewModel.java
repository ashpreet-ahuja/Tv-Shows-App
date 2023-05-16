package com.example.tvshowsapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tvshowsapp.repositories.SearchTVShowRepository;
import com.example.tvshowsapp.responses.TVShowsResponse;

public class SearchViewModel extends ViewModel {

    private final SearchTVShowRepository searchTVShowRepository;

    public SearchViewModel(){
        searchTVShowRepository = new SearchTVShowRepository();
    }

    public LiveData<TVShowsResponse> searchTVShow(String query, int page){
        return searchTVShowRepository.searchTVShow(query, page);
    }
}
