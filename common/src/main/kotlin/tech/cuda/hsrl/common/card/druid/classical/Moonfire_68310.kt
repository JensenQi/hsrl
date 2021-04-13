package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Moonfire_68310 : Card() {
    override val id = 68310
    override val name = "月火术"
    override val description = "造成 1点伤害。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "“把月火术拖到每一个技能栏位上。”——《如何成为一名德鲁伊》，第五章，第三节"
    override val artist = "Richard Wright"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3f22179ad518000aaf4e4790ed35d78b14d3f891dfdf1955125ad2f019ba40a.png"
}
