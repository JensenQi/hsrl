package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AstralRift_47978 : Card() {
    override val id = 47978
    override val name = "星界裂隙"
    override val description = "随机将两张随从牌置入你的 手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "让我们来看看一号裂隙的后面藏着什么！"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e2db61a7be9b952a216559e79e3437d6a4c273b462432c5664dcbcbee4dc8b0.png"
}
