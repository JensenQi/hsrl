package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZayleShadowCloak_56047 : Card() {
    override val id = 56047
    override val name = "泽尔，暗影斗篷"
    override val description = "你改用泽尔的一副怪盗套牌来开始对战！"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "怪盗军团，引领潮流的黑色组织。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/89f3252191c8005e76c27d6f11b4a9851d6cd5c0ce27690dc4df808cb72636e2.png"
}
