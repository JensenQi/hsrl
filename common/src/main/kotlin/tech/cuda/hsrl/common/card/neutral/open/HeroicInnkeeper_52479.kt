package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HeroicInnkeeper_52479 : Card() {
    override val id = 52479
    override val name = "霸气的旅店老板娘"
    override val description = "<b>嘲讽，战吼：</b>每有一个其他友方随从，便获得+2/+2。"
    override var cost: Int? = 8
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "我们保留拒绝服务任何1/1随从的权利。"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d4d1c9d0df4d524bf3bad3e901aac70bd1441bab0a10d3ba29ecb8a59a9b0ca1.png"
}
