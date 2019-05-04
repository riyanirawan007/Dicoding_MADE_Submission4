package app.android.rynz.imoviecatalog.data.model;

import android.support.annotation.Nullable;

public class FavoriteMovie extends DetailMovie
{
    private int ID;
    //Modifier multi values field
    private String strBelongToCollection;
    private String strGenres;
    private String strProductionCompany;
    private String strProductionCountry;
    private String strSpokenLanguage;

    public FavoriteMovie(String movieID, String isAdult, @Nullable String backdropPath, @Nullable String strBelongToCollection, int buget,
                         @Nullable String strGenres, @Nullable String homePage, @Nullable String imdbID,
                         String oriLanguage, String oriTitle, @Nullable String overview, double popularity,
                         @Nullable String posterPath, @Nullable String strProductionCompany,
                         @Nullable String strProductionCountry, String releaseDate, int revenue, int runtime,
                         @Nullable String strSpokenLanguage, String status, @Nullable String tagline, String title,
                         String video, int voteCount, double voteAverage)
    {
        super(Boolean.valueOf(isAdult), backdropPath, null, buget, null, homePage, movieID, imdbID,
                oriLanguage, oriTitle, overview, popularity, posterPath
                , null
                , null
                , releaseDate
                , revenue, runtime, null, status, tagline, title, Boolean.valueOf(video), voteCount, voteAverage);
        this.strBelongToCollection = strBelongToCollection;
        this.strGenres = strGenres;
        this.strProductionCompany = strProductionCompany;
        this.strProductionCountry = strProductionCountry;
        this.strSpokenLanguage = strSpokenLanguage;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getStrBelongToCollection()
    {
        return strBelongToCollection;
    }

    public String getStrGenres()
    {
        return strGenres;
    }

    public String getStrProductionCompany()
    {
        return strProductionCompany;
    }

    public String getStrProductionCountry()
    {
        return strProductionCountry;
    }

    public String getStrSpokenLanguage()
    {
        return strSpokenLanguage;
    }
}
