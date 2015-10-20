package com.epicodus.breakthecode.models;

import com.epicodus.breakthecode.R;

import java.util.ArrayList;

/**
 * Created by Guest on 10/20/15.
 */
public class SponsorLib {
    private ArrayList<Sponsor> mSponsors;

    public SponsorLib() {
        setSponsors();
    }

    private void setSponsors() {
        mSponsors = new ArrayList<>();

        mSponsors.add(new Sponsor(
                "The Clymb",
                "The Clymb offers you 50-75% off retail prices on the best outdoor gear, apparel, and adventures on the planet. Your membership is free. New deals are guaranteed daily. ",
                "http://www.theclymb.com/",
                R.drawable.clymb

        ));
        mSponsors.add(new Sponsor(
                "Columbia Ultimate",
                "Today we offer an end-to-end line of collection software and services to help organizations automate, analyze, manage and handle accounts. Collection agencies, banks, healthcare, and retail organizations, along with state, county, and local governments nationwide all rely on Columbia Ultimate solutions to maximize collection performance, reduce costs, and collect more dollars.",
                "https://www.columbiaultimate.com/",
                R.drawable.columbia_ultimate

        ));
        mSponsors.add(new Sponsor(
                "Crowd Compass",
                "CrowdCompass is the world's largest developer of mobile event apps and conference apps.",
                "http://www.crowdcompass.com/",
                R.drawable.crowdcompass_logo
        ));
        mSponsors.add(new Sponsor(
                "Development Now",
                "We’re an award-winning digital product solutions agency\n" +
                        "We integrate mobile, web, and hardware solutions to fit any use case, bringing innovative products to market and helping companies improve existing products.",
                "http://developmentnow.com/",
                R.drawable.developmentnow

        ));
        mSponsors.add(new Sponsor(
                "Globesherpa",
                "GlobeSherpa provides a secure, mobile ticketing platform for transit systems interested in moving to open payments, open data, and mobile fare collection with minimal infrastructure investment. ",
                "http://www.globesherpa.com/",
                R.drawable.globe_sherpa

        ));
        mSponsors.add(new Sponsor(
                "Jive",
                "Jive is the leading provider of modern communication and collaboration solutions for business.",
                "https://www.jivesoftware.com/",
                R.drawable.jive
        ));
        mSponsors.add(new Sponsor(
                "Thetus",
                "Our passion is to design, develop and deliver software to people who need to critically examine their complex challenges and risks. Beyond the software delivery, we take a truly partner-oriented approach by providing superior support services—at Thetus, we gauge our success by the success of our customers.",
                "https://www.thetus.com",
                R.drawable.ThetusLogo_small_copy

        ));
        mSponsors.add(new Sponsor(
                "Simple",
                "With Simple, you get a stylish Simple Visa® Card, no fees, and powerful budgeting and savings tools built right into your account—all accessible via web, iPhone, and Android.",
                "https://www.simple.com/",
                R.drawable.simple_small_applications

        ));
        mSponsors.add(new Sponsor(
                "Smarsh",
                "Smarsh is the leading provider of archiving & compliance solutions for companies in regulated and litigious industries. Smarsh is headquartered in beautiful Portland, Oregon with offices worldwide. ",
                "http://www.smarsh.com/",
                R.drawable.smarsh

        ));
        mSponsors.add(new Sponsor(
                "Uncorked Studio",
                "From the world’s biggest brands to fast moving startups, the partnerships we have with our clients help enable us to explore the boundaries of what’s possible today, and provide the vision and imagination that will help shape tomorrow.\n" +
                        "\n",
                "https://uncorkedstudios.com/",
                R.drawable.uncorked_logo300

        ));
    }
}
