package necer.ncalendardemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.necer.ncalendar.utils.MyLog;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Months;

import java.util.ArrayList;
import java.util.List;

import necer.ncalendardemo.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvVersion = (TextView) findViewById(R.id.tv_version);
        tvVersion.setText("版本：" + Utils.getCurrentVersion(this));

    }


    public void miui10(View v) {
        startActivity(new Intent(this, TestMiui10Activity.class));
    }

    public void miui9(View v) {
        startActivity(new Intent(this, TestMiui9Activity.class));

    }

    public void emui(View v) {
        startActivity(new Intent(this, TestEmuiActivity.class));
    }


}