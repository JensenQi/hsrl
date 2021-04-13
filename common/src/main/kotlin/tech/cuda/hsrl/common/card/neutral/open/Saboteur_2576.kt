package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Saboteur_2576 : Card() {
    override val id = 2576
    override val name = "破坏者"
    override val description = "<b>战吼：</b>下个回合敌方英雄技能的法力值消耗增加（5）点。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "无敌破坏王！"
    override val artist = "Greg Staples"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e2c86bf0031909c2001ce719f989737f4de986700791213257c236122657c78b.png"
}
