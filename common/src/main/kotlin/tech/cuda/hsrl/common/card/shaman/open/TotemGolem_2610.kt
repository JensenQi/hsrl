package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TotemGolem_2610 : Card() {
    override val id = 2610
    override val name = "图腾魔像"
    override val description = "<b>过载：</b>（1）"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Tgt
    override val background = "当你把一堆图腾绑在一起时，图腾魔像就诞生了。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa15dfa931ac6a5cabf5fb9ea299513d07538639c1ee4a67ecc9d5cc7ae50208.png"
}
