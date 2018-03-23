package pperez003.example.com.exampleble.ble;

/**
 * Created by pperez003 on 22/03/2018.
 */
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;

public class BleCommManager {
    private static final String TAG = BleCommManager.class.getSimpleName();
    private BluetoothAdapter mBluetoothAdapter; // Andrdoid's Bluetooth

    /**
     * Initialize the BleCommManager
     *
     * @param context the Activity context
     * @throws Exception Bluetooth Low Energy is not supported
     */
    public BleCommManager(final Context context) throws Exception {
// make sure Android device supports Bluetooth Low Energy
        if (!context.getPackageManager().
                hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE))
        {
            throw new Exception("Bluetooth Not Supported");
        }
// get a reference to the Bluetooth Manager class,
// which allows us to talk to talk to the BLE radio
        final BluetoothManager bluetoothManager = (BluetoothManager)
                context.getSystemService(Context.BLUETOOTH_SERVICE);
        mBluetoothAdapter = bluetoothManager.getAdapter();
    }
    /**
     * Get the Android Bluetooth Adapter
     */
    public BluetoothAdapter getBluetoothAdapter() {
        return mBluetoothAdapter;
    }
}
