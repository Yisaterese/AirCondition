import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }

    public static class Television {
        private boolean isOn;
        private int volume;
        private ArrayList<String> channels = new ArrayList<>();
        public void  isOn(){
            isOn = true;
        }
        public boolean isPoweredOn(){
            return isOn;
        }

        public void isOff(){
            isOn = false;
        }
        public boolean toggleSwitch(){
            isOn = !isOn;
            return isOn;
        }

        public int addVolume(int vol) {
            for(int counter = 1; counter <= vol; counter++){
                volume++;
            }
            return volume;
        }


        public void subScribeChannels(String... inputChannel){
            for(int index = 0; index < inputChannel.length; index++) {
                channels.add(inputChannel[index]);
            }
        }

        public void unsubscribeChannels(String... channelName){
            for(int index = 0; index < channels.size(); index++) {
                if(channels.get(index).equals(channelName[index])){
                    channels.remove(channelName);
                }
            }
        }
        public int numberOfChannelsSubscribed(){
            return channels.size();
       }
    }
}