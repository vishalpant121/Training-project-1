package FileHandlers.FileHandlerImpl;

import FileHandlers.MyFileHandler;
import model.Employee;

public class XMLFileHandler implements MyFileHandler {

    private String inputPath;

    private String outputPath;

    XMLFileHandler(String path1,String path2){
        this.inputPath = path1;
        this.outputPath =path2;
        }

    @Override
    public Employee read() {
        return null;
    }

    @Override
    public void write(Employee emp) {

    }

}
