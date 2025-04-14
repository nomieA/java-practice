import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

// サイレン音を鳴らすユーティリティ
class SirenUtil {
    private static void playNote(int note1, int note2, int durationMs) {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel channel = synth.getChannels()[0];

            for (int i = 0; i < 4; i++) {
                channel.noteOn(note1, 600);
                Thread.sleep(durationMs);
                channel.noteOff(note1);

                channel.noteOn(note2, 600);
                Thread.sleep(durationMs);
                channel.noteOff(note2);
            }

            synth.close();
        } catch (Exception e) {
            System.err.println("サイレン再生中にエラーが発生しました: " + e.getMessage());
        }
    }

    public static void playFireTruckSiren() {
        System.out.println("消防車のサイレン：ウーウー！");
        playNote(60, 52, 300); // C4 ↔ G3
    }

    public static void playAmbulanceSiren() {
        System.out.println("救急車のサイレン：ピーポーピーポー！");
        playNote(72, 76, 200); // C5 ↔ E5
    }

    public static void playPoliceCarSiren() {
        System.out.println("パトカーのサイレン：ウ〜ウ〜！");
        playNote(48, 44, 400); // C3 ↔ G2
    }
}



// インタフェース
interface EmergencyVehicle {
    void siren();
}

//各緊急車両クラス
class FireTruck implements EmergencyVehicle {
    public void siren() {
        SirenUtil.playFireTruckSiren();
    }
}

class Ambulance implements EmergencyVehicle {
    public void siren() {
        SirenUtil.playAmbulanceSiren();
    }
}

class PoliceCar implements EmergencyVehicle {
    public void siren() {
        SirenUtil.playPoliceCarSiren();
    }
}

//指令センター
class DispatchCenter {
 public void dispatch(EmergencyVehicle vehicle) {
     System.out.println("【DispatchCenter】緊急車両出動指令！");
     vehicle.siren();
     System.out.println();
 }
}

public class SirenTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        EmergencyVehicle fire = new FireTruck();
        EmergencyVehicle ambulance = new Ambulance();
        EmergencyVehicle police = new PoliceCar();

        DispatchCenter center = new DispatchCenter();

        center.dispatch(fire);
        center.dispatch(ambulance);
        center.dispatch(police);
	}

}
