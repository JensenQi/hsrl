package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlesheatingGhoul_70101 : Card() {
    override val id = 70101
    override val name = "腐肉食尸鬼"
    override val description = "每当一个随从死亡，便获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "诟病食尸鬼吃“腐肉”其实对它们并不公平，它们只是没有别的可吃了而已。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/630e508f86cb6160a46f94a5333fd6d019124fc8f799ab88af6d0b5e3eec68d4.png"
}
