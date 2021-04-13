package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BurglyBully_40954 : Card() {
    override val id = 40954
    override val name = "穴居人强盗"
    override val description = "每当你的对手施放一个法术，将一个幸运币置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "他其实并不在意钱，就是爱抢东西。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7961364429af631327051cde6e407e6e9c3dab00e7375cc45604a70b5a40b3b9.png"
}
