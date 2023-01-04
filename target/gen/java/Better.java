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


public class Better extends ASTRAClass {
	public Better() {
		setParents(new Class[] {Player2.class});
		addRule(new Rule(
			"Better", new int[] {8,10,8,108},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("free", new Term[] {
					Primitive.newPrimitive(1)
				}),
				new AND(
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(2)
					}),
					new AND(
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(3)
						}),
						new AND(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(4)
							}),
							new AND(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(5)
								}),
								new AND(
									new Predicate("free", new Term[] {
										Primitive.newPrimitive(6)
									}),
									new AND(
										new Predicate("free", new Term[] {
											Primitive.newPrimitive(7)
										}),
										new AND(
											new Predicate("free", new Term[] {
												Primitive.newPrimitive(8)
											}),
											new Predicate("free", new Term[] {
												Primitive.newPrimitive(9)
											})
										)
									)
								)
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {8,107,8,120},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {8,108,8,120},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(4)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {12,10,12,37},
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
				"Better", new int[] {12,36,12,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {12,37,12,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(5)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {13,10,13,54},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					})
				),
				new NOT(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					})
				)
			),
			new Block(
				"Better", new int[] {13,53,13,66},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {13,54,13,66},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {15,10,15,53},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					})
				),
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(4),
					new Variable(Type.STRING, "T")
				})
			),
			new Block(
				"Better", new int[] {15,52,15,65},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {15,53,15,65},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {18,10,18,73},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					})
				),
				new AND(
					new NOT(
						new Predicate("spot", new Term[] {
							Primitive.newPrimitive(4),
							new Variable(Type.STRING, "T")
						})
					),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(4)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(6)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {18,72,18,85},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {18,73,18,85},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(6)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {19,10,19,73},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					})
				),
				new AND(
					new NOT(
						new Predicate("spot", new Term[] {
							Primitive.newPrimitive(4),
							new Variable(Type.STRING, "T")
						})
					),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(2)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(8)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {19,72,19,85},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {19,73,19,85},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(8)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {20,10,20,73},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					})
				),
				new AND(
					new NOT(
						new Predicate("spot", new Term[] {
							Primitive.newPrimitive(4),
							new Variable(Type.STRING, "T")
						})
					),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(4)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {20,72,20,85},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {20,73,20,85},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(4)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {23,10,23,72},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					})
				),
				new AND(
					new NOT(
						new Predicate("spot", new Term[] {
							Primitive.newPrimitive(4),
							new Variable(Type.STRING, "T")
						})
					),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(7)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(1)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {23,71,23,84},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {23,72,23,84},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {24,10,24,72},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					})
				),
				new AND(
					new NOT(
						new Predicate("spot", new Term[] {
							Primitive.newPrimitive(4),
							new Variable(Type.STRING, "T")
						})
					),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(8)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(2)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {24,71,24,84},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {24,72,24,84},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(2)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {25,10,25,72},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					})
				),
				new AND(
					new NOT(
						new Predicate("spot", new Term[] {
							Primitive.newPrimitive(4),
							new Variable(Type.STRING, "T")
						})
					),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(9)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(3)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {25,71,25,84},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {25,72,25,84},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {29,10,29,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(5),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(6)
					})
				)
			),
			new Block(
				"Better", new int[] {29,60,29,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {29,61,29,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(6)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {30,10,30,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(5),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new AND(
							new NOT(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(2)
								})
							),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(3)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {30,79,30,92},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {30,80,30,92},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {31,10,31,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(5),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new AND(
							new NOT(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(8)
								})
							),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(9)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {31,79,31,92},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {31,80,31,92},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(9)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {33,10,33,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(5),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new AND(
							new NOT(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(3)
								})
							),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(9)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {33,79,33,92},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {33,80,33,92},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(9)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {34,10,34,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(5),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new AND(
							new NOT(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(9)
								})
							),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(3)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {34,79,34,92},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {34,80,34,92},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {36,10,36,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(5),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new AND(
							new NOT(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(3)
								})
							),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(9)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {36,79,36,92},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {36,80,36,92},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(9)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {37,10,37,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(5),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new AND(
							new NOT(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(9)
								})
							),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(3)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {37,79,37,92},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {37,80,37,92},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {39,10,39,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(5),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new AND(
							new NOT(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(7)
								})
							),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(9)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {39,79,39,92},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {39,80,39,92},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(9)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {40,10,40,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(5),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new AND(
							new NOT(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(1)
								})
							),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(3)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {40,79,40,92},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {40,80,40,92},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {43,10,43,70},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(4),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(3),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(1)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(9)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {43,69,43,82},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {43,70,43,82},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(9)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {44,10,44,70},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(4),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(3),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(2)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(8)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {44,69,44,82},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {44,70,44,82},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(8)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {45,10,45,70},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(4),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(3),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(8)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(2)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {45,69,45,82},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {45,70,45,82},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(2)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {46,10,46,70},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(4),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(3),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(9)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(1)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {46,69,46,82},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {46,70,46,82},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {49,10,49,70},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(4),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(3),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(6)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(1)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {49,69,49,82},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {49,70,49,82},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {50,10,50,70},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(4),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(3),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(7)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(9)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {50,69,50,82},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {50,70,50,82},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(9)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {56,10,56,79},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(9),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(7)
							})
						),
						new AND(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(1)
							}),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(1)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {56,78,56,91},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {56,79,56,91},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {57,10,57,79},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(9),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(1)
							})
						),
						new AND(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(7)
							}),
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(7)
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {57,78,57,91},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {57,79,57,91},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(7)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {60,10,60,71},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(9),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(7)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(2)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {60,70,60,83},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {60,71,60,83},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(2)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {62,10,62,71},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(9),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(2)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(1)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {62,70,62,83},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {62,71,62,83},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {63,10,63,71},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(3),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(8)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(7)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {63,70,63,83},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {63,71,63,83},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(7)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {65,10,65,71},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(9),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(2)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(1)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {65,70,65,83},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {65,71,65,83},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {66,10,66,71},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(3),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(4),
						new Variable(Type.STRING, "T")
					}),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(8)
							})
						),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(7)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {66,70,66,83},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {66,71,66,83},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(7)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {71,10,71,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(2),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(8)
					})
				)
			),
			new Block(
				"Better", new int[] {71,60,71,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {71,61,71,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(8)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {72,10,72,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(8),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(5),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(2)
					})
				)
			),
			new Block(
				"Better", new int[] {72,60,72,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {72,61,72,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(2)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {74,10,74,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(4),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(1),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(7)
					})
				)
			),
			new Block(
				"Better", new int[] {74,60,74,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {74,61,74,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(7)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {75,10,75,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(4),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(7),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(1)
					})
				)
			),
			new Block(
				"Better", new int[] {75,60,75,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {75,61,75,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {77,10,77,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(6),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(3),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(9)
					})
				)
			),
			new Block(
				"Better", new int[] {77,60,77,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {77,61,77,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(9)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {78,10,78,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(6),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(9),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(2)
					})
				)
			),
			new Block(
				"Better", new int[] {78,60,78,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {78,61,78,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {79,10,79,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(3),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(9),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(6)
					})
				)
			),
			new Block(
				"Better", new int[] {79,60,79,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {79,61,79,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(6)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {81,10,81,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(1),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(3),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(2)
					})
				)
			),
			new Block(
				"Better", new int[] {81,60,81,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {81,61,81,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(2)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {82,10,82,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(1),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(2),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(3)
					})
				)
			),
			new Block(
				"Better", new int[] {82,60,82,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {82,61,82,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {83,10,83,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(3),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(2),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(1)
					})
				)
			),
			new Block(
				"Better", new int[] {83,60,83,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {83,61,83,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {85,10,85,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(7),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(8),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(9)
					})
				)
			),
			new Block(
				"Better", new int[] {85,60,85,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {85,61,85,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(9)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {86,10,86,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(7),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(9),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(8)
					})
				)
			),
			new Block(
				"Better", new int[] {86,60,86,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {86,61,86,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(8)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {87,10,87,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new AND(
				new Predicate("spot", new Term[] {
					Primitive.newPrimitive(8),
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("spot", new Term[] {
						Primitive.newPrimitive(9),
						new Variable(Type.STRING, "T")
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(7)
					})
				)
			),
			new Block(
				"Better", new int[] {87,60,87,73},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {87,61,87,73},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(7)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {89,10,89,37},
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
				"Better", new int[] {89,36,89,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {89,37,89,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(1)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {90,10,90,37},
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
				"Better", new int[] {90,36,90,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {90,37,90,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(2)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {91,10,91,37},
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
				"Better", new int[] {91,36,91,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {91,37,91,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(3)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {92,10,92,37},
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
				"Better", new int[] {92,36,92,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {92,37,92,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(4)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {93,10,93,37},
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
				"Better", new int[] {93,36,93,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {93,37,93,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(5)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {94,10,94,37},
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
				"Better", new int[] {94,36,94,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {94,37,94,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(6)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {95,10,95,37},
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
				"Better", new int[] {95,36,95,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {95,37,95,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(7)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {96,10,96,37},
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
				"Better", new int[] {96,36,96,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {96,37,96,49},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "T"),
							Primitive.newPrimitive(8)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {97,10,97,37},
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
				"Better", new int[] {97,36,97,49},
				new Statement[] {
					new BeliefUpdate('+',
						"Better", new int[] {97,37,97,49},
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
			astra.core.Agent agent = new Better().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
