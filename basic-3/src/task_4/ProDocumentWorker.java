package task_4;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    public String openDocument() {
        return super.openDocument();
    }

    @Override
    public String editDocument() {
        return "Document edited";
    }

    @Override
    public String saveDocument() {
        return "The document is saved in the old format, saving in other formats is available in the Expert version";
    }
}
