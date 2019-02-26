package dad.models;

import dad.PokeDexAPP;
import dad.models.estructura.Pokemon;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.scene.image.Image;
import javafx.scene.media.Media;

/**
 * Modelo vinculado a la vista
 */
public class Model {
    private PokemonProperty actual;
    private ObjectProperty<Image> frame1;
    private ObjectProperty<Image> frame2;
    private ObjectProperty<Media> media;
    private StringProperty busqueda;
    private BooleanProperty mute;

    /**
     * Constructor
     */
    public Model() {
        actual = new PokemonProperty(this);
        frame1 = new SimpleObjectProperty<>(this, "FRAME 1");
        frame2 = new SimpleObjectProperty<>(this, "FRAME 2");
        media = new SimpleObjectProperty<>(this, "MEDIA");
        busqueda = new SimpleStringProperty(this, "busqueda", "");
        mute = new SimpleBooleanProperty(this, "CRY MUTE");
    }

    /**
     * @return El pokemon actual que esté mostrandose en la pantalla
     */
    public PokemonProperty getActual() {
        return actual;
    }

    /**
     * @param pkm Un objeto pokemon que se vinculara a la pantalla
     */
    public void setActual(Pokemon pkm) {
        actual.setId(pkm.getId());
        actual.setNombre(pkm.getNombre());
        actual.setDescripcion(pkm.getDescripcion());
        actual.setPeso(pkm.getPeso());
        actual.setAltura(pkm.getAltura());
        actual.setEvoluciones(FXCollections.observableArrayList(pkm.getEvoluciones()));
        actual.setTipos(FXCollections.observableArrayList(pkm.getTipos()));
        actual.setEvoluciones(FXCollections.observableArrayList(pkm.getEvoluciones()));

        setFrame1(new Image(PokeDexAPP.class.getResource("/image/pokemon/" + actual.getId() + ".png").toString()));
        setFrame2(new Image(PokeDexAPP.class.getResource("/image/pokemon/frame2/" + actual.getId() + ".png").toString()));

        setMedia(new Media(PokeDexAPP.class.getResource("/sounds/cries/" + actual.getId() + ".mp3").toString()));
    }

    /**
     * @return Image con el primer frame del la animacion en pantalla
     */
    public Image getFrame1() {
        return frame1.get();
    }

    /**
     * @return Object property de imagen del primer frame de la animacion en pantalla
     */
    public ObjectProperty<Image> frame1Property() {
        return frame1;
    }

    /**
     * @param frame1
     */
    public void setFrame1(Image frame1) {
        this.frame1.set(frame1);
    }

    /**
     * @return Image con el segundo frame del la animacion en pantalla
     */
    public Image getFrame2() {
        return frame2.get();
    }

    /**
     * @return Object property de imagen del segundo frame de la animacion en pantalla
     */
    public ObjectProperty<Image> frame2Property() {
        return frame2;
    }

    /**
     * @param frame2
     */
    public void setFrame2(Image frame2) {
        this.frame2.set(frame2);
    }

    /**
     * @return StringProperty enlazado a la barra de busqueda
     */
    public final StringProperty busquedaProperty() {
        return this.busqueda;
    }

    /**
     * @return el texto de la barra de busqueda
     */
    public final String getBusqueda() {
        return this.busquedaProperty().get();
    }

    /**
     * @param busqueda
     */
    public final void setBusqueda(final String busqueda) {
        this.busquedaProperty().set(busqueda);
    }

    /**
     * @param actual El pokemon que se mostrará en pantalla
     */
    public void setActual(PokemonProperty actual) {
        this.actual = actual;
    }

    /**
     * @return Media con el sonido del pokemon que esta en pantalla
     */
    public Media getMedia() {
        return media.get();
    }

    /**
     * @return ObjectProperty de media con el sonido del pokemon que esta en pantalla
     */
    public ObjectProperty<Media> mediaProperty() {
        return media;
    }

    /**
     * @param media
     */
    public void setMedia(Media media) {
        this.media.set(media);
    }

    /**
     * @return Boleaan con muteado actualmente el sonido de los gritos al cambiar de pokemon
     */
    public boolean isMute() {
        return mute.get();
    }

    /**
     * @return BooleanProperty enlazado a la checkbox de mute
     */
    public BooleanProperty muteProperty() {
        return mute;
    }

    /**
     * @param mute
     */
    public void setMute(boolean mute) {
        this.mute.set(mute);
    }
}
