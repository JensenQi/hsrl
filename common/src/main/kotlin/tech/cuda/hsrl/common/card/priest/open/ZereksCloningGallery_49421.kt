package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZereksCloningGallery_49421 : Card() {
    override val id = 49421
    override val name = "泽里克的克隆展"
    override val description = "召唤你的牌库中每一个随从的1/1复制。"
    override var cost: Int? = 9
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "挤在罐头里的感觉真是太糟糕了。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/93b289d33efb9d3da692d28194d60c8f17d6d2f26d1919a607440ff30d6882f6.png"
}
