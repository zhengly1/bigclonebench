public class BigbenchClone{    
        public String getIrcNickAt(int index) {
            int row = ircChannelTable.getSelectedRow();
            if (row < 0 || row >= ircChannelTable.getRowCount()) return "";
            row = ircChannelSorter.indexes[row];
            Vector list = ircMgr.getChannels();
            if (row >= list.size()) {
                return "";
            }
            IrcChannel channel = (IrcChannel) list.elementAt(row);
            try {
                return ((IrcUser) (channel.getUsers().elementAt(index))).getIrcNick();
            } catch (ArrayIndexOutOfBoundsException e) {
                return null;
            }
        }
}