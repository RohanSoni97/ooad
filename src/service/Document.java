package service;

import java.util.ArrayList;
import java.util.List;

public class Document {
    String candid_id;
    String doc_id;
    String doc_name;
    List<Document> documents=new ArrayList<>();
    public Document(String candid_id, String doc_id, String doc_name) {
        this.candid_id = candid_id;
        this.doc_id = doc_id;
        this.doc_name = doc_name;
    }

    public String getCandid_id() {
        return candid_id;
    }

    public void setCandid_id(String candid_id) {
        this.candid_id = candid_id;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public void addDocument(Document document)
    {
    documents.add(document);
    }
    public List<Document> getDocuments()
    {
        return documents;
    }
}
