# OptionalView
a full screen drag view.

复习任玉刚老师的《安卓开发艺术探索》自定义view那一章，里面提到不设限的自由跟手view，考虑到实际开发中往往会有状态栏需要考虑，所以试着写了个跟手view的demo，
考虑到系统状态栏高度正常是拿不到的，所以用反射机制去拿  
真正自定义view时只用重写测量的onMeasure,此时需要考虑的是控件本身宽高和手机实际屏幕的宽高关系，也即考虑MeasurSpec  
在具体点击事件中，重写onTouchEvent，主要判断ACTION_MOVE的逻辑  
此外还有一种方案，大致代码如下（未作实现）
```Java
public boolean onTouchEvent(MotionEvent enent) {

{
