package cz.librarymanager.model;

import javax.print.DocFlavor;
import java.util.Date;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class PublisherData {
    private String editionPlace;
    private String publisher;
    private int editionNumber;
    private Date issueDate;

    public String getEditionPlace() {
        return editionPlace;
    }

    public void setEditionPlace(String editionPlace) {
        this.editionPlace = editionPlace;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "PublisherData{" +
                "editionPlace='" + editionPlace + '\'' +
                ", publisher='" + publisher + '\'' +
                ", editionNumber=" + editionNumber +
                ", issueDate=" + issueDate +
                '}';
    }
}
