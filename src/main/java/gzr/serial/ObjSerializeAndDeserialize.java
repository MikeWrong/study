package gzr.serial;

import gzr.object.Person;

import java.io.*;
import java.text.MessageFormat;

/**
 * ���Զ�������л��ͷ����� ת����http://ych0108.iteye.com/blog/2252544
 * Created by gaozengrong on 16/11/22.
 * ������л�Person֮��,���Ҳ���ʽ����Person��serialVersionUID,ֱ�ӷ����л�,�ᱨ��local class incompatible: stream classdesc serialVersionUID = -2569740845621051313, local class serialVersionUID = 7251461725026093025
 * ԭ��:δָ��serialVersionUID�������,���������������һ��serialVersionUID
 */
public class ObjSerializeAndDeserialize {
    public static void main(String[] args) throws Exception {
        SerializePerson();              //���л�Person����
        Person deserializePerson = DeserializePerson();//������Peron����
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",
                deserializePerson.getName(), deserializePerson.getAge(), deserializePerson.getSex()));
    }

    /**
     * MethodName: SerializePerson
     * Description: ���л�Person����
     */
    private static void SerializePerson() throws IOException {
        Person person = new Person();
        person.setName("gaozengrong");
        person.setAge(25);
        person.setSex("��");
        // ObjectOutputStream �������������Person����洢��Person.txt�ļ��У���ɶ�Person��������л�����
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("/Users/gaozengrong/Downloads/Person.txt")));
        oo.writeObject(person);
        System.out.println("Person�������л��ɹ���");
        oo.close();
    }

    /**
     * MethodName: DeserializePerson
     * Description: ������Perons����
     */
    private static Person DeserializePerson() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("/Users/gaozengrong/Downloads/Person.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("Person�������л��ɹ���");
        return person;
    }
}
