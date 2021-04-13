package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThrowGlaive_61131 : Card() {
    override val id = 61131
    override val name = "投掷利刃"
    override val description = "对一个随从造成 2点伤害。如果该随从死亡，则将此牌的一张临时复制置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“停，停，我是让你偷一支利刃！”"
    override val artist = "Matt O'Connor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1d8f05a2c8508b508b756d0c8dc41213acf10c9cf465397f289da89baa8f60cb.png"
}
