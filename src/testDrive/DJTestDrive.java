package testDrive;

import controller.BeatController;
import controller.ControllerInterface;
import model.BeatModel;
import model.BeatModelInterface;
import view.GeneralView;
import view.ViewInterface;

public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
    	ControllerInterface controller = new BeatController(model);
    	ViewInterface vista = new GeneralView();
    	vista.setModel(model,controller);
    	
    }
}
