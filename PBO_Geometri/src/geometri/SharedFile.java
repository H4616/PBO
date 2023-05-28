/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author andra
 */
public class SharedFile {
    private RandomAccessFile file;

    public SharedFile(String filename) throws IOException {
        file = new RandomAccessFile(filename, "rw");
    }

    public synchronized void writeData(double data) throws IOException {
        file.writeDouble(data);
    }

    public synchronized double readData() throws IOException {
        return file.readDouble();
    }

    public void close() throws IOException {
        file.close();
    }
    
    public void clearFile() throws IOException {
        file.setLength(0);
    }
}
