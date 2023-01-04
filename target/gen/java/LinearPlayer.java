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


public class LinearPlayer extends ASTRAClass {
	public LinearPlayer() {
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"LinearPlayer", new int[] {3,10,3,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"LinearPlayer", new int[] {3,36,3,49},
				new Statement[] {
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {3,37,3,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {4,10,4,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"LinearPlayer", new int[] {4,36,4,49},
				new Statement[] {
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {4,37,4,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(2)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {5,10,5,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"LinearPlayer", new int[] {5,36,5,49},
				new Statement[] {
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {5,37,5,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {6,10,6,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"LinearPlayer", new int[] {6,36,6,49},
				new Statement[] {
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {6,37,6,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(4)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {7,10,7,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"LinearPlayer", new int[] {7,36,7,49},
				new Statement[] {
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {7,37,7,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(5)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {8,10,8,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"LinearPlayer", new int[] {8,36,8,49},
				new Statement[] {
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {8,37,8,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(6)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {9,10,9,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"LinearPlayer", new int[] {9,36,9,49},
				new Statement[] {
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {9,37,9,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(7)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {10,10,10,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"LinearPlayer", new int[] {10,36,10,49},
				new Statement[] {
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {10,37,10,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(8)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {11,10,11,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"LinearPlayer", new int[] {11,36,11,49},
				new Statement[] {
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {11,37,11,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(9)
						})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
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
			astra.core.Agent agent = new LinearPlayer().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
