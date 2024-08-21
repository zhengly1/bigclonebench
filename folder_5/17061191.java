public class BigbenchClone{    
    private String getVideoDetails(File file) {
        Video video = getVideo(file);
        if (video != null) {
            try {
                StringBuffer buffer = new StringBuffer();
                synchronized (buffer) {
                    buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?><TvBusMarshalledStruct:TvBusEnvelope xmlns:xs=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:TvBusMarshalledStruct=\"http://tivo.com/developer/xml/idl/TvBusMarshalledStruct\" xmlns:TvPgdRecording=\"http://tivo.com/developer/xml/idl/TvPgdRecording\" xmlns:TvBusDuration=\"http://tivo.com/developer/xml/idl/TvBusDuration\" xmlns:TvPgdShowing=\"http://tivo.com/developer/xml/idl/TvPgdShowing\" xmlns:TvDbShowingBit=\"http://tivo.com/developer/xml/idl/TvDbShowingBit\" xmlns:TvBusDateTime=\"http://tivo.com/developer/xml/idl/TvBusDateTime\" xmlns:TvPgdProgram=\"http://tivo.com/developer/xml/idl/TvPgdProgram\" xmlns:TvDbColorCode=\"http://tivo.com/developer/xml/idl/TvDbColorCode\" xmlns:TvPgdSeries=\"http://tivo.com/developer/xml/idl/TvPgdSeries\" xmlns:TvDbShowType=\"http://tivo.com/developer/xml/idl/TvDbShowType\" xmlns:TvPgdChannel=\"http://tivo.com/developer/xml/idl/TvPgdChannel\" xmlns:TvDbTvRating=\"http://tivo.com/developer/xml/idl/TvDbTvRating\" xmlns:TvDbRecordQuality=\"http://tivo.com/developer/xml/idl/TvDbRecordQuality\" xmlns:TvDbBitstreamFormat=\"http://tivo.com/developer/xml/idl/TvDbBitstreamFormat\" xs:schemaLocation=\"http://tivo.com/developer/xml/idl/TvBusMarshalledStruct TvBusMarshalledStruct.xsd http://tivo.com/developer/xml/idl/TvPgdRecording TvPgdRecording.xsd http://tivo.com/developer/xml/idl/TvBusDuration TvBusDuration.xsd http://tivo.com/developer/xml/idl/TvPgdShowing TvPgdShowing.xsd http://tivo.com/developer/xml/idl/TvDbShowingBit TvDbShowingBit.xsd http://tivo.com/developer/xml/idl/TvBusDateTime TvBusDateTime.xsd http://tivo.com/developer/xml/idl/TvPgdProgram TvPgdProgram.xsd http://tivo.com/developer/xml/idl/TvDbColorCode TvDbColorCode.xsd http://tivo.com/developer/xml/idl/TvPgdSeries TvPgdSeries.xsd http://tivo.com/developer/xml/idl/TvDbShowType TvDbShowType.xsd http://tivo.com/developer/xml/idl/TvPgdChannel TvPgdChannel.xsd http://tivo.com/developer/xml/idl/TvDbTvRating TvDbTvRating.xsd http://tivo.com/developer/xml/idl/TvDbRecordQuality TvDbRecordQuality.xsd http://tivo.com/developer/xml/idl/TvDbBitstreamFormat TvDbBitstreamFormat.xsd\" xs:type=\"TvPgdRecording:TvPgdRecording\">\n");
                    if (video.getDuration() > 0) buffer.append("<recordedDuration>" + mDurationFormat.format(new Date(video.getDuration())) + "</recordedDuration>\n"); else buffer.append("<recordedDuration>PT00M</recordedDuration>\n");
                    buffer.append("<vActualShowing>\n");
                    buffer.append("<element>\n");
                    buffer.append("<showingBits value=\"1027\"/>\n");
                    buffer.append("<time>" + mTimeDateFormat.format(video.getDateRecorded()) + "</time>\n");
                    if (video.getDuration() > 0) buffer.append("<duration>" + mDurationFormat.format(new Date(video.getDuration())) + "</duration>\n"); else buffer.append("<duration>PT00M</duration>\n");
                    if (video.getPartCount() != 0) buffer.append("<partCount>" + video.getPartCount() + "</partCount>\n");
                    if (video.getPartIndex() != 0) buffer.append("<partIndex>" + video.getPartIndex() + "</partIndex>\n");
                    buffer.append("<program>\n");
                    buffer.append("<vActor>\n");
                    if (video.getActors() != null) {
                        StringTokenizer tokenizer = new StringTokenizer(video.getActors(), ";");
                        while (tokenizer.hasMoreTokens()) {
                            buffer.append("<element>" + tokenizer.nextToken() + "</element>\n");
                        }
                    }
                    buffer.append("</vActor>\n");
                    buffer.append("<vAdvisory/>\n");
                    buffer.append("<vChoreographer/>\n");
                    if (video.getColorCode() != 0) buffer.append("<colorCode value=\"" + video.getColorCode() + "\">COLOR</colorCode>\n"); else buffer.append("<colorCode value=\"4\">COLOR</colorCode>\n");
                    if (video.getDescription() != null && video.getDescription().trim().length() > 0) buffer.append("<description>" + Tools.escapeXMLChars(video.getDescription()) + "</description>\n");
                    buffer.append("<vDirector>\n");
                    if (video.getDirectors() != null) {
                        StringTokenizer tokenizer = new StringTokenizer(video.getDirectors(), ";");
                        while (tokenizer.hasMoreTokens()) {
                            buffer.append("<element>" + Tools.escapeXMLChars(tokenizer.nextToken()) + "</element>\n");
                        }
                    }
                    buffer.append("</vDirector>\n");
                    buffer.append("<episodeNumber>" + video.getEpisodeNumber() + "</episodeNumber>\n");
                    if (video.getEpisodeTitle() != null && video.getEpisodeTitle().trim().length() > 0) buffer.append("<episodeTitle>" + Tools.escapeXMLChars(video.getEpisodeTitle()) + "</episodeTitle>\n");
                    buffer.append("<vExecProducer>\n");
                    if (video.getExecProducers() != null) {
                        StringTokenizer tokenizer = new StringTokenizer(video.getExecProducers(), ";");
                        while (tokenizer.hasMoreTokens()) {
                            buffer.append("<element>" + Tools.escapeXMLChars(tokenizer.nextToken()) + "</element>\n");
                        }
                    }
                    buffer.append("</vExecProducer>\n");
                    buffer.append("<vProgramGenre>\n");
                    if (video.getProgramGenre() != null) {
                        StringTokenizer tokenizer = new StringTokenizer(video.getProgramGenre(), ";");
                        while (tokenizer.hasMoreTokens()) {
                            buffer.append("<element>" + Tools.escapeXMLChars(tokenizer.nextToken()) + "</element>\n");
                        }
                    }
                    buffer.append("</vProgramGenre>\n");
                    buffer.append("<vGuestStar/>\n");
                    buffer.append("<vHost/>\n");
                    if (video.getEpisodic() != null) buffer.append("<isEpisode>" + video.getEpisodic() + "</isEpisode>\n"); else buffer.append("<isEpisode>false</isEpisode>\n");
                    if (video.getOriginalAirDate() != null) buffer.append("<originalAirDate>" + mTimeDateFormat.format(video.getOriginalAirDate()) + "</originalAirDate>\n"); else buffer.append("<originalAirDate>" + mTimeDateFormat.format(new Date(file.lastModified())) + "</originalAirDate>\n");
                    buffer.append("<vProducer>\n");
                    if (video.getProducers() != null) {
                        StringTokenizer tokenizer = new StringTokenizer(video.getProducers(), ";");
                        while (tokenizer.hasMoreTokens()) {
                            buffer.append("<element>" + Tools.escapeXMLChars(tokenizer.nextToken()) + "</element>\n");
                        }
                    }
                    buffer.append("</vProducer>\n");
                }
                log.debug(buffer.toString());
                return buffer.toString();
            } catch (Exception ex) {
                Tools.logException(VideoServer.class, ex);
            }
        }
        return null;
    }
}