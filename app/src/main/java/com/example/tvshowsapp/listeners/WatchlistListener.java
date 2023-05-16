package com.example.tvshowsapp.listeners;

import com.example.tvshowsapp.models.TVShow;

public interface WatchlistListener {

    void onTVShowClicked(TVShow tvShow);

    void removeTVShowFromWatchlist(TVShow tvShow, int position);
}
