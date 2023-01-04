/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Player2 extends ASTRAClass {
	public Player2() {
		setParents(new Class[] {astra.lang.Agent.class});
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.INTEGER, "Sq",false)
			}),
			new Predicate("spot", new Term[] {
				new Variable(Type.INTEGER, "Sq"),
				Primitive.newPrimitive("free")
			})
		));
		addInference(new Inference(
			new Predicate("winner", new Term[] {
				new Variable(Type.STRING, "T",false)
			}),
			new AND(
				new Predicate("line", new Term[] {
					new Variable(Type.INTEGER, "L1",false),
					new Variable(Type.INTEGER, "L2",false),
					new Variable(Type.INTEGER, "L3",false)
				}),
				new AND(
					new Predicate("spot", new Term[] {
						new Variable(Type.INTEGER, "L1"),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new Predicate("spot", new Term[] {
							new Variable(Type.INTEGER, "L2"),
							new Variable(Type.STRING, "T")
						}),
						new AND(
							new Predicate("spot", new Term[] {
								new Variable(Type.INTEGER, "L3"),
								new Variable(Type.STRING, "T")
							}),
							new Comparison("~=",
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive("done")
							)
						)
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("drawn", new Term[] {
				new Variable(Type.STRING, "T",false)
			}),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new NOT(
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "L",false)
						})
					),
					new NOT(
						new Predicate("winner", new Term[] {
							new Variable(Type.STRING, "T2",false)
						})
					)
				)
			)
		));
		addRule(new Rule(
			"Player2", new int[] {54,10,54,26},
			new BeliefEvent('+',
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "T",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player2", new int[] {54,25,56,11},
				new Statement[] {
					new Subgoal(
						"Player2", new int[] {55,10,56,11},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player2", new int[] {71,10,71,46},
			new BeliefEvent('+',
				new Predicate("move", new Term[] {
					new Variable(Type.STRING, "T",false),
					new Variable(Type.INTEGER, "Sq",false)
				})
			),
			new Predicate("free", new Term[] {
				new Variable(Type.INTEGER, "Sq")
			}),
			new Block(
				"Player2", new int[] {71,45,82,11},
				new Statement[] {
					new BeliefUpdate('+',
						"Player2", new int[] {72,10,82,11},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "Sq")
						})
					),
					new ModuleCall("C",
						"Player2", new int[] {73,10,73,52},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive(""),
								Operator.newOperator('+',
									new Variable(Type.STRING, "T"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" MOVES TO SQUARE "),
										new Variable(Type.INTEGER, "Sq")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player2","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Query(
						"Player2", new int[] {75,10,75,37},
						new Predicate("opponent", new Term[] {
							new Variable(Type.STRING, "opp",false)
						})
					),
					new Send("Player2", new int[] {76,10,76,42},
						new Performative("inform"),
						new Variable(Type.STRING, "opp"),
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "Sq")
						})
					),
					new If(
						"Player2", new int[] {78,10,82,11},
						new Comparison("==",
							new QueryTerm(
								new Predicate("winner", new Term[] {
									new Variable(Type.STRING, "T")
								})
							),
							Primitive.newPrimitive(true)
						),
						new Block(
							"Player2", new int[] {78,38,81,11},
							new Statement[] {
								new Send("Player2", new int[] {79,15,79,39},
									new Performative("inform"),
									new Variable(Type.STRING, "opp"),
									new Predicate("end", new Term[] {})
								),
								new BeliefUpdate('+',
									"Player2", new int[] {80,15,81,11},
									new Predicate("end", new Term[] {})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player2", new int[] {84,10,84,37},
			new BeliefEvent('+',
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "T",false),
					new Variable(Type.INTEGER, "Sq",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player2", new int[] {84,36,88,6},
				new Statement[] {
					new BeliefUpdate('-',
						"Player2", new int[] {85,10,88,6},
						new Predicate("spot", new Term[] {
							new Variable(Type.INTEGER, "Sq"),
							Primitive.newPrimitive("free")
						})
					),
					new BeliefUpdate('+',
						"Player2", new int[] {86,10,88,6},
						new Predicate("spot", new Term[] {
							new Variable(Type.INTEGER, "Sq"),
							new Variable(Type.STRING, "T")
						})
					),
					new BeliefUpdate('-',
						"Player2", new int[] {87,10,88,6},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player2", new int[] {90,10,90,68},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "T",false),
					new Variable(Type.INTEGER, "Sq",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player2", new int[] {90,67,99,6},
				new Statement[] {
					new ModuleCall("C",
						"Player2", new int[] {91,10,91,59},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("received message from "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "sender"),
									Primitive.newPrimitive("!")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player2","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Player2", new int[] {92,10,99,6},
						new Predicate("spot", new Term[] {
							new Variable(Type.INTEGER, "Sq"),
							Primitive.newPrimitive("free")
						})
					),
					new BeliefUpdate('+',
						"Player2", new int[] {93,10,99,6},
						new Predicate("spot", new Term[] {
							new Variable(Type.INTEGER, "Sq"),
							new Variable(Type.STRING, "T")
						})
					),
					new Query(
						"Player2", new int[] {94,10,94,34},
						new Predicate("token", new Term[] {
							new Variable(Type.STRING, "tok",false)
						})
					),
					new If(
						"Player2", new int[] {95,10,99,6},
						new Comparison("==",
							new QueryTerm(
								new Predicate("winner", new Term[] {
									new Variable(Type.STRING, "T")
								})
							),
							Primitive.newPrimitive(false)
						),
						new Block(
							"Player2", new int[] {95,39,97,11},
							new Statement[] {
								new BeliefUpdate('+',
									"Player2", new int[] {96,15,97,11},
									new Predicate("turn", new Term[] {
										new Variable(Type.STRING, "tok")
									})
								)
							}
						),
						new Block(
							"Player2", new int[] {98,14,99,6},
							new Statement[] {
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player2", new int[] {101,10,101,49},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("end", new Term[] {})
			),
			Predicate.TRUE,
			new Block(
				"Player2", new int[] {101,48,103,6},
				new Statement[] {
					new BeliefUpdate('+',
						"Player2", new int[] {102,10,103,6},
						new Predicate("end", new Term[] {})
					)
				}
			)
		));
		addRule(new Rule(
			"Player2", new int[] {105,10,105,17},
			new BeliefEvent('+',
				new Predicate("end", new Term[] {})
			),
			Predicate.TRUE,
			new Block(
				"Player2", new int[] {105,16,110,6},
				new Statement[] {
					new ForEach(
						"Player2", new int[] {106,10,110,6},
						new Predicate("spot", new Term[] {
							new Variable(Type.INTEGER, "Sq",false),
							Primitive.newPrimitive("free")
						}),
						new Block(
							"Player2", new int[] {106,40,109,11},
							new Statement[] {
								new BeliefUpdate('-',
									"Player2", new int[] {107,15,109,11},
									new Predicate("spot", new Term[] {
										new Variable(Type.INTEGER, "Sq"),
										Primitive.newPrimitive("free")
									})
								),
								new BeliefUpdate('+',
									"Player2", new int[] {108,15,109,11},
									new Predicate("spot", new Term[] {
										new Variable(Type.INTEGER, "Sq"),
										Primitive.newPrimitive("done")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player2", new int[] {113,10,113,24},
			new BeliefEvent('+',
				new Predicate("free", new Term[] {
					new Variable(Type.INTEGER, "Sq",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player2", new int[] {113,23,116,6},
				new Statement[] {
					new ModuleCall("C",
						"Player2", new int[] {114,10,114,36},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.INTEGER, "Sq"),
								Primitive.newPrimitive(" is free")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player2","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player2", new int[] {120,10,120,50},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "token",false),
							new Variable(Type.STRING, "opponent",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player2", new int[] {120,49,148,11},
				new Statement[] {
					new ModuleCall("C",
						"Player2", new int[] {121,10,121,51},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Game has not started yet....")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player2","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"Player2", new int[] {122,10,148,11},
						new Predicate("opponent", new Term[] {
							new Variable(Type.STRING, "opponent")
						})
					),
					new BeliefUpdate('+',
						"Player2", new int[] {123,10,148,11},
						new Predicate("token", new Term[] {
							new Variable(Type.STRING, "token")
						})
					),
					new Wait(
						"Player2", new int[] {125,10,148,11},
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(1)
						})
					),
					new If(
						"Player2", new int[] {127,10,148,11},
						new Comparison("==",
							new Variable(Type.STRING, "token"),
							Primitive.newPrimitive("O")
						),
						new Block(
							"Player2", new int[] {127,27,129,16},
							new Statement[] {
								new BeliefUpdate('+',
									"Player2", new int[] {128,15,129,16},
									new Predicate("turn", new Term[] {
										new Variable(Type.STRING, "token")
									})
								)
							}
						),
						new Block(
							"Player2", new int[] {130,15,148,11},
							new Statement[] {
							}
						)
					),
					new Wait(
						"Player2", new int[] {132,10,148,11},
						new NOT(
							new Predicate("free", new Term[] {
								new Variable(Type.INTEGER, "Sq",false)
							})
						)
					),
					new ModuleCall("C",
						"Player2", new int[] {133,10,133,34},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("table full!")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player2","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Player2", new int[] {135,10,148,11},
						new Predicate("drawn", new Term[] {
							new Variable(Type.STRING, "X",false)
						}),
						new Block(
							"Player2", new int[] {135,30,137,11},
							new Statement[] {
								new ModuleCall("C",
									"Player2", new int[] {136,15,136,35},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("DRAW!!!")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player2","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						),
						new If(
							"Player2", new int[] {138,15,148,11},
							new Predicate("winner", new Term[] {
								new Variable(Type.STRING, "Y",false)
							}),
							new Block(
								"Player2", new int[] {138,36,147,11},
								new Statement[] {
									new ModuleCall("C",
										"Player2", new int[] {139,15,139,42},
										new Predicate("println", new Term[] {
											Operator.newOperator('+',
												Primitive.newPrimitive("Winner is "),
												new Variable(Type.STRING, "Y")
											)
										}),
										new DefaultModuleCallAdaptor() {
											public boolean inline() {
												return true;
											}

											public boolean invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Console) intention.getModule("Player2","C")).println(
													(java.lang.String) intention.evaluate(predicate.getTerm(0))
												);
											}
										}
									),
									new If(
										"Player2", new int[] {140,15,147,11},
										new Comparison("==",
											new Variable(Type.STRING, "Y"),
											Primitive.newPrimitive("O")
										),
										new Block(
											"Player2", new int[] {140,28,142,16},
											new Statement[] {
												new ModuleCall("C",
													"Player2", new int[] {141,15,141,38},
													new Predicate("println", new Term[] {
														Primitive.newPrimitive("Loser is X")
													}),
													new DefaultModuleCallAdaptor() {
														public boolean inline() {
															return true;
														}

														public boolean invoke(Intention intention, Predicate predicate) {
															return ((astra.lang.Console) intention.getModule("Player2","C")).println(
																(java.lang.String) intention.evaluate(predicate.getTerm(0))
															);
														}
													}
												)
											}
										),
										new If(
											"Player2", new int[] {143,20,147,11},
											new Comparison("==",
												new Variable(Type.STRING, "Y"),
												Primitive.newPrimitive("X")
											),
											new Block(
												"Player2", new int[] {143,33,146,16},
												new Statement[] {
													new ModuleCall("C",
														"Player2", new int[] {144,20,144,43},
														new Predicate("println", new Term[] {
															Primitive.newPrimitive("Loser is O")
														}),
														new DefaultModuleCallAdaptor() {
															public boolean inline() {
																return true;
															}

															public boolean invoke(Intention intention, Predicate predicate) {
																return ((astra.lang.Console) intention.getModule("Player2","C")).println(
																	(java.lang.String) intention.evaluate(predicate.getTerm(0))
																);
															}
														}
													)
												}
											)
										)
									)
								}
							)
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("spot", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive("free")
			})
		);
		agent.initialize(
			new Predicate("spot", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive("free")
			})
		);
		agent.initialize(
			new Predicate("spot", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive("free")
			})
		);
		agent.initialize(
			new Predicate("spot", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive("free")
			})
		);
		agent.initialize(
			new Predicate("spot", new Term[] {
				Primitive.newPrimitive(5),
				Primitive.newPrimitive("free")
			})
		);
		agent.initialize(
			new Predicate("spot", new Term[] {
				Primitive.newPrimitive(6),
				Primitive.newPrimitive("free")
			})
		);
		agent.initialize(
			new Predicate("spot", new Term[] {
				Primitive.newPrimitive(7),
				Primitive.newPrimitive("free")
			})
		);
		agent.initialize(
			new Predicate("spot", new Term[] {
				Primitive.newPrimitive(8),
				Primitive.newPrimitive("free")
			})
		);
		agent.initialize(
			new Predicate("spot", new Term[] {
				Primitive.newPrimitive(9),
				Primitive.newPrimitive("free")
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(6),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(7),
				Primitive.newPrimitive(8),
				Primitive.newPrimitive(9)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("sys",astra.lang.System.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Player2().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
