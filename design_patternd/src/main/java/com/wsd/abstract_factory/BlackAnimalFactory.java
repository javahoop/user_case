package com.wsd.abstract_factory;

/**
 * @ClassName BlackAnimalFactory
 * @Author wsd
 * @Date 2021/8/5 20:24
 * @Version 1.0
 **/
/**
 * IAnimalFactory抽象工厂的实现类
 * @author binghe
 */
public class BlackAnimalFactory implements IAnimalFactory {

    public ICat createCat() {
        return new BlackCat();
    }
    public IDog createDog() {
        return new BlackDog();
    }
}
