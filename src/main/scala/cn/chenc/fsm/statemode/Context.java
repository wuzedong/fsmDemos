package cn.chenc.fsm.statemode;

import cn.chenc.fsm.bean.ContextData;

/**
 * Created by ChenC on 2016/9/8.
 */

/// Context类，维护一个ConcreteState子类的实例，这个实例定义当前的状态。
public class Context
{
    private State state;

    private ContextData data ;

    public ContextData getData() {
        return data;
    }

    public void setData(ContextData data) {
        this.data = data;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /// 定义Context的初始状态
    public Context(State state ,ContextData data )
    {
        this.data = data;
        this.state = state;
    }

    /// 对请求做处理，并设置下一个状态
    boolean  trueFlag = true;

    public void Request()
    {
        //如果当前step 是最后一步  nextStep 不执行
//        if(!state.isFinalflag()){
//            state.Handle(this);
//        }
//        System.out.println("trueFlag : "+trueFlag);
//        System.out.println("state.isFinalflag() : "+state.isFinalflag());
//        System.out.println("--------------------------");
        if(state.isFinalflag()){
            trueFlag = false;

        }else if (trueFlag == true){
            state.Handle(this);
        }
    }
}





