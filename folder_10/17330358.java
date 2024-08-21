public class BigbenchClone{    
    public void setVisibleSignature(Rectangle pageRect, int page, String fieldName) {
        if (fieldName != null) {
            AcroFields af = writer.getAcroFields();
            AcroFields.Item item = af.getFieldItem(fieldName);
            if (item != null) throw new IllegalArgumentException("The field " + fieldName + " already exists.");
            this.fieldName = fieldName;
        }
        if (page < 1 || page > writer.reader.getNumberOfPages()) throw new IllegalArgumentException("Invalid page number: " + page);
        this.pageRect = new Rectangle(pageRect);
        this.pageRect.normalize();
        rect = new Rectangle(this.pageRect.width(), this.pageRect.height());
        this.page = page;
        newField = true;
    }
}