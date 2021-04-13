package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheVoraxx_41913 : Card() {
    override val id = 41913
    override val name = "沃拉斯"
    override val description = "在你对该随从施放一个法术后，召唤一个1/1的植物，并对其施放相同的法术。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "我是沃拉斯，我为自己代言。"
    override val artist = "Jimmy Lo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8244ab44bc53134894208e2471117bb56cbc990e08b2c0746603ba56f29f6fd9.png"
}
