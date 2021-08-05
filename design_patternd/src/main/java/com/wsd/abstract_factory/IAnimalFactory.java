package com.wsd.abstract_factory;

/**
 * @PACKAGE_NAME: com.wsd.abstract_factory
 * @NAME: IAnimalFactory
 * @USER: "吴松达"
 * @DATE: 2021/8/5
 * @PROJECT_NAME: use_case
 **/
/**
 * 这个接口就是类图中标识的
 * AbstractFactory抽象工厂
 * @author binghe
 *
 */
public interface IAnimalFactory {
    /**
     * 定义创建Icat接口实例的方法
     * @return
     */
    ICat createCat();
    /**
     * 定义创建IDog接口实例的方法
     * @return
     */
    IDog createDog();
}
