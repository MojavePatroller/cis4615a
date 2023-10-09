/* 
Vulnerability 2 
XP00-J. Do not ignore values returned by methods Given the non-compliant code below:
*/

public void delete File() {
    
    File someFile = new File(”someFileName.txt”);
    // Do something with someFile
    if ( !someFile.delete()) {
        // Handle failure to delete the file
    }

}