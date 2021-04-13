package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Windfury_69515 : Card() {
    override val id = 69515
    override val name = "风怒"
    override val description = "使一个随从获得<b>风怒</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "比起“地怒”或是“火怒”，萨满们更喜欢使用“风怒”，因为它更轻巧，更飘逸。"
    override val artist = "Justin Sweet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7eaf1bd515f22ce2310db5fc16dfc1748f76fa6a6bc2dee3fda19ce835af4003.png"
}
