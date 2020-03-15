package test;

import pojo.*;
import org.junit.*;
import dao.CampaignDAOImpl;

/**
 * testCampaignDao
 */
public class testCampaignDao extends junit.framework.TestCase {

    @Test
    public void testAdd() {
        final int times = 2;
        final int number = 100;
        Campaign campaign = new Campaign();
        campaign.setTimes(times);
        campaign.setTotal(number);

        CampaignDAOImpl campaignDao = new CampaignDAOImpl();
        campaignDao.add(campaign);
    }

    @Test
    public void testGet() {        
        CampaignDAOImpl campaignDao = new CampaignDAOImpl();
        Campaign campaign = campaignDao.get();
        System.out.println(campaign.toString());
    }

    @Test
    public void testUpdate() {

        final int times = 1;
        final int number = 50;
        Campaign campaign = new Campaign();
        campaign.setTimes(times);
        campaign.setTotal(number);
        CampaignDAOImpl campaignDao = new CampaignDAOImpl();
        campaignDao.update(campaign);
    }

    @Test
    public void testGetTimes() {

        CampaignDAOImpl campaignDao = new CampaignDAOImpl();
        campaignDao.getTimes();
        //System.out.println(campaignDao.getTimes());
    }
}