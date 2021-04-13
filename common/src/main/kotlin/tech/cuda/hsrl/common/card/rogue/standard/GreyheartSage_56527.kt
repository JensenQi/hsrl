package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GreyheartSage_56527 : Card() {
    override val id = 56527
    override val name = "暗心贤者"
    override val description = "<b>战吼：</b>如果你控制一个<b>潜行</b>的随从，抽两张牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "为我们的友谊干杯。"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9659f61a3c036b92bd694ee66c37cd709b2d510526d76ae4a5af560258c09824.png"
}
