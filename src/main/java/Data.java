import org.apache.commons.csv.CSVFormat;
import smile.io.Read;
import smile.data.DataFrame;

public class Data {

    public DataFrame readCSV() throws Exception{
        CSVFormat format= CSVFormat.DEFAULT.withFirstRecordAsHeader() ;
        DataFrame df = null;
        df = Read.csv("src/main/resources/Wuzzuf_Jobs.csv",format);
        return df;
    }
}
