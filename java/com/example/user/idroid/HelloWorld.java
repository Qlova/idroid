package com.example.user.idroid;

public class HelloWorld {
	static Stack.Array i_newline = new Stack.Array("\n");
	static void collect_m_something(Stack stack) {
		Stack.Array something = stack.grab();
		stack.push(new Stack.Number(1));
		stack.place(something);
		Stack.Number garbage = stack.get();
		if (garbage.compareTo(new Stack.Number(0)) != 0 ) {
			stack.push(new Stack.Number(0));
			Stack.Number address = stack.get();
			address = new Stack.Number(-1).mul(address);
			garbage = garbage.sub(new Stack.Number(1));
			if (garbage.compareTo(new Stack.Number(0)) != 0 ) {
				garbage = garbage.sub(new Stack.Number(1));
				if (garbage.compareTo(new Stack.Number(0)) != 0 ) {
				// Collect user type TODO
					garbage = new Stack.Number(0).add(new Stack.Number(0));
				} else {
					stack.push(address);
				// HEAPIT
				}
			} else {
				stack.push(address);
				stack.heap();
			}
		}
	}
	
	static void i_unhash(Stack stack) {
		Stack.Number exp = stack.pull();
		Stack.Number num = stack.pull();
		Stack.Array txt = stack.array();
		Stack.Number test = new Stack.Number();
		test = num.compareTo(new Stack.Number(0)) == 0 ? new Stack.Number(1) : new Stack.Number(0);
		if (test.compareTo(new Stack.Number(0)) != 0 ) {
			stack.share(txt);
			return;
		}
		Stack.Number tens = new Stack.Number();
		Stack.Number tens_gt_num = new Stack.Number();
		tens = tens.add(new Stack.Number(1));
	// What is the highest power to 10 which fits in num.
		while (true) {
			tens_gt_num = tens.compareTo(num) == 1 ? new Stack.Number(1) : new Stack.Number(0);
			if (tens_gt_num.compareTo(new Stack.Number(0)) != 0 ) {
				tens = tens.div(exp);
				break;
			}
			tens = tens.mul(exp);
		}
		Stack.Number num_over_tens = new Stack.Number();
		Stack.Number tens_times__l_num_over_tens_l_ = new Stack.Number();
		Stack.Number tens_lt__eq_0 = new Stack.Number();
	// Find each digit.
		while (true) {
			tens_lt__eq_0 = tens.compareTo(new Stack.Number(0)) <= 0 ? new Stack.Number(1) : new Stack.Number(0);
			if (tens_lt__eq_0.compareTo(new Stack.Number(0)) != 0 ) {
				break;
			}
			num_over_tens = num.div(tens);
			tens_times__l_num_over_tens_l_ = tens.mul(num_over_tens);
			num = num.sub(tens_times__l_num_over_tens_l_);
			stack.place(txt);
			stack.put(num_over_tens);
			tens = tens.div(exp);
		}
		stack.share(txt);
	}
	
	static void i_hash(Stack stack) {
		Stack.Array text = stack.grab();
		Stack.Number exp = stack.pull();
		Stack.Number number = new Stack.Number();
		Stack.Number tens = new Stack.Number();
		tens = new Stack.Number(0).add(new Stack.Number(1));
		Stack.Number end = new Stack.Number();
		end = new Stack.Number(0).add(text.size());
		end = end.sub(new Stack.Number(1));
		Stack.Number i = new Stack.Number();
		Stack.Number __first = new Stack.Number();
		i = new Stack.Number(0).add(end);
		while (true) {
			Stack.Number __condition = new Stack.Number();
			if (__first.compareTo(new Stack.Number(0)) != 0 ) {
				i = i.sub(new Stack.Number(1));
			} else {
				__first = new Stack.Number(0).add(new Stack.Number(1));
			}
			__condition = i.compareTo(new Stack.Number(0)) >= 0 ? new Stack.Number(1) : new Stack.Number(0);
			if (__condition.compareTo(new Stack.Number(0)) != 0 ) {
				__condition = new Stack.Number(0).add(new Stack.Number(0));
			} else {
				break;
			}
			stack.place(text);
			stack.push(i);
			Stack.Number tens_times_i = stack.get();
			tens_times_i = tens.mul(tens_times_i);
			number = number.add(tens_times_i);
			tens = tens.mul(exp);
		}
		stack.push(number);
	}
	
