# JavaFX Playground
Dette repository indeholder lidt fri leg med _JavaFX 2.0._

Jeg forsøger at bygge et par simple FX-applikationer ud fra _MVC-princippet._ Inspiration er bl.a. hentet fra videoer på Lynda.com og YouTube. 

![alt text](https://i.imgur.com/voqbPFg.png "Screenshots af GUI")


    WHAT IS JAVAFX?
    JavaFX is a Java library used to build Rich Internet Applications. The applications written using this library can run consistently across multiple platforms. The applications developed using JavaFX can run on various devices such as Desktop Computers, Mobile Phones, TVs, Tablets, etc.
    To develop GUI Applications using Java programming language, the programmers rely on libraries such as Advanced Windowing Toolkit and Swing. After the advent of JavaFX, these Java programmers can now develop GUI applications effectively with rich content.


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
    
#### Hvad er BorderPane?
_BorderPane_ er en anden layout-komponent, som placerer child nodes enten i toppen, bunden, til højre eller venstre. Hver region kan kun have én node. Læs mere her: http://www.java2s.com/Tutorials/Java/JavaFX/0330__JavaFX_BorderPane.htm

**Sådan laves BorderPane:**

    BorderPane bp = new BorderPane();
    
### Nyttige links
- https://docs.oracle.com/javafx/2/overview/jfxpub-overview.htm
- https://www.youtube.com/watch?v=FLkOX4Eez6o
- https://www.lynda.com/Java-tutorials/JavaFX-GUI-Development/466182-2.html
- https://www.tutorialspoint.com/javafx/index.htm


![alt text](https://i.imgur.com/kJrz2vj.png "Udviklet af dani832m")