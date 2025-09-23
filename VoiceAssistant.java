import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class VoiceAssistant {
    public static void main(String[] args) {
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("alan");  // default voice

        if (voice != null) {
            voice.allocate();
            voice.speak("Hello, I am your Java voice assistant!");
            voice.speak("How can I help you today?");
        } else {
            System.out.println("Voice not found!");
        }
    }
}
