package lzu.icherub.com.icherub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragment4 extends Fragment  implements  View.OnClickListener{



    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment4, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button alarm = (Button) getActivity().findViewById(R.id.alarmGo);
        alarm.setOnClickListener(this);
    }
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.alarmGo:
                Toast.makeText(mContext, "进入闹钟", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),AlarmActivity.class);
                startActivity(intent);
                break;
        }
    }
    private Context mContext;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = getActivity();
    }




}