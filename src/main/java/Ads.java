import java.util.List;

public interface Ads {
    // get list of all ads
    List<Ad> all();
    // insert new ad & return new ads id
    Long insert(Ad ad);
}
