public class BigbenchClone{    
            
            protected boolean performLeavingAction(WizardStepDirection direction) {
                reader.stopReading();
                reader.writeMetaDataInParameter();
                return true;
            }
}