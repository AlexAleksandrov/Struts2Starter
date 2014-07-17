import service.TutorialFinderService;

/**
 * Created by Administrator on 14.07.2014.
 */
public class TurorialActionClass {

    String bestTutorial;

    public String getBestTutorial() {
        return bestTutorial;
    }

    public void setBestTutorial(String bestTutorial) {
        this.bestTutorial = bestTutorial;
    }

    public String execute() {
        System.out.println("Hello from execute");

        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        setBestTutorial(tutorialFinderService.getBestTutorial());

        return "success";
    }
}
