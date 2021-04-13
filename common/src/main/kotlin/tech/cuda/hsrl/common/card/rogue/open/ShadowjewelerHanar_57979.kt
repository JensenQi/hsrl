package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowjewelerHanar_57979 : Card() {
    override val id = 57979
    override val name = "暗影珠宝师汉纳尔"
    override val description = "在你使用一张<b>奥秘</b>牌后，<b>发现</b>一张不同职业的<b>奥秘</b>牌。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "小朋友，你是否有很多问号？"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/29a6d0f8c44973c0dfd3f303c3f31b4b2b546287954ea101498f528a010f9549.png"
}
