import java.util.*;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.HashMap;

public class CD {
  private String mTitle;
  public String mArtist;
  private static ArrayList<CD> CDList = new ArrayList<CD>();
  private int mId;

  public CD(String title, String artist) {
    mTitle = title;
    mArtist = artist;
    CDList.add(this);
    mId = CDList.size();
  }

  public String getTitle() {
    return mTitle;
  }
  public String getArtist() {
    return mArtist;
  }

  public static ArrayList<CD> getCD() {
    return CDList;
  }

  public static void clear() {
  CDList.clear();
  }

  public int getId() {
    return mId;
  }


}
