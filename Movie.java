/*
 * Name: Farhana 
 * CMP 167
 * Zybook final
 * Professor: 
 */

import java.util.Scanner;

public class Movie {
    private String movieName;
    private int numMinutes;
    private boolean isKidFriendly;
    private String[] castMembers;
    private int numCastMembers;

    // Constructor initializes default values for movie
    public Movie() {
        this.movieName = "Flick";
        this.numMinutes = 0;
        this.isKidFriendly = false;
        this.castMembers = new String[10];
        this.numCastMembers = 0;
    }

    public Movie(String movieName, int numMinutes, boolean isKidFriendly, String[] castMembers) {
        setMovieName(movieName);

        //duration of the movie in minutes
        setNumMinutes(numMinutes);

        //whether the movie is suitable for kids
        setIsKidFriendly(isKidFriendly);

        //duration of movie to variable numMinutes
        this.numMinutes = numMinutes;

    	this.isKidFriendly= isKidFriendly;

    	this.castMembers = castMembers;

    	for (int i = 0; i < castMembers.length; i ++ ) {

    	if ( castMembers [i] != null ) {

    	this.numCastMembers ++;
}
}
//this.numCastMember = castMembers.length;
}
public String[] getCastMembers() {

String[] copy = new String[this.castMembers.length];

for(int i= 0; i < copy.length; i++) {

copy[i] = this.castMembers[i];

}

return copy;
}
public void setCastMembers(String[] castMembers) {

this.castMembers = castMembers;

}

public int getNumCastMembers() {

return numCastMembers;

}
public void setNumCastMembers(int numCastMembers) {

this.numCastMembers = numCastMembers;
}

public void setNumMinutes(int numMinutes ) {

this.numMinutes = numMinutes;

}

public void setMovieName (String movieName) {

this.movieName = movieName;

}

public void setIsKidFriendly (boolean isKidFriendly) {

this.isKidFriendly =(isKidFriendly);

}

public String getMovieName() {

return movieName;

}

public int getNumMinutes() {

return numMinutes;

}

public boolean isKidFriendly () {

return isKidFriendly;

}

public String [] castMembers() {

return Array(castMembers, castMembers.length);

}

private String[] Array(String[] castMembers2, int length) {

// TODO Auto-generated method stub

return null;

}

public boolean replaceCastMember(int index, String castMemberName) {

if ( index >= this.numCastMembers || index < 0 ) {

return false;

// return castMemberName();

}else {

if(castMembers[index] == null) return false;

castMembers[index]=castMemberName;

return true;

}

}

public boolean doArraysMatch(String [] arr1, String [] arr2) {

if (arr1 == null || arr2 == null)

return arr1 == arr2;

if (arr1.length != arr2.length )

return false;

for ( int i = 0; i < arr1.length; i++) {

if (!arr1[i].equalsIgnoreCase(arr2[i])) {

return false;

}

}

return true;

}

public String getCastMemberNamesAsString() {

if(this.numCastMembers == 0) return "none";

String bro = "";

for(int i=0; i < this.numCastMembers; i++) {

if(i == this.numCastMembers - 1) bro += this.castMembers[i] ;

else bro += this.castMembers[i] + ", ";
}
return bro;
}
public boolean equals(Object o) {
    // Check if the object is null
    if (o == null)
        return false;
    // Check if object is an instance
    if (o instanceof Movie) {
        // Cast the object 
        Movie bro = (Movie) o;
        return this.doArraysMatch(this.castMembers, bro.castMembers);
    }
    // If object is not an instance, return false
    return false;
}
public String toString() {
    // Format information as a string
    return String.format(
        "Movie: [ Minutes %03d | Movie Name: %20s | %s | Number of Cast Members: %d | Cast Members: %s ]",
        this.numMinutes,
        this.movieName,
        this.isKidFriendly ? "is kid friendly" : "not kid friendly",
        this.numCastMembers,
        this.getCastMemberNamesAsString()
    );
}
}