	static void strings_equal(Stack stack) {
		Stack.Array str1 = stack.grab();
		Stack.Array str2 = stack.grab();
		Stack.Number len_l_str1_l__not__eq_len_l_str2_l_ = new Stack.Number();
		len_l_str1_l__not__eq_len_l_str2_l_ = str1.size().compareTo(str2.size()) != 0 ? new Stack.Number(1) : new Stack.Number(0);
		if (len_l_str1_l__not__eq_len_l_str2_l_.compareTo(new Stack.Number(0)) != 0 ) {
			stack.push(new Stack.Number(0));
			return;
		}
		Stack.Number iterator = new Stack.Number();
		Stack.Number i_gt__eq_len_l_str1_l_ = new Stack.Number();
		Stack.Number char1_not__eq_char2 = new Stack.Number();
		while (true) {
			i_gt__eq_len_l_str1_l_ = iterator.compareTo(str1.size()) >= 0 ? new Stack.Number(1) : new Stack.Number(0);
			if (i_gt__eq_len_l_str1_l_.compareTo(new Stack.Number(0)) != 0 ) {
				stack.push(new Stack.Number(1));
				return;
			}
			stack.place(str1);
			stack.push(iterator);
			Stack.Number char1 = stack.get();
			stack.place(str2);
			stack.push(iterator);
			Stack.Number char2 = stack.get();
			char1_not__eq_char2 = char1.compareTo(char2) != 0 ? new Stack.Number(1) : new Stack.Number(0);
			if (char1_not__eq_char2.compareTo(new Stack.Number(0)) != 0 ) {
				stack.push(new Stack.Number(0));
				return;
			}
			iterator = iterator.add(new Stack.Number(1));
		}
	}
	
	static void strings_compare(Stack stack) {
		Stack.Array b = stack.grab();
		Stack.Array a = stack.grab();
		stack.push(new Stack.Number(0));
		Stack.Number cmp = stack.pull();
		if (new Stack.Number(1).compareTo(new Stack.Number(0)) != 0 ) {
			Stack.Array i_delete3 = stack.array();
			Stack.Number i = new Stack.Number();
			Stack.Number i_backup2 = new Stack.Number();
			while (true) {
				Stack.Number i_in1 = new Stack.Number();
				i = new Stack.Number(0).add(i_backup2);
				i_in1 = i.compareTo(a.size()) >= 0 ? new Stack.Number(1) : new Stack.Number(0);
				if (i_in1.compareTo(new Stack.Number(0)) != 0 ) {
					break;
				}
				stack.place(a);
				stack.push(i);
				Stack.Number u_char = stack.get();
				i_backup2 = i.add(new Stack.Number(1));
				Stack.Number i_operator4 = new Stack.Number();
				i_operator4 = b.size().compareTo(i) == -1 ? new Stack.Number(1) : new Stack.Number(0);
				if (i_operator4.compareTo(new Stack.Number(0)) != 0 ) {
					cmp = new Stack.Number(0).add(new Stack.Number(1));
					break;
				}
				stack.place(b);
				stack.push(i);
				Stack.Number i_index5 = stack.get();
				stack.push(i_index5);
				Stack.Number i_result6 = stack.pull();
				stack.push(u_char);
				Stack.Number i_result8 = stack.pull();
				Stack.Number i_operator7 = new Stack.Number();
				i_operator7 = i_result6.compareTo(i_result8) != 0 ? new Stack.Number(1) : new Stack.Number(0);
				if (i_operator7.compareTo(new Stack.Number(0)) != 0 ) {
					stack.place(b);
					stack.push(i);
					Stack.Number i_index9 = stack.get();
					stack.push(i_index9);
					Stack.Number i_result10 = stack.pull();
					stack.push(u_char);
					Stack.Number i_result12 = stack.pull();
					Stack.Number i_operator11 = new Stack.Number();
					i_operator11 = i_result10.compareTo(i_result12) == -1 ? new Stack.Number(1) : new Stack.Number(0);
					if (i_operator11.compareTo(new Stack.Number(0)) != 0 ) {
						cmp = new Stack.Number(0).add(new Stack.Number(1));
					} else {
						Stack.Number i_operator13 = new Stack.Number();
						i_operator13 = new Stack.Number(0).sub(new Stack.Number(1));
						cmp = new Stack.Number(0).add(i_operator13);
					}
					break;
				}
			}
			Stack.Number ii_i8 = new Stack.Number();
			Stack.Number ii_backup9 = new Stack.Number();
			while (true) {
				Stack.Number ii_in7 = new Stack.Number();
				ii_i8 = new Stack.Number(0).add(ii_backup9);
				ii_in7 = ii_i8.compareTo(i_delete3.size()) >= 0 ? new Stack.Number(1) : new Stack.Number(0);
				if (ii_in7.compareTo(new Stack.Number(0)) != 0 ) {
					break;
				}
				stack.place(i_delete3);
				stack.push(ii_i8);
				Stack.Number i_v = stack.get();
				ii_backup9 = ii_i8.add(new Stack.Number(1));
				Stack.Number ii_operator11 = new Stack.Number();
				ii_operator11 = a.size().sub(new Stack.Number(1));
				stack.place(a);
				stack.push(ii_operator11);
				Stack.Number ii_index12 = stack.get();
				stack.place(a);
				stack.push(i_v);
				stack.set(ii_index12);
				stack.place(a);
				Stack.Number n = stack.pop();
				n = new Stack.Number(0).add(new Stack.Number(0));
			}
		}
		stack.push(cmp);
	}
	
