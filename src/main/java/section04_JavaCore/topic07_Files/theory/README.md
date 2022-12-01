# Files

---
**FILE CLASS**

The `File` class from the `java.io` package, allows us to work with files or directories. To use the `File` class, create an object of the class, and specify the filename or directory name:

    File myFile = new File("filename.txt"); // specified the filename
    File myFile = new File("directory"); // specified the directory

The `File` class has many useful methods for creating and getting information about files: `createNewFile()`, `delete()`, `exists()`, `getName()`, `getAbsolutePath()`, `mkdir()` ...

---

**FILEWRITER CLASS**

The FileWriter class of the java.io package can be used to write data (in characters) to files. FileWriter is the simplest way to write a file in Java. It provides overloaded write method to write int, byte array, and String to the File. You can also write part of the String or byte array using FileWriter. FileWriter writes directly into files in the system so it should be used only when file is small.

    File myFile = new File("filename.txt");
    FileWriter fileWriter = new FileWriter(myFile); // passed File to constructor
    FileWriter fileWriter = new FileWriter("filename.txt"); // passed filename to constructor

---

**BUFFEREDWRITER CLASS**

The BufferedWriter class of the java.io package can be used with other writers to write data (in characters) more efficiently. The BufferedWriter maintains an internal buffer of 8192 characters by default. BufferedWriter is almost similar to FileWriter but it uses internal buffer to write data into File. During the write operation, the characters are written to the internal buffer instead of the disk. Once the buffer is filled or the writer is closed, the whole characters in the buffer are written to the disk. Hence, the number of communication to the disk is reduced. This is why writing characters is faster using BufferedWriter.

    File myFile = new File("filename.txt");
    FileWriter fileWriter = new FileWriter(myFile); 
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // passed FileWriter to constructor

---

**FILES CLASS**

Java 7 introduced Files utility class of the java.nio.file package, and we can write a file using its write function. Internally it’s using OutputStream to write byte array into file. This class consists exclusively of static methods that operate on files, directories, or other types of files. In most cases, the methods will delegate to the associated file system provider to perform the file operations.

---
**FILEREADER CLASS**

The FileReader class of the java.io package can be used to read data (in characters) from files. It returns data in byte format. Every time FileReader.read() is called a call is made to read a system file. A FileReader obtains characters from a file in a file system.

    File myFile = new File("filename.txt");
    FileReader fileReader = new FileReader(myFile); // passed File to constructor
    FileReader fileReader = new FileReader("filename.txt"); // passed filename to constructor

---

**BUFFEREDREADER CLASS**

The BufferedReader class of the java.io package can be used with other readers to read data (in characters) more efficiently. It is buffered. BufferReader is a class that helps to read text from a character-based input stream. It reads characters using another Reader. When BufferedReader.read() is called mostly data is read from the buffer. When data is not available in buffer a call is made to read system file and lot of characters are kept in buffer. BufferedReader is much faster as compared to FileReader.

    File myFile = new File("filename.txt");
    FileReader fileReader = new FileReader(myFile); 
    BufferedReader bufferedReader = new BufferedReader(fileReader); // passed FileReader to constructor

## Read more about:
- [File](https://www.tutorialspoint.com/java/java_file_class.htm)
- [FileWriter](https://www.programiz.com/java-programming/filewriter)
- [BufferedWriter](https://www.programiz.com/java-programming/bufferedwriter)
- [4 Ways to Write File](https://www.journaldev.com/878/java-write-to-file)
- [FileReader vs BufferedReader](https://www.javamadesoeasy.com/2015/08/difference-between-filereader-and.html)
- [FileReader](https://www.programiz.com/java-programming/filereader)
- [BufferedReader](https://www.programiz.com/java-programming/bufferedreader)
- [Java IO Stream](https://www.studytonight.com/java/java-io-stream.php)