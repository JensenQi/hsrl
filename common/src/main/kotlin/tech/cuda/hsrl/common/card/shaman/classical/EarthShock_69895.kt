package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthShock_69895 : Card() {
    override val id = 69895
    override val name = "大地震击"
    override val description = "<b>沉默</b>一个随从，然后对其造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "大地震击？确切地说，就是“艾泽拉斯震击”吗？"
    override val artist = "Kevin Chen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fe67ad65be6224c47ed871873576a4476ea94d1e582efaba6f435857d66f230d.png"
}
