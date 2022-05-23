package sg.edu.np.mad.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create new user object
        user myUser= new user();
        myUser.setFollowed(false);

        //button press -> check follow -> change button
        Button flw =findViewById(R.id.followButton);
        flw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (myUser.isFollowed()){
                    myUser.setFollowed(false);
                    flw.setText("Follow");
                }
                else{
                    myUser.setFollowed(true);
                    flw.setText("Unfollow");
                }
            }
        });
    }
}