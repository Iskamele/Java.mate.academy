There is class SongOrder. You must use your knowledge about creation of static factory method and make possible to initialize its objects using it.

We must give two choices for user to initialize such object:

Enter only singer of a song, using static factory method of(String singer).
Enter singer and specific songName, using static factory method of(String singer, String songName). Parameters order must be the same as in this description.
Also, you have to override toString() method to print what song was ordered by user.

In case if the user entered only singer method must return such line:

"Play any Bon Jovi song"

In case if the user entered singer and songName method must return such line:

"Play Bon Jovi song called "It's my life""

And in case if the user entered nor singer nor songName method must return such line:

"You haven't chosen a singer. Please make your choice)"