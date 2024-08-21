public class BigbenchClone{    
     
    public void test_extraMaterialsByTypeID() throws Exception {
        URL url = new URL(baseUrl + "/extraMaterialsForTypeID/20188");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        assertThat(connection.getResponseCode(), equalTo(200));
        assertThat(getResponse(connection), equalTo("[{\"activityID\":8,\"activityName\":\"Invention\",\"requiredTypeID\":20410,\"requiredTypeName\":\"Datacore - Gallentean Starship Engineering\",\"requiredTypeCategoryID\":17,\"requiredTypeGroupID\":333,\"requiredTypeGroupName\":\"Datacores\",\"requiredTypeIcon\":\"64_02\",\"damagePerJob\":\"1.0\",\"quantity\":64,\"requiredTypeVolume\":\"1.0\"},{\"activityID\":8,\"activityName\":\"Invention\",\"requiredTypeID\":20424,\"requiredTypeName\":\"Datacore - Mechanical Engineering\",\"requiredTypeCategoryID\":17,\"requiredTypeGroupID\":333,\"requiredTypeGroupName\":\"Datacores\",\"requiredTypeIcon\":\"64_03\",\"damagePerJob\":\"1.0\",\"quantity\":64,\"requiredTypeVolume\":\"1.0\"},{\"activityID\":1,\"activityName\":\"Manufacturing\",\"requiredTypeID\":22242,\"requiredTypeName\":\"Capital Ship Construction\",\"requiredTypeCategoryID\":16,\"requiredTypeGroupID\":269,\"requiredTypeGroupName\":\"Mechanic\",\"requiredTypeIcon\":\"50_11\",\"damagePerJob\":\"0.0\",\"quantity\":1,\"requiredTypeVolume\":\"0.01\"},{\"activityID\":8,\"activityName\":\"Invention\",\"requiredTypeID\":25855,\"requiredTypeName\":\"Incognito Ship Data Interface\",\"requiredTypeCategoryID\":17,\"requiredTypeGroupID\":716,\"requiredTypeGroupName\":\"Data Interfaces\",\"requiredTypeIcon\":\"63_06\",\"damagePerJob\":\"1.0\",\"quantity\":1,\"requiredTypeVolume\":\"1.0\"}]"));
        assertThat(connection.getHeaderField("Content-Type"), equalTo("application/json; charset=utf-8"));
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");
        assertThat(connection.getResponseCode(), equalTo(200));
        assertThat(getResponse(connection), equalTo("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><rowset><row xsi:type=\"ramTypeRequirementDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><activityID>8</activityID><activityName>Invention</activityName><damagePerJob>1.0</damagePerJob><quantity>64</quantity><requiredTypeCategoryID>17</requiredTypeCategoryID><requiredTypeGroupID>333</requiredTypeGroupID><requiredTypeGroupName>Datacores</requiredTypeGroupName><requiredTypeID>20410</requiredTypeID><requiredTypeIcon>64_02</requiredTypeIcon><requiredTypeName>Datacore - Gallentean Starship Engineering</requiredTypeName><requiredTypeVolume>1.0</requiredTypeVolume></row><row xsi:type=\"ramTypeRequirementDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><activityID>8</activityID><activityName>Invention</activityName><damagePerJob>1.0</damagePerJob><quantity>64</quantity><requiredTypeCategoryID>17</requiredTypeCategoryID><requiredTypeGroupID>333</requiredTypeGroupID><requiredTypeGroupName>Datacores</requiredTypeGroupName><requiredTypeID>20424</requiredTypeID><requiredTypeIcon>64_03</requiredTypeIcon><requiredTypeName>Datacore - Mechanical Engineering</requiredTypeName><requiredTypeVolume>1.0</requiredTypeVolume></row><row xsi:type=\"ramTypeRequirementDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><activityID>1</activityID><activityName>Manufacturing</activityName><damagePerJob>0.0</damagePerJob><quantity>1</quantity><requiredTypeCategoryID>16</requiredTypeCategoryID><requiredTypeGroupID>269</requiredTypeGroupID><requiredTypeGroupName>Mechanic</requiredTypeGroupName><requiredTypeID>22242</requiredTypeID><requiredTypeIcon>50_11</requiredTypeIcon><requiredTypeName>Capital Ship Construction</requiredTypeName><requiredTypeVolume>0.01</requiredTypeVolume></row><row xsi:type=\"ramTypeRequirementDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><activityID>8</activityID><activityName>Invention</activityName><damagePerJob>1.0</damagePerJob><quantity>1</quantity><requiredTypeCategoryID>17</requiredTypeCategoryID><requiredTypeGroupID>716</requiredTypeGroupID><requiredTypeGroupName>Data Interfaces</requiredTypeGroupName><requiredTypeID>25855</requiredTypeID><requiredTypeIcon>63_06</requiredTypeIcon><requiredTypeName>Incognito Ship Data Interface</requiredTypeName><requiredTypeVolume>1.0</requiredTypeVolume></row></rowset>"));
        assertThat(connection.getHeaderField("Content-Type"), equalTo("application/xml; charset=utf-8"));
    }
}