package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkOfTheLotus_40397 : Card() {
    override val id = 40397
    override val name = "玉莲印记"
    override val description = "使你所有的随从获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "玉莲印记通常都纹在脚踝处，看上去既神秘又时尚。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1b800bc72de385037e6a5974ee46898bdc23c7f2199d13683d3dc859d5c3cd47.png"
}
