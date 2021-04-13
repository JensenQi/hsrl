package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PatchesThePirate_40465 : Card() {
    override val id = 40465
    override val name = "海盗帕奇斯"
    override val description = "在你使用一张海盗牌后，从你的牌库中召唤该随从。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "船长因为帕奇斯能眼观六路，耳听八方的能力将其招揽。唯一的问题是，他走过的甲板老是黏糊糊的，清理起来特别麻烦。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c9fff75dd31e94af103045632c520ef7916055e6b4d1af16f9ca87665dd519f.png"
}
