package com.example.tvshowsapp.responses;

import com.example.tvshowsapp.models.TVShowDetails;
import com.google.gson.annotations.SerializedName;

public class TVShowDetailsResponse {

    @SerializedName("tvShow")
    private TVShowDetails tvShowDetails;

    public TVShowDetails getTvShowDetails(){
        return tvShowDetails;
    }
}