	static void i_base_number(Stack stack) {
		Stack.Number base = stack.pull();
		Stack.Number num = stack.pull();
		Stack.Array txt = stack.array();
		Stack.Number test = new Stack.Number();
		test = num.compareTo(new Stack.Number(0)) == 0 ? new Stack.Number(1) : new Stack.Number(0);
		if (test.compareTo(new Stack.Number(0)) != 0 ) {
			stack.place(txt);
			stack.put(new Stack.Number(48));
			stack.share(txt);
			return;
		}
		Stack.Number exp = new Stack.Number();
		Stack.Number exp_gt_num = new Stack.Number();
		Stack.Number num_lt_0 = new Stack.Number();
		exp = exp.add(new Stack.Number(1));
		num_lt_0 = num.compareTo(new Stack.Number(0)) == -1 ? new Stack.Number(1) : new Stack.Number(0);
		if (num_lt_0.compareTo(new Stack.Number(0)) != 0 ) {
			stack.place(txt);
			stack.put(new Stack.Number(45));
			num = num.mul(new Stack.Number(-1));
		}
	// What is the highest power to 10 which fits in num.
		while (true) {
			exp_gt_num = exp.compareTo(num) == 1 ? new Stack.Number(1) : new Stack.Number(0);
			if (exp_gt_num.compareTo(new Stack.Number(0)) != 0 ) {
				exp = exp.div(base);
				break;
			}
			exp = exp.mul(base);
		}
		Stack.Number num_over_exp = new Stack.Number();
		Stack.Number exp_times__l_num_over_exp_l_ = new Stack.Number();
		Stack.Number exp_lt__eq_0 = new Stack.Number();
	// Find each digit.
		while (true) {
			exp_lt__eq_0 = exp.compareTo(new Stack.Number(0)) <= 0 ? new Stack.Number(1) : new Stack.Number(0);
			if (exp_lt__eq_0.compareTo(new Stack.Number(0)) != 0 ) {
				break;
			}
			num_over_exp = num.div(exp);
			exp_times__l_num_over_exp_l_ = exp.mul(num_over_exp);
			num = num.sub(exp_times__l_num_over_exp_l_);
			num_over_exp = num_over_exp.add(new Stack.Number(48));
			stack.place(txt);
			stack.put(num_over_exp);
			exp = exp.div(base);
		}
		stack.share(txt);
	}
	
	public static void main(String[] args) { Stack stack = new Stack(); stack.Arguments = args;
		Stack.Array i_string1 = stack.array();
		stack.put(new Stack.Number(72));
		stack.put(new Stack.Number(101));
		stack.put(new Stack.Number(108));
		stack.put(new Stack.Number(108));
		stack.put(new Stack.Number(111));
		stack.put(new Stack.Number(32));
		stack.put(new Stack.Number(87));
		stack.put(new Stack.Number(111));
		stack.put(new Stack.Number(114));
		stack.put(new Stack.Number(108));
		stack.put(new Stack.Number(100));
		stack.share(i_string1);
		stack.stdout();
		stack.share(i_newline);
		stack.stdout();
	}
	
}
