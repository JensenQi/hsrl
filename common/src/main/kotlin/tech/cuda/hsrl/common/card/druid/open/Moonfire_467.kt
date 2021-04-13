package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Moonfire_467 : Card() {
    override val id = 467
    override val name = "月火术"
    override val description = "造成 1点伤害。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "“把月火术拖到每一个技能栏位上。”——《如何成为一名德鲁伊》，第五章，第三节"
    override val artist = "Richard Wright"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81940e80b65d36fe51f8216ff015b7493b44e1c95004179947ca7180e41ec4b2.png"
}
