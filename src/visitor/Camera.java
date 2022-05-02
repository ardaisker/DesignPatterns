package visitor;

public class Camera implements Unit{
    private String cameraType;
    public String direction;
    public Camera(String cameraType, String direction){
        this.cameraType = cameraType;
        this.direction = direction;
    }
    public void setCameraType(String cameraType){
        this.cameraType = cameraType;
    }

    @Override
    public void accept(TerminationVisitor v) {
        v.visitCamera(this);
    }
}
