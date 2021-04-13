package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneFlakmage_53822 : Card() {
    override val id = 53822
    override val name = "对空奥术法师"
    override val description = "在你使用一张<b>奥秘</b>牌后，对所有敌方随从造成2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "熊猫人旧谚：人无奥秘，顶无遮蔽。"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/43054f0e8a69b24c44cf5b32089b3e774f6d891d2064408b1bb4127cea8862f3.png"
}
