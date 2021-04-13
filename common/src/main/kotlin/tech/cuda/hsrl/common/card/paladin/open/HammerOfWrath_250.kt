package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HammerOfWrath_250 : Card() {
    override val id = 250
    override val name = "愤怒之锤"
    override val description = "造成 3点伤害。抽一张牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy1635
    override val background = "一个称职的圣骑士身上会携带很多工具。愤怒之锤、复仇之钳、正义之锯，等等。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c1c1e95eaccc7f4c34087513801374e06230295f138e241827fc2e0c9f51cf8.png"
}
