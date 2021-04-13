package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HemetNesingwary_2088 : Card() {
    override val id = 2088
    override val name = "赫米特·奈辛瓦里"
    override val description = "<b>战吼：</b> 消灭一个野兽。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "作为一个野兽公敌来说，在这个世界里活下来是非常不容易的。因为你在几分钟前杀死的野兽，会突然再次不知道从哪儿冒出来……"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cb8bf4754e957bf20e702a3a3f8c27fd339bda9665f0dfbc4ee5d6de71e22647.png"
}
