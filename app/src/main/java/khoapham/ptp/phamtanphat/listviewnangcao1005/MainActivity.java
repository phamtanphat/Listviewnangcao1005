package khoapham.ptp.phamtanphat.listviewnangcao1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMenu;
    MenuAdapter menuAdapter;
    ArrayList<Menu> menuArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMenu = findViewById(R.id.listviewMenu);
        menuArrayList.add(new Menu(0,"Bánh mì",25000 ,R.drawable.banhmi));
        menuArrayList.add(new Menu(1,"Cơm sườn",30000 ,R.drawable.comsuon));
        menuArrayList.add(new Menu(2,"Gỏi cuốn",5000 ,R.drawable.goicuon));
        menuArrayList.add(new Menu(3,"Hủ tiếu",15000 ,R.drawable.hutieu));
        menuArrayList.add(new Menu(4,"Sushi",50000 ,R.drawable.sushitemari));
        menuArrayList.add(new Menu(5,"Trà sữa socola",55000,R.drawable.trasuasocola));
        menuArrayList.add(new Menu(6,"Trà sữa trà xanh",60000 ,R.drawable.trasuatraxanh));
        menuArrayList.add(new Menu(7,"Tráng miệng",70000 ,R.drawable.trangmien));
    }
}
