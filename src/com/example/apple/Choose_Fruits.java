package com.example.apple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

/*public class Choose_Fruits extends ListActivity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 创建Adapter
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.fruits_item,
				new String[] { "img", "title", "info" }, new int[] { R.id.img, R.id.title, R.id.info });
		setListAdapter(adapter);
	}*/
public class Choose_Fruits extends Activity {

	// 定义图片数组
	private int img[] = new int[] { R.drawable.drawable_apple, R.drawable.drawable_pear, R.drawable.drawable_grape,
			R.drawable.drawable_orange };
	// 定义显示的水果、描述
	// private String data[][] = new String[][] { { "苹果", "又大又甜" }, { "梨", "水多"
	// }, { "葡萄", "粉嫩粉嫩" }, { "橘子", "又酸又甜" }, };
	private String[] names = new String[] { "苹果", "梨", "葡萄", "橘子" };
	private String[] descs = new String[] { "又大又甜", "水多", "粉嫩粉嫩", "又酸又甜" };

	/*
	 * private ListView lv = null; private List<Map<String, String>> list = new
	 * ArrayList<Map<String, String>>(); private SimpleAdapter simpleadapter =
	 * null; private TextView info = null;
	 */

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose_fruits);
		List<Map<String, Object>> ListItems = new ArrayList<Map<String, Object>>();

		// 将每一条记录添加到Map中
		for (int i = 0; i < names.length; i++) {
			Map<String, Object> listItem = new HashMap<String, Object>();
			listItem.put("img", String.valueOf(img[i]));
			listItem.put("names", names[i]);
			listItem.put("descs", descs[i]);
			ListItems.add(listItem);
		}

		// 创建一个SimpleAdapter
		SimpleAdapter simpleAdapter = new SimpleAdapter(this, ListItems, R.layout.fruits_item,
				new String[] { "img", "names", "descs" }, new int[] { R.id.img, R.id.title, R.id.info });
		ListView list = (ListView) findViewById(R.id.listview);
		list.setAdapter(simpleAdapter);
		/*
		 * for (int i=0;i < data.length; i++) { // 定义Map数据 Map<String,String>
		 * map = new HashMap<String, String>(); // 添加数据 map.put("img",
		 * String.valueOf(img[i])); map.put("name", data[i][0]);
		 * map.put("score", data[i][1]); this.list.add(map); }
		 * this.simpleadapter = new SimpleAdapter(this, this.list,
		 * R.layout.fruits_item, new String[] { "img", "title", "info" }, new
		 * int[] { R.id.img, R.id.title, R.id.info }); //
		 * setListAdapter(adapter); lv.setAdapter(simpleadapter);
		 * 
		 * 添加点击事件 lv.setOnItemClickListener(new OnItemClickListenerImp());
		 */
		OnItemClickListener mItemClickListener = new OnItemClickListener() {
		    @Override
		    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		         // TODO Auto-generated method stub
		    	Log.i("text", "OnItemClickListener");
		    }
		};
		list.setOnItemClickListener(mItemClickListener);
	}

	/*
	 * private List<Map<String, Object>> getData() {
	 * 
	 * List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	 * 
	 * Map<String, Object> map = new HashMap<String, Object>(); map.put("img",
	 * R.drawable.drawable_apple); map.put("title", "苹果"); map.put("info",
	 * "又大又甜"); list.add(map);
	 * 
	 * map = new HashMap<String, Object>(); map.put("img",
	 * R.drawable.drawable_pear); map.put("title", "梨"); map.put("info", "水多");
	 * list.add(map);
	 * 
	 * map = new HashMap<String, Object>(); map.put("img",
	 * R.drawable.drawable_grape); map.put("title", "葡萄"); map.put("info",
	 * "小葡萄"); list.add(map);
	 * 
	 * map = new HashMap<String, Object>(); map.put("img",
	 * R.drawable.drawable_orange); map.put("title", "橘子"); map.put("info",
	 * "红"); list.add(map);
	 * 
	 * map = new HashMap<String, Object>(); map.put("img",
	 * R.drawable.ic_launcher); map.put("title", "hello"); map.put("info",
	 * "every thing"); list.add(map);
	 * 
	 * map = new HashMap<String, Object>(); map.put("img",
	 * R.drawable.ic_launcher); map.put("title", "world"); map.put("info",
	 * "hello world"); list.add(map);
	 * 
	 * return list; }
	 */

}
