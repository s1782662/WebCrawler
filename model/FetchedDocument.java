package model;

import java.util.Map;

/** 
 * Collection of unprocesses data 
 */

public class FetchedDocument {

    private String documentId;

    private String url;

    private String contentType;

    private String contentCharset;

    private byte[] documentContent;

    private Map<String,String> documentMetadata;

    public FetchedDocument() {}

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId){
        this.documentId = documentId;
    }

    public void setDocumentURL(String url){
        this.url = url;
    }

    public String getDocumentURL(){
        return url;
    }

    public void setContentType(String contentType){
        this.contentType = contentType;
    }

    public String getContentType(){
        return contentType;
    }

    public void setDocumentContent(byte[] data){
        this.documentContent = data;
    }

    public byte[] getDocumentContent() {
        return documentContent;
    }
    
    public long getContentLength(){
        return documentContent.length;
    }

    public void setDocumentMetadata(Map<String,String> data){
        this.documentMetadata = data;
    }

    public Map<String,String> getDocumentMetadata(){
        return documentMetadata;
    }
}

