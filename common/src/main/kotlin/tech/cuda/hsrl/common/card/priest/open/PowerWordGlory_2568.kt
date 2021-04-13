package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerWordGlory_2568 : Card() {
    override val id = 2568
    override val name = "真言术：耀"
    override val description = "选择一个随从。每当其进行攻击，为你的英雄恢复 4点生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Tgt
    override val background = "对于一个随从而言，许之以无尚的荣耀，比给家冰淇淋店什么的来得有劲多了！"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e43707a14d568af389c750fd0ccc840111f547036abcd4b3104c844de202810.png"
}
