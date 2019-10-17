package com.internshala.echo.Fragments


import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.internshala.echo.R


/**
 * A simple [Fragment] subclass.
 *
 */
class AboutUsFragment : Fragment() {
    var myActivity: Activity? = null
    var developerPhoto: ImageView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        activity?.title = "About Us"
        val view = inflater!!.inflate(R.layout.fragment_about_us, container, false)
        developerPhoto = view?.findViewById(R.id.developer_photo)
        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        myActivity = context as Activity
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        myActivity = activity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onPrepareOptionsMenu(menu: Menu?) {
        super.onPrepareOptionsMenu(menu)
        val item = menu?.findItem(R.id.action_sort)
        val item2 = menu?.findItem(R.id.action_search)
        item2?.isVisible = false
        item?.isVisible = false


    }
}
