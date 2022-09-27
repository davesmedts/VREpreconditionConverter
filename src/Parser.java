import java.util.ArrayList;
import java.util.List;

public class Parser {

    public List<String> parseRecords(List<String> preConditions) {
//        String preCondition = "MessageType=CC015C,CD001C,CD003C,CD012C,CD050C,CD038C,CC029C,CC007C,CC013C,CC043C,CD180C,CD181C,CC182C,CD115C,CD165C,CD160C,CC170C";
        List<String> newPreConditions = new ArrayList<>();
        for (String preCondition : preConditions) {

            String[] parsedPreCondition = preCondition.split("=");
            String[] messages = parsedPreCondition[1].split(",");


            StringBuilder builder = new StringBuilder("/*/MessageType in {");
            for (int i = 0; i < messages.length; i++) {

                String endMark;
                if (i == messages.length - 1) {
                    endMark = "}";
                } else {
                    endMark = ",";
                }
                builder.append(String.format("\"%s\"%s", messages[i], endMark));
            }

            newPreConditions.add(builder.toString());
        }
        return newPreConditions;

    }
}
