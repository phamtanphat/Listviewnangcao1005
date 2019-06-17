package khoapham.ptp.phamtanphat.listviewnangcao1005;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuAdapter extends BaseAdapter {
    ArrayList<Menu> mangmenu;
    Context context;
    public MenuAdapter(ArrayList<Menu> arrayListmenu ,Context context ){
        mangmenu = arrayListmenu;
        this.context = context;
    }
    //trả về số dòng
    @Override
    public int getCount() {
        return mangmenu.size();
    }

    @Override
    public Object getItem(int position)
    {
        return mangmenu.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.dong_item_menu,null);

        TextView txtTenmonan = convertView.findViewById(R.id.textviewTenmenu);
        TextView txtGiamonan = convertView.findViewById(R.id.textviewGiamenu);
        ImageView imgMonan = convertView.findViewById(R.id.imageviewMenu);

//        Menu menu = (Menu) getItem(position);
        Menu menu = (Menu) getItem(position);
        txtTenmonan.setText(menu.getTen());
        txtGiamonan.setText(menu.getGia() + " Đ");
        imgMonan.setImageResource(menu.getHinhanh());
        return convertView;
    }
}
