package 逻辑运算符;

public class LogicOperator {
	//说明逻辑运算规则：
	//a&b:&叫逻辑与:规则:当 a和 b同时为 true,则结果为 true,否则为 false
	//a&&b:&&叫短路与:规则：当 a和 b同时为 true,则结果为 true,否则为 false
	//a|b:|叫逻辑或,规则:当 a和 b,有一个为 true ,则结果为 true,否则为 false
	//a||b:||叫短路或,规则:当 a和 b,有一个为 true,则结果为 true,否则为 false
	//!a:叫取反，或者非运算:当 a为 true,则结果为 false,当 a为 false是,结果为 true
    //a^b:叫逻辑异或,当 a和 b不同时，则结果为 true,否则为 false
	
	//&&和&使用区别
	//对于&&短路与而言,如果第一个条件为 false,后面的条件不再判断
	//对于&逻辑与而言,如果第一个条件为 false,后面的条件仍然会判断
	
	//||和|使用区别
	//||短路或：如果第一个条件为 true，则第二个条件不会判断，最终结果为 true，效率高
	//|逻辑或：不管第一个条件是否为 true，第二个条件都要判断，效率低
	//开发中，我们基本使用 ||
	
	//!非（取反）
	//条件:如果条件本身成立，结果为 false，否则为 true
	//!操作是取反 T->F,F->T 
	
	//a^b:叫逻辑异或,当 a和 b不同时,则结果为 true,否则为 false 
	
	
	
}
