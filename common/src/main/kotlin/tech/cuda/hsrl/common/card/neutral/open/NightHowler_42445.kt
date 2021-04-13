package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NightHowler_42445 : Card() {
    override val id = 42445
    override val name = "暗夜嗥狼"
    override val description = "每当该随从受到伤害，便获得 +2攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "老实说，其实他大白天也在嗥叫。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81d87411311bcc2bb1d652945a8297ac002d1fa9d4fe4db4940763e401adad6c.png"
}
