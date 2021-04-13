package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlesheatingGhoul_69680 : Card() {
    override val id = 69680
    override val name = "腐肉食尸鬼"
    override val description = "每当一个随从死亡，便获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "诟病食尸鬼吃“腐肉”其实对它们并不公平，它们只是没有别的可吃了而已。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7fbbb4ed64b0237cf8bc95a5acf96406a101e73f08db88d1f01975ddf66b6e79.png"
}
