package pattern.state.developer;

public class Developer {
    private  Activity activity;

    public Developer(Activity activity) {
        this.activity = activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if(activity  instanceof Sleeping){
            setActivity(new Traning());
         }else  if (activity instanceof Traning){
            setActivity(new Coding());
        }else if (activity instanceof Coding){
            setActivity(new Reading());
        } else {
            setActivity(new Sleeping());
        }

    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
