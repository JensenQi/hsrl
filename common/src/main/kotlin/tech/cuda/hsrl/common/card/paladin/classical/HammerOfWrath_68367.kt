package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HammerOfWrath_68367 : Card() {
    override val id = 68367
    override val name = "愤怒之锤"
    override val description = "造成 3点伤害。抽一张牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "一个称职的圣骑士身上会携带很多工具。愤怒之锤、复仇之钳、正义之锯，等等。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e1d06fc1dab98789baed13f7a22c6f4ff6b5560787345681fa421b67af106f7.png"
}
