package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShiftingShade_39034 : Card() {
    override val id = 39034
    override val name = "变幻之影"
    override val description = "<b>亡语：</b>复制你对手的牌库中的一张牌，并将其置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Wotog
    override val background = "看！这是我的胸肌，这是我的马甲线，这是我的……我的肚子去哪儿了？"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3ae9f9d6931f9850f09a0ce6ce2c7e797eece56c096e7830d7feb358bed3c9c0.png"
}
