package com.mistong.annotation;

import java.util.Set;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;


/**
 * Created by sk on 2017/12/5.
 */
@SupportedAnnotationTypes("com.mistong.annotation.MainModule")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class BaseProcessor extends AbstractProcessor {

    // 元素操作的辅助类
    Elements elementUtils;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv)
    {
        super.init(processingEnv);
        // 元素操作的辅助类
        elementUtils = processingEnv.getElementUtils();
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
//   第一步，根据我们自定义的注解拿到 elememts set 集合
        Set<? extends Element> elememts = roundEnvironment.getElementsAnnotatedWith(MainModule.class);
        TypeElement typeElement;
        VariableElement variableElement;

        System.out.print("aaaaaa");
        //  第二步： 根据 element 的类型做相应的处理，并存进 map 集合
        for (Element element : elememts) {
            ElementKind kind = element.getKind();
            // 判断该元素是否为类
            if (kind == ElementKind.CLASS) {
                typeElement = (TypeElement) element;

                System.out.print("aaaaaa");
                // 判断该元素是否为成员变量
            } else if (kind == ElementKind.FIELD) {
                variableElement = (VariableElement) element;
            }
        }
        return true;～
    }


}
