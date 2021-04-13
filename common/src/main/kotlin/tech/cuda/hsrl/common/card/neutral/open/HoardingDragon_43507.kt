package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HoardingDragon_43507 : Card() {
    override val id = 43507
    override val name = "藏宝巨龙"
    override val description = "<b>亡语：</b>使你的对手获得两个幸运币。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "找给你的硬币，不用谢。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/38613ace81d6bbc697d9593e34d6daa92d9ab99b0cefb3380c7dc721659943b0.png"
}
