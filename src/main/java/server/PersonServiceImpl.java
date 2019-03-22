package server;
import org.apache.thrift.TException;
import thrift.generated.DataException;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class PersonServiceImpl implements PersonService.Iface{

@Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        System.out.println("注册名:" + username);

        Person person = new Person();
        person.setUsername(username);
        person.setAge(27773888);
        person.setMarried(true);

        return person;
    }

@Override
    public void savePerson(Person person) throws DataException, TException {
    if("张三".equals(person.getUsername())){
        System.out.println("注册失败！当前用户已存在");
    }else{
        System.out.println("注册成功");

    }
    }
}