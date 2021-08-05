package com.wsd.abstract_factory;

/**
 * @ClassName WhiteAnimalFactory
 * @Author wsd
 * @Date 2021/8/5 20:24
 * @Version 1.0
 **/
/**
 * IAnimalFactory抽象工厂的实现类
 * @author binghe
 *
 */
public class WhiteAnimalFactory implements IAnimalFactory {
    public ICat createCat() {
        return new WhiteCat();
    }
    public IDog createDog() {
        return new WhiteDog();
    }
}
