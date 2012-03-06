package spark.examples;

import spark.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import scala.*;
import scala.runtime.*;
import scala.reflect.*;

class JavaUtils {
  public static abstract class GenFunction extends scala.runtime.AbstractFunction1<java.lang.Object, java.lang.Object> implements java.io.Serializable {
    public abstract java.lang.Object apply(java.lang.Object o);
  }
  
  public static class CManifest {
    private java.lang.Class orig;
    private ClassManifest cm;
    public CManifest(java.lang.Class c) {
      orig = c;
      cm = ClassManifest$.MODULE$.fromClass(c);
    }
    
    public ClassManifest manifest() {
      return cm;
    }
  }
}