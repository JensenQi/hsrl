package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BrannBronzebeard_2949 : Card() {
    override val id = 2949
    override val name = "布莱恩·铜须"
    override val description = "你的<b>战吼</b>会触发 两次。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "自从铁炉堡的国王麦格尼华丽登场后，布莱恩也想像哥哥那样出一套英雄皮肤。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d30479f631a8a962d588e477ad64ca1f81d81719f7bfee76665c52053b1a9647.png"
}
