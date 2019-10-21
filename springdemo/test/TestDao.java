import com.wyzard.dao.GoodDao;
import com.wyzard.dao.impl.GoodDaoImpl;
import com.wyzard.service.GoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TestDao {
    @Autowired
    private GoodDao goodDao;
    @Autowired
    private GoodService goodService;
    @Test
    public void testFindById(){
        int price =goodDao.findPriceById("1");
        System.out.println(price);
    }
    @Test
    public void uodateNumById(){
       goodDao.updateGoods("1");

    }
    @Test
    public void uodateUserById(){
        goodDao.updateBalance("aa",125);

    }
    @Test
    public void buyGoods(){
      goodService.buyGoods("bb","1");

    }
}
