package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Chromaggus_2280 : Card() {
    override val id = 2280
    override val name = "克洛玛古斯"
    override val description = "每当你抽一张牌时，将该牌的另一张复制置入你的手牌。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "当两个头都无法说服对方晚餐到底吃什么的时候，它通常都会去拉面店解决问题。"
    override val artist = "Todd Lockwood"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ea57e96e447e7d714bf77261960fb6406ce400c0f072b1e9b27731e35b7722a.png"
}
