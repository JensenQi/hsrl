package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerOfTheWild_503 : Card() {
    override val id = 503
    override val name = "野性之力"
    override val description = "<b>抉择：</b>使你的所有随从获得+1/+1；或者召唤一只3/2的 猎豹。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "在灰谷的树林中，猎豹的毛皮漆黑油亮，数量众多。那为什么这地方要叫灰谷，而不是黑谷呢？"
    override val artist = "Steve Tappin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a67c334212520ee7c8f20eec171c4e656a0171a60774c2093de243efd46da8f.png"
}
