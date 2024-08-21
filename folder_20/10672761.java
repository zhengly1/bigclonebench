public class BigbenchClone{    
    public void fill(String src, String dest, String user) throws IOException, DocumentException {
        PdfReader reader = new PdfReader(src);
        FileOutputStream writer = new FileOutputStream(dest);
        PdfStamper stamper = new PdfStamper(reader, writer);
        stamper.setEncryption(true, "", "Gu7ruc*YAWaStEbr", 0);
        AcroFields fields = stamper.getAcroFields();
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD);
        font.setSize((float) 20.2);
        BaseFont baseFont = font.getBaseFont();
        fields.setFieldProperty("RentalUse", "textsize", new Float(20.2), null);
        fields.setFieldProperty("RentalUse", "textfont", baseFont, null);
        fields.setField("RentalUse", this.get_RentalUse());
        fields.setFieldProperty("Secondary FirstName", "textsize", new Float(20.2), null);
        fields.setFieldProperty("Secondary FirstName", "textfont", baseFont, null);
        fields.setField("Secondary FirstName", this.get_Secondary_FirstName());
        fields.setFieldProperty("HousesiteEducationTax", "textsize", new Float(20.2), null);
        fields.setFieldProperty("HousesiteEducationTax", "textfont", baseFont, null);
        fields.setField("HousesiteEducationTax", this.get_HousesiteEducationTax());
        fields.setFieldProperty("TownCityLegalResidence", "textsize", new Float(20.2), null);
        fields.setFieldProperty("TownCityLegalResidence", "textfont", baseFont, null);
        fields.setField("TownCityLegalResidence", this.get_TownCityLegalResidence());
        fields.setFieldProperty("PreparerFirmIDNumber", "textsize", new Float(20.2), null);
        fields.setFieldProperty("PreparerFirmIDNumber", "textfont", baseFont, null);
        fields.setField("PreparerFirmIDNumber", this.get_PreparerFirmIDNumber());
        fields.setFieldProperty("OwnedByRelatedFarmer", "textsize", new Float(20.2), null);
        fields.setFieldProperty("OwnedByRelatedFarmer", "textfont", baseFont, null);
        fields.setField("OwnedByRelatedFarmer", this.get_OwnedByRelatedFarmer());
        fields.setFieldProperty("AllocatedEducationTax", "textsize", new Float(20.2), null);
        fields.setFieldProperty("AllocatedEducationTax", "textfont", baseFont, null);
        fields.setField("AllocatedEducationTax", this.get_AllocatedEducationTax());
        fields.setFieldProperty("LifeEstateHolder", "textsize", new Float(20.2), null);
        fields.setFieldProperty("LifeEstateHolder", "textfont", baseFont, null);
        fields.setField("LifeEstateHolder", this.get_LifeEstateHolder());
        fields.setFieldProperty("City", "textsize", new Float(20.2), null);
        fields.setFieldProperty("City", "textfont", baseFont, null);
        fields.setField("City", this.get_City());
        fields.setFieldProperty("FullYearResident", "textsize", new Float(20.2), null);
        fields.setFieldProperty("FullYearResident", "textfont", baseFont, null);
        fields.setField("FullYearResident", this.get_FullYearResident());
        fields.setFieldProperty("HousesiteValue", "textsize", new Float(20.2), null);
        fields.setFieldProperty("HousesiteValue", "textfont", baseFont, null);
        fields.setField("HousesiteValue", this.get_HousesiteValue());
        fields.setFieldProperty("Preparer Phone", "textsize", new Float(20.2), null);
        fields.setFieldProperty("Preparer Phone", "textfont", baseFont, null);
        fields.setField("Preparer Phone", this.get_Preparer_Phone());
        fields.setFieldProperty("PreparerBusinessName", "textsize", new Float(20.2), null);
        fields.setFieldProperty("PreparerBusinessName", "textfont", baseFont, null);
        fields.setField("PreparerBusinessName", this.get_PreparerBusinessName());
        fields.setFieldProperty("CrossingTownBoundaries", "textsize", new Float(20.2), null);
        fields.setFieldProperty("CrossingTownBoundaries", "textfont", baseFont, null);
        fields.setField("CrossingTownBoundaries", this.get_CrossingTownBoundaries());
        fields.setFieldProperty("LotRent", "textsize", new Float(20.2), null);
        fields.setFieldProperty("LotRent", "textfont", baseFont, null);
        fields.setField("LotRent", this.get_LotRent());
        fields.setFieldProperty("Secondary TaxpayerSSN", "textsize", new Float(20.2), null);
        fields.setFieldProperty("Secondary TaxpayerSSN", "textfont", baseFont, null);
        fields.setField("Secondary TaxpayerSSN", this.get_Secondary_TaxpayerSSN());
        fields.setFieldProperty("Preparer SSN PTIN", "textsize", new Float(20.2), null);
        fields.setFieldProperty("Preparer SSN PTIN", "textfont", baseFont, null);
        fields.setField("Preparer SSN PTIN", this.get_Preparer_SSN_PTIN());
        fields.setFieldProperty("FirstName", "textsize", new Float(20.2), null);
        fields.setFieldProperty("FirstName", "textfont", baseFont, null);
        fields.setField("FirstName", this.get_FirstName());
        fields.setFieldProperty("AddressLine1", "textsize", new Float(20.2), null);
        fields.setFieldProperty("AddressLine1", "textfont", baseFont, null);
        fields.setField("AddressLine1", this.get_AddressLine1());
        fields.setFieldProperty("HousesiteMunicipalTax", "textsize", new Float(20.2), null);
        fields.setFieldProperty("HousesiteMunicipalTax", "textfont", baseFont, null);
        fields.setField("HousesiteMunicipalTax", this.get_HousesiteMunicipalTax());
        fields.setFieldProperty("TotalParcelAcres", "textsize", new Float(20.2), null);
        fields.setFieldProperty("TotalParcelAcres", "textfont", baseFont, null);
        fields.setField("TotalParcelAcres", this.get_TotalParcelAcres());
        fields.setFieldProperty("RevocableTrust", "textsize", new Float(20.2), null);
        fields.setFieldProperty("RevocableTrust", "textfont", baseFont, null);
        fields.setField("RevocableTrust", this.get_RevocableTrust());
        fields.setFieldProperty("TaxpayerSSN", "textsize", new Float(20.2), null);
        fields.setFieldProperty("TaxpayerSSN", "textfont", baseFont, null);
        fields.setField("TaxpayerSSN", this.get_TaxpayerSSN());
        fields.setFieldProperty("OwnershipInterest", "textsize", new Float(20.2), null);
        fields.setFieldProperty("OwnershipInterest", "textfont", baseFont, null);
        fields.setField("OwnershipInterest", this.get_OwnershipInterest());
        fields.setFieldProperty("SellHousesite", "textsize", new Float(20.2), null);
        fields.setFieldProperty("SellHousesite", "textfont", baseFont, null);
        fields.setField("SellHousesite", this.get_SellHousesite());
        fields.setFieldProperty("ClaimedAsDependent", "textsize", new Float(20.2), null);
        fields.setFieldProperty("ClaimedAsDependent", "textfont", baseFont, null);
        fields.setField("ClaimedAsDependent", this.get_ClaimedAsDependent());
        fields.setFieldProperty("State", "textsize", new Float(20.2), null);
        fields.setFieldProperty("State", "textfont", baseFont, null);
        fields.setField("State", this.get_State());
        fields.setFieldProperty("ZIPCode", "textsize", new Float(20.2), null);
        fields.setFieldProperty("ZIPCode", "textfont", baseFont, null);
        fields.setField("ZIPCode", this.get_ZIPCode());
        fields.setFieldProperty("BusinessUse", "textsize", new Float(20.2), null);
        fields.setFieldProperty("BusinessUse", "textfont", baseFont, null);
        fields.setField("BusinessUse", this.get_BusinessUse());
        fields.setFieldProperty("AllocatedMunicipalTax", "textsize", new Float(20.2), null);
        fields.setFieldProperty("AllocatedMunicipalTax", "textfont", baseFont, null);
        fields.setField("AllocatedMunicipalTax", this.get_AllocatedMunicipalTax());
        fields.setFieldProperty("Secondary LastName", "textsize", new Float(20.2), null);
        fields.setFieldProperty("Secondary LastName", "textfont", baseFont, null);
        fields.setField("Secondary LastName", this.get_Secondary_LastName());
        fields.setFieldProperty("SpanNumber", "textsize", new Float(20.2), null);
        fields.setFieldProperty("SpanNumber", "textfont", baseFont, null);
        fields.setField("SpanNumber", this.get_SpanNumber());
        fields.setFieldProperty("ClaimantDateOfBirth", "textsize", new Float(20.2), null);
        fields.setFieldProperty("ClaimantDateOfBirth", "textfont", baseFont, null);
        fields.setField("ClaimantDateOfBirth", this.get_ClaimantDateOfBirth());
        fields.setFieldProperty("HouseholdIncome", "textsize", new Float(20.2), null);
        fields.setFieldProperty("HouseholdIncome", "textfont", baseFont, null);
        fields.setField("HouseholdIncome", this.get_HouseholdIncome());
        fields.setFieldProperty("SchoolDistrict", "textsize", new Float(20.2), null);
        fields.setFieldProperty("SchoolDistrict", "textfont", baseFont, null);
        fields.setField("SchoolDistrict", this.get_SchoolDistrict());
        fields.setFieldProperty("StateofLegalResidence", "textsize", new Float(20.2), null);
        fields.setFieldProperty("StateofLegalResidence", "textfont", baseFont, null);
        fields.setField("StateofLegalResidence", this.get_StateofLegalResidence());
        fields.setFieldProperty("BusinessRentUseImprovements", "textsize", new Float(20.2), null);
        fields.setFieldProperty("BusinessRentUseImprovements", "textfont", baseFont, null);
        fields.setField("BusinessRentUseImprovements", this.get_BusinessRentUseImprovements());
        fields.setFieldProperty("HomesteadLocation", "textsize", new Float(20.2), null);
        fields.setFieldProperty("HomesteadLocation", "textfont", baseFont, null);
        fields.setField("HomesteadLocation", this.get_HomesteadLocation());
        fields.setFieldProperty("LastName", "textsize", new Float(20.2), null);
        fields.setFieldProperty("LastName", "textfont", baseFont, null);
        fields.setField("LastName", this.get_LastName());
        stamper.setFormFlattening(true);
        stamper.setFullCompression();
        for (int i = 0; i < reader.getNumberOfPages() + 1; i++) {
            PdfContentByte overContent = stamper.getOverContent(i);
            if (overContent != null) {
                overContent.beginText();
                font = FontFactory.getFont(FontFactory.TIMES_ITALIC);
                font.setColor(BaseColor.BLUE);
                baseFont = font.getBaseFont();
                overContent.setColorFill(BaseColor.BLUE);
                overContent.setFontAndSize(baseFont, 24);
                overContent.showTextAligned(Element.ALIGN_RIGHT | Element.ALIGN_TOP, "Electronically filed via Modernized eFile", 20, 175, 90);
                overContent.endText();
                overContent.beginText();
                font = FontFactory.getFont(FontFactory.TIMES);
                font.setColor(BaseColor.RED);
                baseFont = font.getBaseFont();
                overContent.setColorFill(BaseColor.RED);
                overContent.setFontAndSize(baseFont, 8);
                overContent.showTextAligned(Element.ALIGN_CENTER | Element.ALIGN_BOTTOM, "Retrieved by " + user + " on " + new Date().toString(), 220, 3, 0);
                overContent.endText();
            }
        }
        stamper.close();
        reader.close();
    }
}