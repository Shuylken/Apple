package com.example.apple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
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
	private ListView lv;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose_fruits);
		lv = (ListView) findViewById(R.id.listview);
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.fruits_item,
				new String[] { "img", "title", "info" }, new int[] { R.id.img, R.id.title, R.id.info });
		// setListAdapter(adapter);
		lv.setAdapter(adapter);
	}

	private List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("img", R.drawable.drawable_apple);
		map.put("title", "苹果");
		map.put("info", "又大又甜");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("img", R.drawable.drawable_pear);
		map.put("title", "梨");
		map.put("info", "水多");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("img", R.drawable.ic_launcher);
		map.put("title", "葡萄");
		map.put("info", "小葡萄");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("img", R.drawable.ic_launcher);
		map.put("title", "桃子");
		map.put("info", "红");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("img", R.drawable.ic_launcher);
		map.put("title", "hello");
		map.put("info", "every thing");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("img", R.drawable.ic_launcher);
		map.put("title", "world");
		map.put("info", "hello world");
		list.add(map);

		return list;
	}
}
