package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarnassusAspirant_2782 : Card() {
    override val id = 2782
    override val name = "达纳苏斯豹骑士"
    override val description = "<b>战吼：</b>获得一个空的法力水晶。 <b>亡语：</b>失去一个法力水晶。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Tgt
    override val background = "她对法力水晶是又爱又恨。女人心，海底针！"
    override val artist = "Laurel Austin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa3fb0ec93940cce0c6a8d2adcedb8e6f039cc2611748d7e4d8e986f3975fe8b.png"
}
