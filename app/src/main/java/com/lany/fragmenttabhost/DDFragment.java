package com.lany.fragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class DDFragment  extends Fragment implements OnTabReselectListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		return inflater.inflate(R.layout.fragment_4, null);
	}

	@Override
	public void onTabReselect() {
		Toast.makeText(getActivity(), "DD", Toast.LENGTH_SHORT).show();
	}
}