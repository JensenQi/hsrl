package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoneguardLieutenant_2495 : Card() {
    override val id = 2495
    override val name = "白骨卫士军官"
    override val description = "<b>激励：</b> 获得+1生命值。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "厚实的盔甲下其实只有皮包骨头。好吧，连皮都没有，只有骨头。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c0f096ed244203aeb45bb859748378b41a094e95a60506ee5a02ea4c66149b5.png"
}
