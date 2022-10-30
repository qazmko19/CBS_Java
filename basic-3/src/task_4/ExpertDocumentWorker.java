package task_4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public String openDocument() {
        return super.openDocument();
    }

    @Override
    public String editDocument() {
        return super.editDocument();
    }

    @Override
    public String saveDocument() {
        return "Document saved in new format";
    }
}
