public class BigbenchClone{    
    private static void table_sp_2val() {
        String table = fr.soleil.sgad.mysql.Constants.snapObjects[7];
        fr.soleil.sgad.mysql.Generator.add_object(fr.soleil.sgad.Constants.newLine + fr.soleil.sgad.mysql.Constants.separator + fr.soleil.sgad.Constants.newLine + "#" + fr.soleil.sgad.Constants.newLine + "# Table structure :  `" + table + "`" + fr.soleil.sgad.Constants.newLine + "#" + fr.soleil.sgad.Constants.newLine + fr.soleil.sgad.Constants.newLine);
        fr.soleil.sgad.mysql.Generator.add_object("CREATE TABLE `" + table + "` (" + fr.soleil.sgad.Constants.newLine + "\t" + "`id_snap` int(11) NOT NULL default '0'," + fr.soleil.sgad.Constants.newLine + "\t" + "`id_att` int(11) NOT NULL default '0'," + fr.soleil.sgad.Constants.newLine + "\t" + "`dim_x` SMALLINT( 6 ) NOT NULL," + fr.soleil.sgad.Constants.newLine + "\t" + "`read_value` blob," + fr.soleil.sgad.Constants.newLine + "\t" + "`write_value` blob" + fr.soleil.sgad.Constants.newLine + ") TYPE=" + fr.soleil.sgad.mysql.Constants.storage_engine + " COMMENT='Table for Spectrum, Read/Write attributes';" + fr.soleil.sgad.Constants.newLine);
    }
}