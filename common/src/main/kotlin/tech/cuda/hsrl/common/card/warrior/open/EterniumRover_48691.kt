package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EterniumRover_48691 : Card() {
    override val id = 48691
    override val name = "恒金巡游者"
    override val description = "每当该随从受到伤害，便获得2点 护甲值。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "你以为他在对你点头微笑？你在他眼里不过是一堆人形废铁罢了。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/622a38c725b632053b6c3ff5c18c286602c3352cb4fa1d967380d956a1cf1b79.png"
}
