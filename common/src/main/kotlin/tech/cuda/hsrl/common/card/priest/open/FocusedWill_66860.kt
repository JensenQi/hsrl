package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FocusedWill_66860 : Card() {
    override val id = 66860
    override val name = "专注意志"
    override val description = "<b>沉默</b>一个随从，然后使其获得+3生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "高度集中注意，不如有劳有逸。"
    override val artist = "Dave Greco"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d0c8b638a6500d019028f42264f7e3f0dfa8fd39681f234accca37c66d35b814.png"
}
