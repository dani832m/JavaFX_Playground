# JavaFX Playground
Dette repository indeholder lidt fri leg med _JavaFX 2.0._

Jeg forsøger at bygge et par simple FX-applikationer ud fra _MVC-princippet._ Inspiration er bl.a. hentet fra videoer på Lynda.com og YouTube. 

### Noter (Udarbejdet af mig selv!)
Alle JavaFX-applikationer...
- SKAL extende klassen _"Application"._
- Har tre metoder, som kan overrides - _"init", "start" og "stop"._
- Har metoden _"start"_, som SKAL overrides, da den som udgangspunkt er erklæret abstrakt. Dette bliver automatisk gjort, hvis man anvender JavaFX template i _IntelliJ_.
- Har én _"primaryStage"_. Herfra laver vi _"scenes"_, som vi tilføjer til vores _"primaryStage"_.

#### Hvad er GridPane?
I JavaFX er _GridPane_ en layout-komponent der lægger child-komponenter ud i et _"grid"_ (gitter). Størrelsen på "cellerne" i gitteret kommer an på komponenterne, der ligges heri. Dog har alle "celler" i samme række den samme højde, og alle "celler" i den samme kolonne har den samme bredde.

**Sådan laves GridPane:**

    GridPane gridPane = new GridPane();
    
**Man kan vise linjerne i sit GridPane ved at tilføje:**

    gridPane.setGridLinesVisible(true);

### Nyttige links
- https://docs.oracle.com/javafx/2/overview/jfxpub-overview.htm
- https://www.youtube.com/watch?v=FLkOX4Eez6o
- https://www.lynda.com/Java-tutorials/JavaFX-GUI-Development/466182-2.html
- https://www.tutorialspoint.com/javafx/index.htm


![alt text](https://i.imgur.com/kJrz2vj.png "Udviklet af dani832m")