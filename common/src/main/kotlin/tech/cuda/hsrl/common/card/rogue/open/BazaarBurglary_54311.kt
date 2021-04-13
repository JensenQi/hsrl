package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BazaarBurglary_54311 : Card() {
    override val id = 54311
    override val name = "劫掠集市"
    override val description = "<b>任务：</b>将4张其他职业的卡牌置入你的手牌。 <b>奖励：</b>远古刀锋。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "你想想，你带着招牌，到了集市，“纯天然香薰蜡烛”，突然就被愚蠢的狗头人劫了！"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/411ee6c5b271dfeb4ca6fc2fca94cf8bb8f1a9e7b2c84420fa1c1c724afb4602.png"
}
