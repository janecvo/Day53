public class TvShow {
    private String showName;
    private int numOfEpisodes;
    private String showGenre;


public TvShow (String showName, int numOfEpisodes, String showGenre){
    this.showName = showName;
    this.numOfEpisodes = numOfEpisodes;
    this.showGenre = showGenre;
}

public TvShow (String showName, int numOfEpisodes){
    this.showName = showName;
    this.numOfEpisodes = numOfEpisodes;
}

public TvShow (String showName, String showGenre){
    this.showName = showName;
    this.showGenre = showGenre;
}

public TvShow (int numOfEpisodes, String showGenre){
    this.numOfEpisodes = numOfEpisodes;
    this.showGenre = showGenre;
}

public TvShow (String showName){
    this.showName = showName;
}

public String getName(){
    return showName;
}

public String getShowName() {
    return showName;
}

public void setShowName(String showName) {
    this.showName = showName;
}

public int getNumOfEpisodes() {
    return numOfEpisodes;
}

public void setNumOfEpisodes(int numOfEpisodes) {
    this.numOfEpisodes = numOfEpisodes;
}

public String getShowGenre() {
    return showGenre;
}

public void setShowGenre(String showGenre) {
    this.showGenre = showGenre;
}

public int getNumEps(){
    return numOfEpisodes;
}

public String getGenre(){
    return showGenre;
}
@Override
public String toString(){
    getName();
    getNumEps();
    getGenre();
    return "Name of show: " + getName() +'\n'  + "Number of episodes: " + getNumEps() + '\n' + "What is the genre? " + getGenre();
    }
}