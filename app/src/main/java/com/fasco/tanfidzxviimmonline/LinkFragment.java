package com.fasco.tanfidzxviimmonline;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fasco.tanfidzxviimmonline.adapter.LinkAdapter;
import com.fasco.tanfidzxviimmonline.model.LinkModel;

public class LinkFragment extends ListFragment {


    public LinkFragment() {
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_link, container, false);


        return rootView;

    }


    @Override

    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        LinkAdapter adapter = new LinkAdapter(getActivity());

        adapter.add(new LinkModel(R.drawable.ic_fatwatarjih, "PP Muhammadiyah", "http://muhammadiyah.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_ppaisyiyah, "PP 'Aisyiyah", "http://aisyiyah.or.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_pppemuda, "PP Pemuda Muhamadiyah", "http://pp-pemudamuhammadiyah.org/", ""));

        adapter.add(new LinkModel(R.drawable.ic_ppna, "PP Nasyiatul 'Aisyiyah", "http://nasyiah.or.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_ppipm, "PP IPM", "http://ipm.or.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_kwarnashw, "Kwarnas Hizbul Wathan", "http://hizbulwathan.or.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_pptapaksuci, "PP Tapak Suci", "http://pp-tapaksuci.org/", ""));

        adapter.add(new LinkModel(R.drawable.ic_diktimuh, "Majlis Dikti PP Muh.", "majelisdiktimuhammadiyah.org", "" ));

        adapter.add(new LinkModel(R.drawable.ic_fatwatarjih, "Fatwa Tarjih Muhammadiyah", "fatwatarjih.com", ""));

        adapter.add(new LinkModel(R.drawable.ic_lazismu, "Lazismu Pusat", "http://lazismu.org/", ""));

        adapter.add(new LinkModel(R.drawable.ic_fatwatarjih, "Radio Muhammadiyah", "http://radiomu.web.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_fatwatarjih, "Suara Muhammadiyah", "http://suaramuhammadiyah.com", ""));

        adapter.add(new LinkModel(R.drawable.ic_muktamar47muh, "Website Muktamar Muhammadiyah Ke-47", "http://muktamar47.muhammadiyah.or.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_sangpencerah, "Website Sang Pencerah", "http://www.sangpencerah.com/", ""));

        adapter.add(new LinkModel(R.drawable.ic_muhammadiyahstudies, "Muhammadiyah Studies", "http://muhammadiyahstudies.blogspot.com/", ""));

        adapter.add(new LinkModel(R.drawable.ic_mentarinews,"Mentari News", "http://mentarinews.co.id", ""));

        adapter.add(new LinkModel(R.drawable.ic_toserbamuh, "Toserba Surya Mandiri", "http://www.toserba-suryamandiri.com/", ""));

        adapter.add(new LinkModel(R.drawable.ic_dppimm, "Website DPP IMM", "http://www.dppimm.or.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_dppimm, "DPD IMM Sumatera Utara", "http://immsumut.blogspot.com/", ""));

        adapter.add(new LinkModel(R.drawable.ic_dppimm, "DPD IMM Jawa Tengah", "http://www.immjateng.or.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_dppimm, "DPD IMM D.I.Yogyakarta", "http://www.immdiy.or.id/", ""));

        adapter.add(new LinkModel(R.drawable.ic_dppimm, "DPD IMM Kalimantan Tengah", "http://immkalteng.blogspot.com/", ""));

        adapter.add(new LinkModel(R.drawable.ic_dppimm, "DPD IMM Kalimantan Selatan", "http://immkalsel.blogspot.com/", ""));

        adapter.add(new LinkModel(R.drawable.ic_mimindigenous, "MIM Indigeneous", "http://mimindigenous.blogspot.com/", ""));

        adapter.add(new LinkModel(R.drawable.ic_penamerahinstitute, "Pena Merah Institute", "http://penamerahinstitute.blogspot.com/", ""));



        getListView().setAdapter(adapter);
    }

}