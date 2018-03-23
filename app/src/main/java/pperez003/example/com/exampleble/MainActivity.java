package pperez003.example.com.exampleble;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.widget.Toast;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import pperez003.example.com.exampleble.ble.BleCommManager;
public class MainActivity extends AppCompatActivity {

    /** Constants **/
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int REQUEST_ENABLE_BT = 1;
    /** Bluetooth Stuff **/
    private BleCommManager mBleCommManager;
    private BluetoothAdapter BA;

    /**
     * Load Activity for the first time
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textState= (TextView)findViewById(R.id.textState01);
       // boolean bluetoothEnabled;
        Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(turnOn, 0);
        BA = BluetoothAdapter.getDefaultAdapter();
       if(BA.isEnabled()){textState.setText("Bluetooth ON");}
        else textState.setText("Bluetooth OFF");

    }


}
